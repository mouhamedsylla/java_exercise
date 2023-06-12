/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package windows_1;

/**
 *
 * @author HP
 */
import javax.swing.*;
class MaFenetre extends	JFrame {
    private JMenuBar barreMenus ;
    private JMenu Fichier, Edition, Aide, Fermer;
    private JMenuItem Ouvrir, Enregistrer, Enregistrer2, Fermer1, Fermer2, Fermer3;
    //private JTextArea Mytext;
    public MaFenetre() {
    super("Une fenetre avec un menu");
    setSize(550, 400);
    //création d'une barre de menu
    barreMenus = new JMenuBar();	
    //ajout de la barre	de menu	dans la	fenêtre
    setJMenuBar(barreMenus)	;
    //création d'un menu Couleur et de ses options Rouge et Vert
    Fichier = new JMenu("Fichier")	;
    barreMenus.add(Fichier);
    Ouvrir = new JMenuItem("Ouvrir");
    Fichier.add(Ouvrir);
    //ajout d'une barre	séparatrice avant l'option suivante
    Fichier.addSeparator();
    Enregistrer = new JMenuItem("Enregistrer");
    Fichier.add(Enregistrer);
    Fichier.addSeparator();
    Enregistrer2 = new JMenuItem("Enregistrer Sous");
    Fichier.add(Enregistrer2);
    Edition = new JMenu("Edition");
    barreMenus.add(Edition);
    Aide = new JMenu("Aide");
    barreMenus.add(Aide);
    Fichier.addSeparator();
    Fermer = new JMenu("Fermer");
    Fichier.add(Fermer);
    Fermer1 = new JMenuItem("Fermer les fichiers");
    Fermer.add(Fermer1);
    Fermer.addSeparator();
    Fermer2 = new JMenuItem("Fermer Tout");
    Fermer.add(Fermer2);
    Fermer.addSeparator();
    Fermer3 = new JMenuItem("Fermer les projets");
    Fermer.add(Fermer3);
    //Mytext = new JTextArea();
    //Mytext.setBounds(10, 30, 200, 300);
    
    
    
    //création d'un menu Dimensions et de ses options Hauteur et Largeur
}

}
