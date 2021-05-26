package com.tutrit.java.quickstart.util;

import com.tutrit.java.quickstart.exception.TextCannotBeNullException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.stream.Collectors;

import static com.tutrit.java.quickstart.constants.Poe.RAVEN;
import static com.tutrit.java.quickstart.constants.Regex.BY_WORDS;
import static java.util.Arrays.stream;

public class WordCountingService {
    private static Logger log = LoggerFactory.getLogger("WorldsCountService");

    private WordCountingService() {

    }

    public static long countWorldInText(String text, String word) throws Exception {
        return stream(text.split(BY_WORDS))
                .filter(w -> w.equalsIgnoreCase(word))
                .collect(Collectors.counting());

    }

    public static long countWorlds(String text) {
        return stream(text.split(BY_WORDS))
                .collect(Collectors.counting());

    }
    public static void getFrequency(String text, String world) throws Exception{
        if (text== null){
            throw new TextCannotBeNullException();
        }
        double frequency = countWorldInText(text,world)*100.0/countWorlds(text);
        log.info("frequency{} in text is {}%",world,frequency);

    }
}
