/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern;

import DelegationPattern.AddWord;

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

