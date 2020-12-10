package com.example.zgd.datasource.dynamic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据源配置
 * @ConfigurationProperties 注解用于从application。properties文件中读取配置 为bean设置属性
 * @Qualifier
 */
@Configuration
public class DataSourceConfig {

    public DynamicDataSource dataSource(@Qualifier("dbMaster")DataSource dbMaster,
                                        @Qualifier("dbRead")DataSource dbRead){
        DynamicDataSource dynamicDataSource =new DynamicDataSource();
        //设置默认的数据源
        dynamicDataSource.setDefaultTargetDataSource(dbMaster);
        //配置多数据源
        Map<Object,Object> dsMap =new HashMap<>(6);
        dsMap.put("db-master",dbMaster);
        dsMap.put("db-read",dbRead);
        dynamicDataSource.setTargetDataSources(dsMap);
        return dynamicDataSource;
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.db-master")
    public DataSource dbMaster(){
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.db-read")
    public DataSource dbRead(){
        return DataSourceBuilder.create().build();
    }



}
