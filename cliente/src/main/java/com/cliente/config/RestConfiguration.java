package com.cliente.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class RestConfiguration {

    @Bean
    public DataSource getDataSource()
    {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:sqlserver://inss-desa1;databaseName=SIE_DESA");
//        dataSourceBuilder.username("UCEM_IRENE");
//        dataSourceBuilder.password("1234");
        return dataSourceBuilder.build();
    }
}
