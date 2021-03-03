package com.example

import com.google.cloud.pubsub.v1.Subscriber
import io.micronaut.runtime.event.annotation.EventListener
import io.micronaut.runtime.server.event.ServerStartupEvent
import javax.inject.Singleton

@Singleton
class SubscriberStarter(private val subscriber: Subscriber) {

    @EventListener
    fun startSubscriber(event: ServerStartupEvent) {
        subscriber.startAsync()
    }
}