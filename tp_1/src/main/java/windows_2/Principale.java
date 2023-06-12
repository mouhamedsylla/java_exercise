/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package windows_2;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author sylla
 */
public class Principale extends JFrame{
    JMenuBar barreMenus ;
    JMenu Fichier, Edition, Aide, Fermer;
    JMenuItem Ouvrir, Enregistrer, Enregistrer2, Fermer1, Fermer2, Fermer3;
    JTextArea text;
    JScrollPane scrollPane;
    JList list;
    JComboBox combos;
    JCheckBox bouton1, bouton2, bouton3, bouton4, bouton5;
    JRadioButton rad1, rad2, rad3, rad4, rad5;
    int DEFAULT_POSITION_WIDTH;
    int DEFAULT_POSITION_HEIGHT;
    
    public Principale() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        DEFAULT_POSITION_WIDTH = dim.width/4 - this.getWidth()/4;
        DEFAULT_POSITION_HEIGHT = dim.height/4 - this.getHeight()/4;
        setBounds(DEFAULT_POSITION_WIDTH, DEFAULT_POSITION_HEIGHT, 650, 400);
        Container content = getContentPane();
        
        barreMenus = new JMenuBar();
        setJMenuBar(barreMenus);
        Fichier = new JMenu("Fichier");
        Edition = new JMenu("Edition");
        Aide = new JMenu("Aide");
        
        barreMenus.add(Fichier);
        barreMenus.add(Edition);
        barreMenus.add(Aide);
        
        //Fichier Items
        Ouvrir = new JMenuItem("Ouvrir");
        Enregistrer = new JMenuItem("Enregistrer"); 
        Enregistrer2 = new JMenuItem("Enregistrer sous");
        Fermer = new JMenu("Fermer");
        
        //Fermer sous Items
        Fermer1 = new JMenuItem("Fermer les fichiers");
        Fermer2 = new JMenuItem("Fermer Tout");
        Fermer3 = new JMenuItem("Fermer les projets");
        
        //Add Fichier Items
        Fichier.add(Ouvrir);
        Fichier.add(Enregistrer);
        Fichier.add(Enregistrer2);
        Fichier.add(Fermer);
        
        //Add Fermer Items
        Fermer.add(Fermer1);
        Fermer.add(Fermer2);
        Fermer.add(Fermer3);
        
        text = new JTextArea();
        scrollPane = new JScrollPane(text);
        content.add(scrollPane);
        scrollPane.setBounds(60, 80, 400, 200);
        
        String[] couleurs = {"rouge", "bleu", "gris", "vert","jaune", "noir"};
        list = new JList(couleurs);
        content.add(list);
        list.setBounds(466, 80, 80, 160);
        
        String[] annees = {"1996", "1997", "1998", "1999", "2000"};
        combos = new JComboBox(annees);
        content.add(combos);
        combos.setBounds(552, 80, 70, 20);
        combos.setSelectedIndex(2);
        
        bouton1 = new JCheckBox("case1");
        content.add(bouton1);
        bouton1.setBounds(58, 280, 60, 20);
        
        bouton2 = new JCheckBox("case2");
        content.add(bouton2);
        bouton2.setBounds(148, 280, 60, 20);

        bouton3 = new JCheckBox("case3");
        content.add(bouton3);
        bouton3.setBounds(238, 280, 60, 20);
        
        bouton4 = new JCheckBox("case4");
        content.add(bouton4);
        bouton4.setBounds(328, 280, 60, 20);

        bouton5 = new JCheckBox("case5");
        content.add(bouton5);
        bouton5.setBounds(418, 280, 60, 20);
        
        rad1 = new JRadioButton("option1");
        content.add(rad1);
        rad1.setBounds(58, 300, 70, 20);
        
        rad2 = new JRadioButton("option2");
        content.add(rad2);
        rad2.setBounds(148, 300, 70, 20);
        
        rad3 = new JRadioButton("option3");
        content.add(rad3);
        rad3.setBounds(238, 300, 70, 20);
        
        rad4 = new JRadioButton("option4");
        content.add(rad4);
        rad4.setBounds(328, 300, 70, 20);
        
        rad5 = new JRadioButton("option5");
        content.add(rad5);
        rad5.setBounds(418, 300, 70, 20);
        
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }
    
    public static void main(String[] args) {
        Principale p = new Principale();
    }
}
