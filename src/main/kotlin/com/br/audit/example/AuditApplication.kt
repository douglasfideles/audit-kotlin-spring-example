package com.br.audit.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
//@EnableJpaAuditing
class AuditApplication

fun main(args: Array<String>) {
	runApplication<AuditApplication>(*args)
}
