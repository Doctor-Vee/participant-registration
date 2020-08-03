package com.jvmpresentation.kotlinregistration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate

@RestController
@RequestMapping("api")
class ParticipantController {

    @Autowired
    lateinit var participantRepository: ParticipantRepository

    @GetMapping("/test")
    fun welcomePage(): String{
        return "Yaaaaay .... IT worked"
    }

    @GetMapping("/participants")
    fun getAllParticipants(): List<Participant>{
        return participantRepository.findAll()
    }

    @PostMapping("/participants")
    fun addParticipant (@RequestBody participant: Participant): Participant {
        return participantRepository.save(participant)
    }
}