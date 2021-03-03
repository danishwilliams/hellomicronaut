package com.example

import com.google.cloud.pubsub.v1.AckReplyConsumer
import com.google.cloud.pubsub.v1.MessageReceiver
import com.google.pubsub.v1.PubsubMessage
import javax.inject.Singleton

@Singleton
class DaneUpdateReceiver: MessageReceiver {
    override fun receiveMessage(message: PubsubMessage, consumer: AckReplyConsumer) {
        consumer.ack()

        println(message)
    }

}