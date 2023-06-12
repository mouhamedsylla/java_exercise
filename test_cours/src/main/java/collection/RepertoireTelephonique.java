/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;
import java.util.*;
/**
 *
 * @author sylla
 */
public class RepertoireTelephonique {
    Map<String, ArrayList<String>> rep;
    public RepertoireTelephonique() {
        rep = new HashMap();
    }
    
    public boolean addContact(String c) {
        if(rep.containsKey(c))
            return false;
        rep.put(c, new ArrayList<String>());
        return true;
    }
    
    public void removeContact(String c){
        rep.remove(c);
    }
    
    public void addInfos(String c, String infos){
        if(!rep.containsKey(c))
            rep.put(c, new ArrayList<String>());
        rep.get(c).add(infos);
    }
    
    public void AfficheContact() {
        Collection index = rep.keySet();
        Collection val = rep.values();
        Iterator itr = index.iterator();
        Iterator itr2 = val.iterator();
        while(itr.hasNext() && itr2.hasNext()) {
            System.out.println(itr.next()+": "+itr2.next());
        }
    }
    
    public static void main(String[] args){
        RepertoireTelephonique rep = new RepertoireTelephonique();
        rep.addInfos("Mouhamed Sylla", "781457943");
        rep.addInfos("Abdou Salam Sylla", "775260572");
        rep.addInfos("Ahmed", "707549527");
        rep.AfficheContact();
    }
}
