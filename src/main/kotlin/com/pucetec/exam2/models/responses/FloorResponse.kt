package com.pucetec.exam2.models.responses

data class FloorResponse(
    val id: Long,
    val level: Int,
    val totalCapacity: Int,
    val occupiedSpots: Int,
)
