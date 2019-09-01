package net.progruzovik.dissent

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

inline fun <reified T> getLogger(): Logger = LoggerFactory.getLogger(T::class.java)
