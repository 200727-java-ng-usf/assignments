import java.util.Objects;

public class QuestionTwentyCharacter {


    private String firstName;
    private String lastName;
    private int age;
    private String homeState;

    public QuestionTwentyCharacter(String firstName, String lastName, int age, String homeState) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeState = homeState;
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

    public String getHomeState() {
        return homeState;
    }

    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }

    // convenience method for converting User object into file string format


    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nAge: " + age + " years\n" + "State: " + homeState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionTwentyCharacter that = (QuestionTwentyCharacter) o;
        return age == that.age &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(homeState, that.homeState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, homeState);
    }
}
