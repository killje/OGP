/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hexagonwars;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractAction;

/**
 *
 * @author Patrick Beuks (s2288842), Floris Huizinga (s2397617) and
 * @author Timo Smit (s2337789)
 */
public class ActionClass {
    HWFrame frame;
    public ActionClass(HWFrame hwframe){
        frame = hwframe;
    }
    
    public class OpenWorldeditorAction extends AbstractAction{
       
        @Override
        public void actionPerformed(ActionEvent ae) {
            frame.removeAllPanels();
            frame.addEditorPanel();
        }
    }
    
    public class OpenMapAction extends AbstractAction{
       
        @Override
        public void actionPerformed(ActionEvent ae) {
            frame.removeAllPanels();
            frame.addMapEditorPanel();
        }
    }
    
    public class SetInputSize extends AbstractAction{
       
        Notify notify = new Notify();
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            notify.sendNotify();
        }
        
        public class Notify extends Observable {
            
            public void sendNotify(){
                this.setChanged();
                this.notifyObservers();
            }
        }
    }
}
