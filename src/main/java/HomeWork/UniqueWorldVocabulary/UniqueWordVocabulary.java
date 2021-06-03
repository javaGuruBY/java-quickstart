package HomeWork.UniqueWorldVocabulary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    Logger log = LoggerFactory.getLogger("UniqueWordVocabulary");

    private ArrayList list = new ArrayList();

    public void addWord(String word) {
        if (word.equals("")) {
            log.error("Empty input");
        } else if (sortOfduplicates(word)) {
            log.error("This word is already in the dictionary{} ", " " + word);

        } else  {
            list.add(word);
        }


    }

    public int getWordsCount() {
        return list.size();
    }

    public void printVocabulary() {

        log.debug("Print vocabulary{}", list);
    }

    private boolean sortOfduplicates(String word) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word)) {
                return true;
            }

        }
        return false;
    }

}
