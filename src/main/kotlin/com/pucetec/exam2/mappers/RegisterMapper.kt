package com.pucetec.exam2.mappers

import com.pucetec.exam2.models.entities.Register
import com.pucetec.exam2.models.responses.RegisterResponse
import org.springframework.stereotype.Component

@Component
class FloorMapper {
    fun toResponse(register: Register): RegisterResponse {
        return RegisterResponse(
            id = register.id,
            entryTime = register.entryTime,
            exitTime = register.exitTime,
        )
    }
}