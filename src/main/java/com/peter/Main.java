package com.peter;

import java.util.List;

public class Main {

    public static void printPeopleOlderThan(List<People>people,
                                            int age){
        for (People p: people) {
            if(p.getAge() >= age){
                p.printPeople();
            }
        }
    }
    public static void main(String... args) {

        List<People> peopleList =People.defaultList();
        printPeopleOlderThan(peopleList,25);

    }
}