package com.vrizki.carilawankotlin.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity(name = "journals")
data class Journal(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) val id : Long =  0,
        @get:NotBlank val title : String = "",
        @get:NotBlank val content : String = "")
{}