package com.br.audit.example.config

import jakarta.persistence.EntityManagerFactory
import org.hibernate.envers.AuditReader
import org.hibernate.envers.AuditReaderFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class AuditConfiguration(private val entityManagerFactory: EntityManagerFactory) {

    @Bean
    fun auditReader(): AuditReader {
        return AuditReaderFactory.get(entityManagerFactory.createEntityManager())
    }
}