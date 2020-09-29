package aop.demo;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component
public class  GreetingAroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {

        before();
        Object result = invocation.proceed();
        after();
        return null;
    }

    private void after() {
        System.out.println("After for GreetingAroundAdvice !");
    }

    private void before() {
        System.out.println("Before for GreetingAroundAdvice !");
    }
}
