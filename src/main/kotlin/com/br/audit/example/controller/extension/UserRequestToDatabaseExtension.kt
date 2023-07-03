package com.br.audit.example.controller.extension

import com.br.audit.example.controller.model.UserRequest
import com.br.audit.example.model.entity.User


fun UserRequest.toDatabase() = User(
        null,
       this.name,
       this.age
)