/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DelegationPattern;

import java.util.ArrayList;
import models.Language;
import models.Word;

/**
 *
 * @author DAT
 */
public interface AddWord {

    public void addNewWord(Word word, Language lang, ArrayList<Word> listword);
}
