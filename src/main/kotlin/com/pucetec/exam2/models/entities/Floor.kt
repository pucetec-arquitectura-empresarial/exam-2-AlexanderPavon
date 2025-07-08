package com.pucetec.exam2.models.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "floors")
data class Floor(
    var level: Int,

    @Column(name = "total_capicity")
    var totalCapicity: Int,

    @Column(name = "occupied_spots")
    var occupiedSpots: Int,
): BaseEntity()
