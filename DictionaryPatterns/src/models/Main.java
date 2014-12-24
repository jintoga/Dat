/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import CompositePattern.Composite;
import CompositePattern.Leaf;

/**
 *
 * @author DAT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        AddWord delegator = new HelpAddNewWord();
//        // TODO code application logic here
//        Language lang = new Language("English");
//        Word word = new Word();
//        word.setName("Dog");
//        Word word2 = new Word();
//        word2.setName("Cat");
//        //use of delegation
//        delegator.addNewWord(word, lang, lang.getListword());
//        delegator.addNewWord(word2, lang, lang.getListword());
//
//        System.out.println(lang.getListword());
//        Word word3 = new Word();
//        word3.setName("Human");
//        //create a word with *
//        AddWord decoratedWord = new AsteriskWordDecorator(new HelpAddNewWord());
//        decoratedWord.addNewWord(word3, lang, lang.getListword());
//        System.out.println(lang.getListword());

        Composite english = new Composite("English");
        english.addComponent(new Leaf("Dog"));
        english.addComponent(new Leaf("Cat"));
        Composite russian = new Composite("Russian");
        russian.addComponent(new Leaf("Sobaka"));
        russian.addComponent(new Leaf("Kot"));
        Leaf kura = new Leaf("Kura");
        russian.addComponent(kura);
        Composite dictionary = new Composite("Dictionary");
        dictionary.addComponent(russian);
        dictionary.addComponent(english);
        System.out.println(dictionary.defaultMethod());
        //russian.removeComponent(kura);
        System.out.println(dictionary.defaultMethod());

        for (IteratorPattern.Iterator iter = english.getIterator(); iter.hasNext();) {

            System.out.println("Elem " + iter.getIndex() + ": " + iter.next());
        }

    }
}
