package com.pucetec.exam2.models.requests

import com.fasterxml.jackson.annotation.JsonProperty
import com.pucetec.exam2.models.entities.Floor

data class CreateFloorRequest(
    val level: Int,
    @JsonProperty("total_capacity")
    val totalCapacity: Int,
    @JsonProperty("occupied_spots")
    val occupiedSpots: Int,
){
    fun toEntity(): Floor {
        return Floor(
            level = this.level,
            totalCapacity = this.totalCapacity,
            occupiedSpots = this.occupiedSpots
        )
    }
}
