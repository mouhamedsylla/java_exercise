/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

/**
 *
 * @author HP
 */
public class Exo1 {
    public static void main(String[] args) {

		int[] entiers = new int[10];
		int somP = 0, somI = 0;
		
		for(int i=0; i<=10; i++) {
			entiers[i] = Integer.parseInt(args[i]);
			if((entiers[i]/2) == 2)
				somP += entiers[i];
			else
				somI += entiers[i];
		}
	}
}
