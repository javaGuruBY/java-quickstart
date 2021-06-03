package HomeWork;

import HomeWork.CreditCard.CreditCard;
import HomeWork.MagicBall.MagicBall;
import HomeWork.UniqueWorldVocabulary.UniqueWordVocabulary;

public class MainApp {
    public static void main(String[] args) {

        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        uniqueWordVocabulary.addWord("");
        uniqueWordVocabulary.addWord("slovo");
        uniqueWordVocabulary.addWord("text");
        uniqueWordVocabulary.addWord("soup");
        uniqueWordVocabulary.printVocabulary();
        uniqueWordVocabulary.addWord("text");
        uniqueWordVocabulary.printVocabulary();







    }
}
