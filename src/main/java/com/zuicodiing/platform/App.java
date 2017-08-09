package com.zuicodiing.platform;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.typesafe.config.ConfigFactory;
import com.zuicodiing.platform.akkademo.HelloWorldActor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ActorSystem system = ActorSystem.create("hello", ConfigFactory.load("akka.conf"));
        ActorRef actorRef = system.actorOf(Props.create(HelloWorldActor.class),"helloworld");
        System.err.println( "Hello Actor path :" + actorRef.path());

    }
}
