package com.peter;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void printPeopleOlderThan(List<People>people,
                                            int age){
        for (People p: people) {
            if(p.getAge() >= age){
                p.printPeople();
            }
        }
    }
    public static void printPeopleWithRange(
            List<People> people , int low, int high
    ){
        List<People> collect = people.stream()
                .filter(p -> p.getAge() >= low && p.getAge() <= high)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
    public static void main(String... args) {

        List<People> peopleList =People.defaultList();
        printPeopleOlderThan(peopleList,25);
        printPeopleWithRange(peopleList,25,34);

    }
}