package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CHooks {

    @Before(order = 0)
    public void beforeFirstHooks(){
        System.out.println("From the before first Hooks");
    }
    @Before("@scenarioTag")
    public void beforeSecondtHooks(){
        System.out.println("From the before second Hooks");
    }
    @Before(order = 2)
    public void beforeThirdHooks(){
        System.out.println("From the before third Hooks");
    }

    @After(order = 0)
    public void afterFirstHooks(){
        System.out.println("From the after first Hooks");
    }
    @After( "@senarioTag")
    public void afterSecondHooks(){
        System.out.println("From the after second Hooks");
    }
    @After("@scenarioTag")
    public void afterThirdHooks(){
        System.out.println("From the after third Hooks");
    }


}
