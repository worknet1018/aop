package aop.demo;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.stereotype.Component;

@Component
public class GreetingIntroAdvice  extends DelegatingIntroductionInterceptor implements Apology{
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        return super.invoke(invocation);
    }


    public void saySorry(String name) {
        System.out.println("Sorry!" +name);
    }
    public void saySorry2(String name) {
        System.out.println("Sorry2!" +name);
    }
}
