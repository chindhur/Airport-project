package task2.person;

import task2.utils.Printer;

public class Person {
    protected String name;
    protected Integer age;
    protected Address address;
    protected Gender gender;

    protected String emailId;


    public Person(String name) {
        this.name = name;
    }

    /* Default Constructor */
    public Person() {
    }

    /*constructor*/
    public Person(String name, Integer age, Address address, Gender gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void printBasicDetails() {
        Printer.print("Name : " + name);
        Printer.print("Age : " + age);
        return;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Person other = (Person) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }

        if (this.age != other.age) {
            return false;
        }

        if (!this.gender.equals(other.gender)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 53 * hash + this.age;
        hash = 53 * hash + (this.address != null ? this.address.hashCode() : 0);
        return hash;
    }

}