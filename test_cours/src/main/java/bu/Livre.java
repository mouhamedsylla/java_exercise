/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bu;

/**
 *
 * @author HP
 */
class Livre extends Document{
    private String auteur;
    public Livre(String titre, String auteur) {
        super(titre);
        this.auteur = auteur;
    }
    @Override
    public String Affiche() {
        return super.Affiche()+" de "+auteur;
    }
}
