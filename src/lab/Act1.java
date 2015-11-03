package lab;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author zsummers
 */
public class Act1 {
    public static void main(String[] args) {
        List gameNames = new Vector();
        gameNames.add("Starcraft");
        gameNames.add("Hearthstone");
        gameNames.add("Just Cause");
        
        Act1.printList(gameNames);
        
        gameNames.add("Recettear");
        gameNames.add("Warframe");
        
        Act1.printList(gameNames);
        
        gameNames.remove(0);
        gameNames.remove(gameNames.size()-1);

        Act1.printList(gameNames);

    }
    
    public static void printList(List l){
        //System.out.println("Start");
        for(int i = 0;i<l.size();i++){
            
            System.out.println((String)l.get(i));
        }
        //System.out.println("End");
        System.out.println("");
    } 
    
}
