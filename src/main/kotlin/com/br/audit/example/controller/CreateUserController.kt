package com.br.audit.example.controller

import com.br.audit.example.controller.extension.toDatabase
import com.br.audit.example.controller.model.UserRequest
import com.br.audit.example.model.repository.UserRepository
import jakarta.transaction.Transactional
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class CreateUserController(
        private val userRepository: UserRepository
) {
    @PostMapping
    @Transactional
    fun execute(@RequestBody requet: UserRequest){
        val userToSave = requet.toDatabase()
        userRepository.save(userToSave)
    }
}