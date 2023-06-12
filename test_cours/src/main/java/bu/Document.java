/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bu;

/**
 *
 * @author HP
 */
public abstract class Document {
    private String titre;
    
    public Document(String titre) {
        this.titre = titre;
    }
    
    public String Affiche() {
        return titre;
    }
}
