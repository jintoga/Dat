/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import models.Main.*;

/**
 * @author DAT
 */
public class Word extends Dictionary {

    private Language lang;
    private ArrayList<Word> listword = null;

    public Word() {
        super();

    }

    public Language getLang() {
        return lang;
    }

    public void setLang(Language lang) {
        this.lang = lang;
    }
}
