/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

/**
 *
 * @author sylla
 */
public class Exo1 {
    private final static int taille = 10;
    private Object [] pile;
    private int pos;
    
    public Exo1() {
        pile=new Object[taille]; 
        pos=0; 
    }
    
    public void Empile(Object o) throws PilePleine{
        try{
            pile[pos] = o;
            pos++;
        }catch(ArrayIndexOutOfBoundsException e){
            throw new PilePleine("PilePleine");
        }
    }
    
    public Object Depile() throws PileVide{
        try{
            Object o = pile[pos-1];
            pos--;
            return o;
        }catch(ArrayIndexOutOfBoundsException e){
            throw new PileVide("Pile vide");
        }
    }
    
    public static void main(String[] args){
        Exo1 p = new Exo1();
        try {
            for(int i=0;i<args.length;i++) p.Empile(args[i]);
        }
        catch(PilePleine e) {};
        try {
            for(;;) System.out.print(p.Depile()+" ");
        }
        catch(PileVide e) { System.out.println(); }

}
        }
