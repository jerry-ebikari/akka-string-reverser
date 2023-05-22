package com.ebikari.actors;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Status;
import com.ebikari.utils.StringReverser;

public class StringReverseActor extends AbstractActor {
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(String.class, message -> sender().tell(StringReverser.reverse(message), ActorRef.noSender()))
                .matchAny(o -> sender().tell(new Status.Failure(new Exception("Unknown Message")), self()))
                .build();
    }
}
