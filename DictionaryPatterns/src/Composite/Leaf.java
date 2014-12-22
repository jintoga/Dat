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
public class Leaf implements Component {

    private String id;

    public Leaf(String id) {
        this.id = id;
    }

    @Override
    public String defaultMethod() {
        return id;
    }

    @Override
    public ArrayList<Component> getChildren() {
        return null;
    }

    @Override
    public boolean addComponent(Component c) {
        return false;
    }

    @Override
    public boolean removeComponent(Component c) {
        return false;
    }

}
