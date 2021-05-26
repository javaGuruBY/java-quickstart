package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Animal;
import com.tutrit.java.quickstart.bean.Dog;
import com.tutrit.java.quickstart.bean.Wolf;
import com.tutrit.java.quickstart.constants.Status;
import com.tutrit.java.quickstart.service.*;
import com.tutrit.java.quickstart.util.WordCountingService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.*;
import java.util.stream.Collectors;

import static com.tutrit.java.quickstart.constants.Poe.RAVEN;
import static com.tutrit.java.quickstart.constants.Regex.BY_WORDS;

public class Application {
    private static Logger log = LoggerFactory.getLogger(" ");

    public static void main(String[] args) {
        try {
            WordCountingService.getFrequency(RAVEN,"nevermore");
        } catch (Exception e) {
            log.warn("что-то пошло не так", e);

        }


    }


}


