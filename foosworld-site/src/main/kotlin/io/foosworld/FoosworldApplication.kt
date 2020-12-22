package io.foosworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FoosworldApplication

fun main(args: Array<String>) {
  runApplication<FoosworldApplication>(*args)
}

