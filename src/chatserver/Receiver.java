/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import java.io.DataInputStream;
import javax.swing.*;

/**
 *
 * @author lavee_singh
 */

public class Receiver extends Thread{
    public static DataInputStream dis;
    public JTextArea msgArea;
    public void run(){
        try{
            for(int i = 0; i < 1000; i++){
                String str = (String)dis.readUTF();
                System.out.println("Sender says: " + str);
                String archive = msgArea.getText();
                msgArea.setText(archive + "\nReceived: " + str);
                Thread.sleep(1);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }  
}