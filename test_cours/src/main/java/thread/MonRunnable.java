/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

/**
 *
 * @author sylla
 */
class MonRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++)
            System.out.println("coucou");
    }
    
}
