package aop.demo;

import org.springframework.stereotype.Component;

@Component
public class GreetingImpl implements Greeting{

    @Tag
    public void sayHello(String name) {
        System.out.println("Hello! " + name);
        //故意抛出一个异常，看看异常信息是否被拦截到
        //throw new RuntimeException("Error");

    }

    public void goodMorning(String name){
        System.out.println("Good Morning! " + name);
    }
    public void goodNight(String name){
        System.out.println("Good Night!"+name);
    }

}
