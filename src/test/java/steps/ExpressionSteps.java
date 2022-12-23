package steps;

import io.cucumber.java.en.Given;

public class ExpressionSteps {
    @Given("I have {int} laptop")
    public void i_have_laptop(Integer count) {
        System.out.println("Getting laptop count "+ count);

    }
    @Given("I have {double} CGPA")
    public void i_have_cgpa(Double cgpa) {
        System.out.println("Getting cgpa "+ cgpa);
    }
    @Given("{string} is elder to {string} and {string}")
    public void is_elder_to_and(String string, String string2, String string3) {
        System.out.println("sisters name "+ string +" "+  string2+" " + string3);

    }

}
