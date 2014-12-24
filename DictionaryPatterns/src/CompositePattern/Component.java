/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePattern;

import java.util.ArrayList;

/**
 *
 * @author NguenKD
 */
public interface Component {

    public String defaultMethod();

    public ArrayList<Component> getChildren();

    public boolean addComponent(Component c);

    public boolean removeComponent(Component c);

}
