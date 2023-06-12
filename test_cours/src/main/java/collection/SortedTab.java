/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

/**
 *
 * @author sylla
 */
public class SortedTab {
    private String[] tab;
    public SortedTab(int tabSize){
        tab = new String[tabSize];
    }
    
    public void add(String s){
        for(int i=0;i<tab.length;i++){
            if(tab[i]==null){
                tab[i] = s;
                if(tab[i-i]!=null && i-1!=-1){
                //if(i-1>=0){
                    int val = tab[i].compareTo(tab[i-1]);
                    if(val<0){
                        String inter = tab[i-1];
                        tab[i-1] = tab[i];
                        tab[i] = inter;
                    }
                }
                System.out.println("Element ajoute");
                break;
            }
            else{
                if(i==tab.length-1)
                    System.out.println("Votre tableau est deja plein");
        }
        }
    }
    
    public void Affiche(){
        for(String v : tab){
            System.out.println(v);
        }
    }
    
    public void remove(String s) {
        int k = 0;
        for(int i=0;i<tab.length;i++){
            if(s.equals(tab[i])) {
                tab[i] = null;
                k = i;
                break;
            }
        }
        while(k!=tab.length-1){
            if(tab[k]==null && tab[k+1]!=null){
                tab[k] = tab[k+1];
                tab[k+1] = null;
            }
            k++;
        }
        
    }
    
    public static void main(String[] args){
        SortedTab st = new SortedTab(3);
        st.add("Ad");
        st.add("Aa");
        st.add("Aa");
        st.add("Salut");
        st.add("Bye");
        st.remove("Aa");
        st.Affiche();
    }
}
