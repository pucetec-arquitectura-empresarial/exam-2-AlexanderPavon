package com.pucetec.exam2.models.requests

import com.fasterxml.jackson.annotation.JsonProperty
import com.pucetec.exam2.models.entities.Register
import com.pucetec.exam2.models.responses.FloorResponse
import java.time.LocalDate

data class CreateRegisterRequest(
    val entryTime: LocalDate,
    val exitTime: LocalDate?,
    @JsonProperty("floor_id")
    val floorId: Long,
){
    fun toEntity(floor: com.pucetec.exam2.models.entities.Floor): Register {
        return Register(
            entryTime = this.entryTime,
            exitTime = this.exitTime,
            floor = floor
        )
    }
}


