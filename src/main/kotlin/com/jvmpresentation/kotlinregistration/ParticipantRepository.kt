package com.jvmpresentation.kotlinregistration

import org.springframework.data.jpa.repository.JpaRepository

interface ParticipantRepository : JpaRepository<Participant, Int> {
}