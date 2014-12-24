/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern;

/**
 *
 * @author DAT
 */
//check file Composite.java in CompositePattern package to see methods
public interface Iterator {

    public boolean hasNext();

    public Object next();

    public int getIndex();
}
