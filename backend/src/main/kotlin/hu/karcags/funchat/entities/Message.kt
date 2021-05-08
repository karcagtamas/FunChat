package hu.karcags.funchat.entities

import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime
import javax.persistence.Id

@Document
data class Message(
    @Id
    val id: ObjectId = ObjectId.get(),
    val from: String,
    val fromId: ObjectId = ObjectId.get(),
    val sent: LocalDateTime = LocalDateTime.now(),
    val message: String
)
