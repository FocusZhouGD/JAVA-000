package com.example.zgd.datasource.dynamic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 让spring知道使用动态数据源
 */
@Slf4j
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        log.info("数据源为{}",DataSourceContextHolder.getDBName());
        return DataSourceContextHolder.getDBName();
    }
}
