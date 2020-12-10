package com.example.zgd.datasource.dynamic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DataSourceContextHolder {

    /**
     * 默认数据源
     */
    private static final String DEFAULT_DS = "db-master";

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    /**
     * 设置数据源名字
     *
     * @param dbType
     */
    static void setDBName(String dbType) {
        log.info("切换到{}数据源", dbType);
        contextHolder.set(dbType);
    }

    /**
     * 获取数据源名字
     *
     * @return
     */
    static String getDBName() {
        return contextHolder.get();
    }

    /**
     * 清楚数据源名字
     */
    static void clearDBName() {
        contextHolder.remove();
    }

}
