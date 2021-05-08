package hu.karcags.funchat.controllers

import hu.karcags.funchat.entities.Message
import hu.karcags.funchat.repositories.MessageRepository
import org.bson.types.ObjectId
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/messages")
class MessageController(private val messageRepository: MessageRepository) {
    @GetMapping
    fun getAllMessages(): ResponseEntity<List<Message>> {
        val messages = messageRepository.findAll()
        return ResponseEntity.ok(messages)
    }

    @GetMapping("/{id}")
    fun getOneMessage(@PathVariable("id") id: String): ResponseEntity<Message> {
        val message = messageRepository.findOneById(ObjectId(id))
        return ResponseEntity.ok(message)
    }
}