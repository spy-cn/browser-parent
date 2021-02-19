package com.spy.databrowser.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author lei.zhao_ext
 * @Date 2021/2/19
 */
@Configuration
public class DataSourceConfig {
    @Bean(name="dataScope")
    @ConfigurationProperties(prefix = "spring.datasource.datascope")
    public DataSource jdCompanyDs(){
        return DataSourceBuilder.create().build();
    }
}
