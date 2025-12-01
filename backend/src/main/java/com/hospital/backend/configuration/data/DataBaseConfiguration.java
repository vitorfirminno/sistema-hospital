package com.hospital.backend.configuration.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;


import javax.sql.DataSource;

@Configuration
public class DataBaseConfiguration {

    @Primary
    @Bean(name = "getHospitalDataSourceConfiguration")
    @ConfigurationProperties(prefix = "spring.hospital")
    public DataSource getHospitalDataSourceConfiguration(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "getHospitalJdbcClient")
    public JdbcClient getHospitalJdbcClient(@Qualifier("getHospitalDataSourceConfiguration") DataSource dataSource){
        return JdbcClient.create(dataSource);
    }


}

