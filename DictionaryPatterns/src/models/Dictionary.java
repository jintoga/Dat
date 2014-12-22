/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author DAT
 */
public class Dictionary {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public Dictionary(String name) {
        super();
        this.name = name;
    }

    public Dictionary() {
        super();
    }
}
