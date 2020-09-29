package aop.demo;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class  JDKDynamicProxy implements InvocationHandler {
    private Object target;
    public JDKDynamicProxy(Object target) {
        this.target=target;
    }

    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target,args);
        after();
        return result;
    }

    private void after() {
        System.out.println("run after for JDKDynamicProxy");
    }

    private void before() {
        System.out.println("run before for JDKDynamicProxy");
    }
}
