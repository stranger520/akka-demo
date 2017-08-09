package com.zuicodiing.platform.akkademo;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;

/**
 * Created by Stephen.lin on 2017/8/9.
 * <p>
 * Description :<p></p>
 */
public class HelloWorldActor extends UntypedActor {

    private ActorRef greeter;

    @Override
    public void preStart() throws Exception {
        greeter = getContext().actorOf(Props.create(Greeter.class),"greeter");
        System.err.println("Greeter Actor path:"+greeter.path());
        greeter.tell(Greeter.MSG.GTEETER,getSelf());
    }

    @Override
    public void onReceive(Object o) throws Exception {
        if (o == Greeter.MSG.NONE){
            greeter.tell(Greeter.MSG.GTEETER,getSelf());
            getContext().stop(getSelf());
        }else
            unhandled(o);
    }
}
