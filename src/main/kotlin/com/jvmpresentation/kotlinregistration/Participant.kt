package com.jvmpresentation.kotlinregistration

import javax.persistence.*

@Entity
@Table
data class Participant (
        var name: String,
        @Column(name = "phone_number")
        var phoneNumber: String,
        var stack: String
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
}