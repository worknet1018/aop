package aop.demo;

//import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.java2d.pipe.AlphaPaintPipe;

public class Client {
/*    public static void main(String[] args) {//前后置增强 1
        ProxyFactory proxyFactory =new ProxyFactory();//创建代理工厂
        proxyFactory.setTarget(new GreetingImpl());//射入目标类对象
        proxyFactory.addAdvice(new GreetingBeforeAdvice());//添加前置增强类
        proxyFactory.addAdvice(new GreetingAfterAdvice());//添加后置增强类
        Greeting greeting =(Greeting) proxyFactory.getProxy();//从代理工厂类中获取代理类
        greeting.sayHello("Jack");//调用代理方法
    }*/
/*public static void main(String[] args) {//前后置增强 2
    ProxyFactory proxyFactory =new ProxyFactory();
    proxyFactory.setTarget(new GreetingImpl());
    proxyFactory.addAdvice(new GreetingBeforeAndAfterAdvice());
    Greeting greeting = (Greeting)proxyFactory.getProxy();
    greeting.sayHello("Johan");

}*/
/*public static void main(String[] args) {
    ProxyFactory proxyFactory= new ProxyFactory();
    proxyFactory.setTarget(new GreetingImpl());
    proxyFactory.addAdvice(new GreetingAroundAdvice());
    Greeting greeting =(Greeting) proxyFactory.getProxy();
    greeting.sayHello("Amy");
}*/
/*    //Spring XML 配置 增强类（动态代理增强类)
public static void main(String[] args) {
//    获取 Spring Context
    ApplicationContext context = new ClassPathXmlApplicationContext("springClass.xml");
//    从Context 中根据 id 获取  Bean 对象
    GreetingImpl greeting =(GreetingImpl) context.getBean("greetingProxy");
//    调用代理的方法
    greeting.sayHello("Tom");
    Apology apology = (Apology) greeting;
    apology.saySorry("Tom");
    apology.saySorry2("Tom");
}*/
/*    //spring 基于代理的自动配置
public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("springAdvisor.xml");
    GreetingImpl greeting=(GreetingImpl)context.getBean("greetingProxy");
    //greeting.sayHello("Jack");
    greeting.sayHello("Jack");
}*/
public static void main(String[] args) {
    ApplicationContext context =new ClassPathXmlApplicationContext("springAspectJ.xml");
    Greeting greeting=(Greeting) context.getBean("greetingImpl");
    greeting.sayHello("Jack");
    Apology apology=(Apology)greeting;
    apology.saySorry("Jack");

}
}
