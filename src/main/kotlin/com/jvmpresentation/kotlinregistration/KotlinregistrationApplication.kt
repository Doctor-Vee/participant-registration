package com.jvmpresentation.kotlinregistration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class KotlinregistrationApplication


fun main(args: Array<String>) {
    runApplication<KotlinregistrationApplication>(*args)
    println("Hello world")
    println(3*89)

}
