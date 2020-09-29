package aop.demo;

/**
 * 静态代理类
 */
public class  GreetingProxy implements Greeting{

    private Greeting greetingImpl;

    public GreetingProxy(Greeting greetingImpl) {
        this.greetingImpl = greetingImpl;
    }

    public void sayHello(String name) {

        before();
        greetingImpl.sayHello(name);
        after();
    }

    private void after() {
        System.out.println("run after for GreetingProxy!");
    }

    private void before() {
        System.out.println("run before for GreetingProxy!");
    }
}
