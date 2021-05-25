package com.tutrit.java.quickstart.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Dog extends Animal {
    private String collar;//POJO

    Logger log = LoggerFactory.getLogger("Dog");

    public Dog() {
    }

    public Dog(int a, double b) {
        this.setAge(a);
        this.setPrice(b);

    }

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }



    void bark() {
        log.debug(" dog say");
        log.debug(" hau hau");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(collar, dog.collar) &&
                Objects.equals(log, dog.log);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), collar, log);
    }

    @Override
    public String toString() {
        return super.toString() + "<-Dog{" +
                "collar='" + collar + '\'' +
                '}';
    }
}
