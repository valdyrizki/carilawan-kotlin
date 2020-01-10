package com.vrizki.carilawankotlin

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
//@EnableJpaAuditing
//@EnableAutoConfiguration(exclude = arrayOf(DataSourceAutoConfiguration::class))
class CarilawanKotlinApplication

fun main(args: Array<String>) {
	runApplication<CarilawanKotlinApplication>(*args)
}
