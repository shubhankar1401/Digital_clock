public class HelloWorld {
    private String firstName;

    public HelloWorld(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public HelloWorld(String firstName) {
        this.firstName = firstName;
    }

    public HelloWorld() {
    }
}
