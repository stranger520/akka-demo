package com.zuicodiing.platform.akkademo;

import akka.actor.UntypedActor;

/**
 * Created by Stephen.lin on 2017/8/9.
 * <p>
 * Description :<p></p>
 */
public class Greeter extends UntypedActor {

    public static enum  MSG{
        GTEETER,NONE;
    }

    @Override
    public void onReceive(Object o) throws Exception {
        if (o == MSG.GTEETER){
            System.err.println("Hello world");
            getSender().tell(MSG.NONE,getSelf());
        }else {
            unhandled(o);
        }
    }
}
