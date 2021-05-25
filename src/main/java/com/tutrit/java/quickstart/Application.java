package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Animal;
import com.tutrit.java.quickstart.bean.Dog;
import com.tutrit.java.quickstart.bean.Wolf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    static Logger log = LoggerFactory.getLogger("Application");

    public static void main(String[] args) {

        Animal animal = new Animal("unknown");
        Animal dog = new Dog(25, 135);
        Animal wolf = new Wolf();


        log.info("{}", animal);
        log.info("{}", dog);
        log.info("{}", wolf);


    }
}

