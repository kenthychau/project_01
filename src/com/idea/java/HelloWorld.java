package com.idea.java;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(21);
        person.setName("Tony");
        System.out.println("hello world!");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        String[] strings={"Tony","John","Bruce"};
        for (String string : strings) {
            System.out.println(string);
        }

        List<String> list=new ArrayList<String>();
        list.add("Tony");
        list.add("John");
        list.add("Bruce");

        for (String s : list) {
            System.out.println(s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }
}
