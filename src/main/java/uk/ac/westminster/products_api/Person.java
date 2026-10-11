package uk.ac.westminster.products_api;

public class Person {
//    object field
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;


    }
// getter returns the value stored in the email field
    public String getName() {

        return name;
    }

    public String getEmail() {
        return email;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

