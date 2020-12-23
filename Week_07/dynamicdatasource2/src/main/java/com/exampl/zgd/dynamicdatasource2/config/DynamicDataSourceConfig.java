package com.exampl.zgd.dynamicdatasource2.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.exampl.zgd.dynamicdatasource2.datasource.DynamicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DynamicDataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.druid.primary")
    public DataSource primaryDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.secondary")
    public DataSource secondDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    public DynamicDataSource dataSource(DataSource primaryDataSource, DataSource secondDataSource) {
        Map<Object, Object> targetMap = new HashMap<>(2);
        targetMap.put("primary", primaryDataSource);
        targetMap.put("secondary", secondDataSource);
        return new DynamicDataSource(primaryDataSource, targetMap);
    }


}
