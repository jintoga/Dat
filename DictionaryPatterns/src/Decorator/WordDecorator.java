/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Delegation.AddWord;

/**
 *
 * @author DAT
 */
abstract public class WordDecorator implements AddWord {

    protected AddWord decoratedWord;

    public WordDecorator(AddWord decoratedWord) {
        this.decoratedWord = decoratedWord;
    }
}

