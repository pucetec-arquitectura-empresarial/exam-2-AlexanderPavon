package com.pucetec.exam2.models.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne
import jakarta.persistence.JoinColumn
import jakarta.persistence.Table
import java.time.LocalDate

@Entity
@Table(name = "registers")
data class Register(

    @Column(name = "entry_time")
    var entryTime: LocalDate,

    @Column(name = "exit_time")
    var exitTime: LocalDate? = null,

    @ManytoOne
    @JoinColumn(name = "floor_id")
    var floorId: Long,

    ): BaseEntity()