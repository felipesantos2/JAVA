/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula01;

import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class Aula01 {

    public static void main(String[] args) {
        
        
//        int idade = 10;;;
        int idade = 19;
        
        if(idade >=18){
            JOptionPane.showMessageDialog(null, "Maior de idade");
        }
        
        String nome =   JOptionPane.showInputDialog("Digite seu nome:");
        
        JOptionPane.showMessageDialog(null, "O nome digitado´foi " + nome);
        
        
        for(int i = 0; i < 10; i++){
            
            JOptionPane.showMessageDialog(null, "oi");
        
        }
        
        
        
      
    }
    
}
