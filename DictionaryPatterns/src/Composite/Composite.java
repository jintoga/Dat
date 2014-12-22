/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author NguenKD
 */
public class Composite implements Component {

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

}
