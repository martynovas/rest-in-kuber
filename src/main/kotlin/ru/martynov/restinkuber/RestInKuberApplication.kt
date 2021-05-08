package ru.martynov.restinkuber

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestInKuberApplication

fun main(args: Array<String>) {
	runApplication<RestInKuberApplication>(*args)
}
