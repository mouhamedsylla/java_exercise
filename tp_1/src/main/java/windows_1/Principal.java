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
import java.awt.*;
public class Principal {
    public static void main(String[] args) {
        JFrame fen = new MaFenetre();
        
         
        JPanel pannel = new JPanel();
        JTextArea text = new JTextArea("Ma TextArea");
        //Par défaut, la taille du composant augmente au fur et à mesure de l'augmentation de la taille du texte qu'il contient. Pour
        //éviter cet effet, il faut encapsuler le JTextArea dans un JScrollPane.
        JScrollPane scrollPane = new JScrollPane(text);
        scrollPane.setPreferredSize(new Dimension(400,250));
        scrollPane.setLocation(100, 100);
        //scrollPane.setBounds(100, 100, 50, 100);

        
        String[] couleurs = {"rouge", "bleu", "gris", "vert","jaune", "noir"};
        JList MaListe =	new JList(couleurs);

        String[] annees = {"1996", "1997", "1998", "1999", "2000"};
        JComboBox MaCombo = new JComboBox(annees);
        MaCombo.setSelectedIndex(2);
        
        JCheckBox bouton1 = new JCheckBox("Case 1");  
        JCheckBox bouton2 = new JCheckBox("Case 2");
        JCheckBox bouton3 = new JCheckBox("Case 3");
        JCheckBox bouton4 = new JCheckBox("Case 4");
        JCheckBox bouton5 = new JCheckBox("Case 5");
        
        JRadioButton radio1 = new JRadioButton("Option 1");
        JRadioButton radio2 = new JRadioButton("Option 2");
        JRadioButton radio3 = new JRadioButton("Option 3");
        JRadioButton radio4 = new JRadioButton("Option 4");
        JRadioButton radio5 = new JRadioButton("Option 5");
        
    
 

        pannel.add(scrollPane);
        pannel.add(MaListe);
        pannel.add(MaCombo);
        pannel.add(new JSeparator(SwingConstants.HORIZONTAL));
        pannel.add(bouton1);
        pannel.add(bouton2);
        pannel.add(bouton3);
        pannel.add(bouton4);
        pannel.add(bouton5);
        pannel.add(new JSeparator(SwingConstants.HORIZONTAL));
        pannel.add(radio1);
        pannel.add(radio2);
        pannel.add(radio3);
        pannel.add(radio4);
        pannel.add(radio5);
        
        fen.getContentPane().add(pannel);
        
        
        
        fen.setVisible(true);
       
                }
}
