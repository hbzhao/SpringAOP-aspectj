package basic;

import anno.NeedTest;

public class NaiveWaiter implements Waiter {
    public void serveTo(String name) {
        System.out.println("serve to "+name);
    }

    public void greetTo(String name) {
        System.out.println("greet to "+name);
    }

    @NeedTest
    public void needTest(String name){
        System.out.println("@annotation advice"+name);
    }
}
