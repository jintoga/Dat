/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern;

import DelegationPattern.AddWord;
import java.util.ArrayList;
import models.Language;
import models.Word;

/**
 *
 * @author DAT
 */
//This class make a word look like this: *<word>*
public class AsteriskWordDecorator extends WordDecorator {

    public AsteriskWordDecorator(AddWord decoratedWord) {
        super(decoratedWord);
    }

    @Override
    public void addNewWord(Word word, Language lang, ArrayList<Word> listword) {
        //use decorating method before add a new word
        putAsterisk(word);
        decoratedWord.addNewWord(word, lang, listword);
    }
    //Method add * to word

    private void putAsterisk(Word word) {
        String wordname = word.getName();
        word.setName("*" + wordname + "*");
    }
}
