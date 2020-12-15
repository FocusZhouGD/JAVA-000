package com.example.zgd.datasource.dynamic;






import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


/**
 * 实现aop
 */
@Aspect
@Component
public class DynamicDataSourceAspect {

    @Before("@annotation(com.example.zgd.datasource.dynamic.DBSource)")
    public void beforeSwitchDS(JoinPoint point){
        //获取当前的类
        Class<?> className = point.getTarget().getClass();
        //获取访问的方法名
        String methodName = point.getSignature().getName();
        //得到方法的参数的类型
        Class[] argClass =((MethodSignature)point.getSignature()).getParameterTypes();
        String dataSource = DataSourceContextHolder.DEFAULT_DS;
        try {
            //得到访问的方法对象
            Method method = className.getMethod(methodName, argClass);

            //判断是否存在@DS注解
            if(method.isAnnotationPresent(DBSource.class)){
                DBSource annotation = method.getAnnotation(DBSource.class);
                //取到注解中的数据源名字
                dataSource=annotation.value();

            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        //切换数据源
        DataSourceContextHolder.setDBName(dataSource);

    }

    @After("@annotation(com.example.zgd.datasource.dynamic.DBSource)")
    public void afterSwitchDS(JoinPoint point){
        DataSourceContextHolder.clearDBName();
    }

}
