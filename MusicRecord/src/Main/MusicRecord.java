/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Vista.MusicRecordFrame;

/**
 *
 * @author chris
 */
public class MusicRecord{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getName());
                    
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new MusicRecordFrame().setVisible(true);
        });
    }
}
    

