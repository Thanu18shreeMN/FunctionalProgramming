package com.inter;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String personName;
    private String emailId;

    public Person(String personName, String emailId) {
        this.personName = personName;
        this.emailId = emailId;
    }

    public String getPersonName() {
        return personName;
    }

    public String getEmailId() {
        return emailId;
    }
}

public class MainPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", "alice@example.com"));
        personList.add(new Person("Bob", "bob@example.com"));
        personList.add(new Person("Charlie", "charlie@example.com"));

        personList.forEach(MainPerson::printPersonInfo);
    }

    public static void printPersonInfo(Person person) {
        System.out.println("Name: " + person.getPersonName());
        System.out.println("Email: " + person.getEmailId());
        System.out.println();
    }
}
