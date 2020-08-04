import org.junit.Test;

public class Question20Test {
    @Test
    public void question20Test(){
        System.out.println("Question 20 running");
        //Question 20 test
        Question20 question20 = new Question20();
            /*
            from
            Mickey:Mouse:35:Arizona
            Hulk:Hogan:50:Virginia
            Roger:Rabbit:22:California
            Wonder:Woman:18:Montana
            to
            Name: Mickey Mouse
            Age: 35 years
            State: Arizona State

            Name: Hulk Hogan
            Age: 50 years
            State: Virginia State...
             */
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("Name: Mickey Mouse\nAge: 35 years\nState: Arizona State\n\n" +
                "Name: Hulk Hogan\nAge: 50 years\nState: Virginia State\n\n" +
                "Name: Roger Rabbit\nAge: 22 years\nState: California State\n\n" +
                "Name: Wonder Woman\nAge: 18 years\nState: Montana State\n\n");
        assert(question20.fileOutput().toString().equals(expectedOutput.toString()));
        System.out.println("Question 20 stopped");
    }

    // ensure the input does not equal the output
    @Test
    public void question20Test2(){
        System.out.println("Question 20 running");
        //Question 20 test
        Question20 question20 = new Question20();
            /*
            from
            Mickey:Mouse:35:Arizona
            Hulk:Hogan:50:Virginia
            Roger:Rabbit:22:California
            Wonder:Woman:18:Montana
            to
            Name: Mickey Mouse
            Age: 35 years
            State: Arizona State

            Name: Hulk Hogan
            Age: 50 years
            State: Virginia State...
             */
        StringBuilder unExpectedOutput = new StringBuilder();
        unExpectedOutput.append("Mickey:Mouse:35:Arizona\n" +
                "            Hulk:Hogan:50:Virginia\n" +
                "            Roger:Rabbit:22:California\n" +
                "            Wonder:Woman:18:Montana");
        assert(question20.fileOutput().toString().equals(unExpectedOutput.toString()));
        System.out.println("Question 20 stopped");
    }
}
