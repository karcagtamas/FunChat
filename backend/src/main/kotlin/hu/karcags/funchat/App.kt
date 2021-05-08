package hu.karcags.funchat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FunchatApplication

fun main(args: Array<String>) {
	runApplication<FunchatApplication>(*args)
}
