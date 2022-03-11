package com.rad.sample.springdatar2dbcrdspostgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@EnableR2dbcRepositories
@SpringBootApplication
public class SpringDataR2dbcRdsPostgresApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataR2dbcRdsPostgresApplication.class, args);
    }

}
