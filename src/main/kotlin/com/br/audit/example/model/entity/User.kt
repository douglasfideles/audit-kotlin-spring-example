package com.br.audit.example.model.entity

import com.br.audit.example.model.audit.BaseTimeEntity
import jakarta.persistence.*
import org.hibernate.envers.Audited


@Entity(name = "USERS")
@Audited(withModifiedFlag = true)
class User(

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        val id: Long? = null,

        var name: String? = "teste",

        var age: Int = 0

) : BaseTimeEntity(){
        @PrePersist
        @PreUpdate
        fun testAuditing(){
                println("PrePersist, PreUpdate Lifecycle")
        }
}