package aop.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAspect {
   @DeclareParents(value ="aop.demo.GreetingImpl",defaultImpl = ApologyImpl.class)
   private Apology apology;

    @Around("execution(* aop.demo.GreetingImpl.*(..))")
  public Object around(ProceedingJoinPoint pjp) throws Throwable{
      before();
      Object result =pjp.proceed();
      after();
      return result;
  }

    private void after() {
        System.out.println("Greeting Aspect After!");
    }

    private void before() {
        System.out.println("Greeting Aspect Before!");
    }
}
