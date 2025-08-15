package io.vflab.tms

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TmsApplication

fun main(args: Array<String>) {
    runApplication<TmsApplication>(*args)
}