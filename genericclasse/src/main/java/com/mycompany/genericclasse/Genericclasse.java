/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.genericclasse;

/**
 *
 * @author sylla
 */
public class Genericclasse {

    public static void main(String[] args) {
        Document doc = new Document("La recherche");
        Pile maPile = new Pile(5);
        maPile.push(doc);
        
        Document d = (Document)maPile.pop();
        // ce pile ne s'applique qu'aux documents
        // par exemple si on voulait une pile qui contiendrais des objets de type Integers
        // On pourrait à la place type Document mettre le type Object qui prendrait à la place n'importe quelle objet
        // ici l'utilisation du methode pop nécessite une transtypage
        
        Pile maPile2 = new Pile(3);
        maPile2.push(new Integer(4));
        
        Integer i = (Integer)maPile2.pop();
        
        // l'utilisation de la classe Object étant trés vague, les classes génériques seraient plus convenable 
    }
}
