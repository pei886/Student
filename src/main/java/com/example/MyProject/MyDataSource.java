package com.example.MyProject;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class MyDataSource {

    @Primary
    @Bean
    public DataSource createMyDatasource(){
        DataSourceBuilder dataSourceBuilderbuilder = DataSourceBuilder.create();
        dataSourceBuilderbuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilderbuilder.url("jdbc:postgresql://localhost:5432/yaya");
        dataSourceBuilderbuilder.username("postgres");
        dataSourceBuilderbuilder.password("123456");
        return dataSourceBuilderbuilder.build();
    }
}
