package com.ko.playground.basic.config.database.mysql;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"com.ko.playground.basic.infrastructure"})
@EntityScan(basePackages = {"com.ko.playground.basic.infrastructure"})
public class MysqlConfig {}
