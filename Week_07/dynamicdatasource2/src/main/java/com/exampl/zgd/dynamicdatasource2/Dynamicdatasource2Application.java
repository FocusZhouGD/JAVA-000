package com.exampl.zgd.dynamicdatasource2;

import com.exampl.zgd.dynamicdatasource2.config.DynamicDataSourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Import({DynamicDataSourceConfig.class})
@MapperScan("com.exampl.zgd.dynamicdatasource2.mapper")
public class Dynamicdatasource2Application {

    public static void main(String[] args) {
        SpringApplication.run(Dynamicdatasource2Application.class, args);
    }

}
