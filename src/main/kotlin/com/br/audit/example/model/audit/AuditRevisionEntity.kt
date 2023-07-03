package com.br.audit.example.model.audit

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import jakarta.persistence.*
import org.hibernate.envers.DefaultRevisionEntity
import org.springframework.data.jpa.domain.support.AuditingEntityListener

@EntityListeners(AuditingEntityListener::class)
//@AttributeOverrides(
//        AttributeOverride(name = "timestamp", column = Column(name = "rev_timestamp")),
//        AttributeOverride(name = "id", column = Column(name = "rev_id"))
//)
@JsonIgnoreProperties(value = ["hibernateLazyInitializer", "handler"])
class AuditRevisionEntity(): DefaultRevisionEntity() {
    @Column(name = "rev_username")
    private val user: String? = null
}