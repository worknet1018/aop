package aop.demo;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibDynamicProxy implements MethodInterceptor {

    private static CGLibDynamicProxy instance =new CGLibDynamicProxy();

    private CGLibDynamicProxy() {
    }

    public static CGLibDynamicProxy getInstance(){
        return instance;

    }

    public <T> T getProxy(Class<T> cls){

        return (T) Enhancer.create(cls,this);
    }
    public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(target,args);
        after();
        return result;
    }
    private void after() {
        System.out.println("run after for CGLibDynamicProxy");
    }

    private void before() {
        System.out.println("run before for CGLibDynamicProxy");
    }

}
