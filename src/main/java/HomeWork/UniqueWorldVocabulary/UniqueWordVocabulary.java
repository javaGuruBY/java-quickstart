package HomeWork.UniqueWorldVocabulary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    Logger log = LoggerFactory.getLogger("UniqueWordVocabulary");

    Set<String> setList = new HashSet<>();

    public void addWord(String word) {

        setList.add(word);
    }

    public int getWordsCount() {
        return setList.size();
    }

    public void printVocabulary() {

        log.debug("Print vocabulary{}",setList);
    }

}
