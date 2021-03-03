package com.example

import com.google.cloud.pubsub.v1.MessageReceiver
import com.google.cloud.pubsub.v1.Subscriber
import com.google.pubsub.v1.ProjectSubscriptionName
import io.micronaut.context.annotation.Factory
import javax.inject.Singleton

@Factory
class Subscriber {

    @Singleton
    fun createDaneSubscriber(receiver: MessageReceiver): Subscriber {
        val name = ProjectSubscriptionName.of("hellomicronaut", "dane-test-sub")
        val subscriber = Subscriber.newBuilder(name, receiver).build()
        println(subscriber)

        return subscriber
    }
}