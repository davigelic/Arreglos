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
public class NivelDos {
    
    //Nivel 2, ejercicio 7
    public void BuscaVocales(){
        
        char[] vocales={'a','e','i','o','u'};
        
        String palabrita = JOptionPane.showInputDialog("Ingrese una palabra");
        
        int contador = 0;
        
        for(int i=0; i<palabrita.length();i++){//length()con () en String
            for (char v : vocales){//recorre ls vocales
                if(palabrita.charAt(i)==v) contador++;
            }
        }
        JOptionPane.showMessageDialog(null, "Vocales: "+contador);
    }
    
    //Nivel 2, ejercicio 8
    public void TrabajoIndices(){
        
        int[] numeros = new int[15];
        
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        }
        
        int sumaPares = 0;
        int sumaImpares = 0;
        
        for (int i = 0; i < numeros.length; i++) {

            if (i%2==0) {
                sumaPares+=numeros[i];
            } else {
                sumaImpares+=numeros[i];
            }
        }
        
        JOptionPane.showMessageDialog(null,"Suma de los elementos en índices pares: " + sumaPares
            +"\nSuma de los elementos en índices impares: " + sumaImpares);
        
    }
}
