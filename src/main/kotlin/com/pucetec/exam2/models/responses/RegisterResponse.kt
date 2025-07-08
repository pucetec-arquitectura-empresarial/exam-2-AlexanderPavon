package com.pucetec.exam2.models.responses

import java.time.LocalDate

data class RegisterResponse(
    val id: Long,
    val entryTime: LocalDate,
    val exitTime: LocalDate?,
    val floorId: List<FloorResponse>,
)