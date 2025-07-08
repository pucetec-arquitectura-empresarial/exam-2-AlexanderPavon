package com.pucetec.exam2.mappers

import com.pucetec.exam2.models.entities.Floor
import com.pucetec.exam2.models.responses.FloorResponse
import org.springframework.stereotype.Component

@Component
class FloorMapper {
    fun toResponse(floor: Floor): FloorResponse {
        return FloorResponse(
            id = floor.id,
            level = floor.level,
            totalCapacity = floor.totalCapacity,
            occupiedSpots = floor.occupiedSpots

        )
    }
}
