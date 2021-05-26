package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HomeAnimalService implements Barkable {
    private Animal animal;
    private Logger log;

    public HomeAnimalService(Animal animal) {
        this.animal = animal;
        log = LoggerFactory.getLogger(animal.getClass());
    }
    @Override
    public void bark() {
        log.debug("{} dog say",animal.getName());
        log.debug("{} hau hau",animal.getName());
    }
}
