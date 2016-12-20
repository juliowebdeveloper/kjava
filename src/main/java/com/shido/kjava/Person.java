package com.shido.kjava;

import org.jetbrains.annotations.Nullable;

/**
 * Created by Teste2 on 19/12/2016.
 */
public class Person {

    private String name;

    private int age;

    private Person partner;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.equals("") )throw new IllegalArgumentException("name");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Nullable
    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }
}
