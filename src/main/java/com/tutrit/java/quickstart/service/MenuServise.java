package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.constants.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MenuServise {
    private static Logger log = LoggerFactory.getLogger("MenuService");

    public static void choice(Status status) {
       switch (status){
           case GROOMING:
               log.info("Груминг раз в неделю");
           case TO_DO:
               break;
           case IN_PROGRESS:
               break;
           case BLOCKED:
               break;
           case DONE:
               break;
           case CLOSED:
               break;
       }
    }
}
