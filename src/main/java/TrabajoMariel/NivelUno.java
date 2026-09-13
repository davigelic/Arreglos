/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoMariel;

import javax.swing.JOptionPane;

/**
 *
 * @author kaysc
 */
public class NivelUno {
    
        //Nivel 1, ejercicio 3
    public void Listita(){
        
        int[] numeros = new int[8];
        //Lectura de numeros
        for (int i = 0; i < numeros.length; i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        }
        String mensaje="Los valores almacenados son: \n";
        for (int i = 0; i < numeros.length; i++){
            mensaje+=numeros[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }//Fin ejercicio 3
    
    
    //Nivel 1, ejercicio 4
    public void Palabra(){
        
        String palabrita = JOptionPane.showInputDialog("Ingrese una palabra");
        
        char[] caracteres = palabrita.toCharArray();
        
        String mensaje = "Caracteres de la palabra: \n";
        
        for (int i = 0; i<caracteres.length; i++){
            mensaje+=caracteres[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }//Fin ejercicio 4
    
}
