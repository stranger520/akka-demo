### akka demo
 &nbps;&nbps;&nbps;定义一个欢迎者（Greeter），它继承 ````UntypedActor````
 (该类是Akka里的核心成员)，之所以强调是无类型的，当然akka里面支持有类型Actor。
 有类型的可以用系统里的其他方法构造，可以缓解java单继承的问题。
 
 &nbps;&nbps;&nbps;而HelloWorldActor里的preStart 方法为akka的回调方法，
 在Akka启动之前，会被Akka框架调用，完成一些初始化调用。在这里，我们创建了 greeter Actor实例。
 并且向它发送greeter消息。
 定义的onRecive方法为helloworld actor 的消息处理函数。在这里只处理 NONE消息，在收到NONE后
 它会向 greeter 发送 GREETER消息，接着自己停止。
 
 因此Greeter会收到两条GREETER 消息，打印两次“hello world”
 
 以上摘自 “实战java高并发程序设计” 一书
 
 