package hu.karcags.funchat.repositories

import hu.karcags.funchat.entities.Message
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface MessageRepository : MongoRepository<Message, String> {
    fun findOneById(id: ObjectId): Message
    override fun deleteAll()
}