package com.exampl.zgd.dynamicdatasource2.datasource.aop;

import com.exampl.zgd.dynamicdatasource2.datasource.DynamicDataSource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAspect implements Ordered {
    @Pointcut("@annotation(com.exampl.zgd.dynamicdatasource2.datasource.CurDataSource)")
    public void dataSourcePointCut() {

    }

    @Around("dataSourcePointCut()")
    public Object around(ProceedingJoinPoint point) {
        DynamicDataSource.setDataSource("secondary");
        try {
            return point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            DynamicDataSource.clearDataSource();
        }
        return null;
    }

    @Override
    public int getOrder() {
        return 1;
    }


}
