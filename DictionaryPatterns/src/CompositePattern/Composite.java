/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePattern;

import IteratorPattern.Container;
import IteratorPattern.Iterator;
import java.util.ArrayList;

/**
 *
 * @author NguenKD
 */
public class Composite implements Component, Container {

    private String id;
    private ArrayList<Component> components = new ArrayList<Component>();

    public Composite(String id) {
        this.id = id;
    }

    @Override
    public String defaultMethod() {
        String s = " (" + id + ":";
        for (Component child : getChildren()) {

            s += " " + child.defaultMethod();

        }
        return s + ") ";
    }

    @Override
    public ArrayList<Component> getChildren() {
        return components;
    }

    @Override
    public boolean addComponent(Component c) {
        return components.add(c);
    }

    @Override
    public boolean removeComponent(Component c) {
        return components.remove(c);
    }

    @Override
    public Iterator getIterator() {
        return new myIterator();
    }

    private class myIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < components.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return components.get(index++).defaultMethod();
            }
            return null;
        }

        public int getIndex() {
            if (this.hasNext()) {
                return index;
            }
            return -1;
        }
    }
}
