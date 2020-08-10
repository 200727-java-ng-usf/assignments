package assignment.questions.question20;

public class People {
    String firstName;
    String lastName;
    int age;
    String state;

    public People(String firstName, String lastName, int age, String state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.state = state;
    }

    @Override
    public String toString() {
        return
                "Name: " + firstName + " " + lastName + "\n" +
                "age: " + age + "\n" +
                "state: " + state;
    }

    public People() {
        super();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
