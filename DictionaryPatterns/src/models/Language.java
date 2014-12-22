/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Delegation.AddWord;
import java.util.ArrayList;

/**
 *
 * @author DAT
 */
public class Language extends Dictionary implements AddWord {

    private ArrayList<Word> listword = null;
    

    public Language(String langname) {
        super(langname);
        this.listword = new ArrayList<Word>();
    }

    public boolean isDuplicate(Word w) {
        for (Word w1 : listword) {
            if (w1.getName().trim().equalsIgnoreCase(w.getName().trim())) {
                return true;
            }
        }
        return false;
    }

    public boolean addWord(Word w) {
        boolean isDup = isDuplicate(w);
        if (!isDup) {
            w.setLang(this);
            return listword.add(w);
        }
        if (isDup) {
            return isDup;
        }
        return !isDup;
    }

    public ArrayList<Word> getListword() {
        return listword;
    }
    //delegattion
    @Override
    public void addNewWord(Word word, Language lang, ArrayList<Word> list) {
        if (word != null) {
            //delegating object delegator to do addNewWord
            addNewWord(word, lang, listword);
        } else {
            System.out.println("NULL in Lang");
        }
    }
}
