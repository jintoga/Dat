/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Delegation;

import java.util.ArrayList;
import models.Language;
import models.Word;

/**
 *
 * @author DAT
 */
public class HelpAddNewWord implements AddWord {
    // delegation

    @Override
    public void addNewWord(Word word, Language lang, ArrayList<Word> listword) {
        if (lang != null) {
            lang.getName();
            if (word != null) {
                word.setLang(lang);
                listword.add(word);
            } else {
                System.out.println("NULL WORD");
            }

        } else {
            System.out.println("NULL");
        }
    }
}
