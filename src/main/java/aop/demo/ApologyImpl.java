package aop.demo;

public class ApologyImpl implements Apology{
    public void saySorry(String name) {
        System.out.println("Sorry!" +name);
    }
}
