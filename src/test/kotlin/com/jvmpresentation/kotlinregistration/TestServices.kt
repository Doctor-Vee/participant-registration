package com.jvmpresentation.kotlinregistration

import org.junit.After
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.util.*

import org.junit.jupiter.api.Assertions.assertNotNull;
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = [KotlinregistrationApplication::class])
class TestServices {

    @Autowired
    lateinit var participantRepository: ParticipantRepository

    @Test
    fun testTheInMemoryThingWorks(){
        val participant: Participant = participantRepository.save(Participant("John", "08085492459", "Java"))

        val foundParticipant: Optional<Participant> = participantRepository.findById(participant.id!!)

        assertNotNull(participant)

        println(participant.toString())
        println(participant.id!!)

        assertEquals("John", foundParticipant.get().name)
        assertEquals(1, foundParticipant.get().id)
    }

}