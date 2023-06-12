/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bu;

/**
 *
 * @author HP
 */
class Revue extends Document{
    private int nbPage;
    public Revue(String titre, int nbPage) {
        super(titre);
        this.nbPage = nbPage;
    }
    @Override
    public String Affiche() {
        return super.Affiche()+" compte "+nbPage+" pages";
    }
}
