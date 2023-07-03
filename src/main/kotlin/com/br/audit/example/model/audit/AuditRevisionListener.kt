//package com.br.audit.example.model.audit
//
//import com.br.audit.example.model.entity.User
//import org.hibernate.envers.RevisionListener
//import java.util.*
//
//
//class AuditRevisionListener : RevisionListener {
//    override fun newRevision(revisionEntity: Any) {
//        val currentUser: String = Optional.ofNullable(SecurityContextHolder.getContext())
//                .map { obj: Any? -> User::class.java.cast(obj) }
//                .map(User::getUsername)
//                .orElse("Unknown-User")
//        val audit = revisionEntity as AuditRevisionEntity
//        audit.setUser(currentUser)
//    }
//}