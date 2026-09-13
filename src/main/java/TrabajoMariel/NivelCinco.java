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
public class NivelCinco {
    
    //Nivel 5, ejercicio 19
    public void ComparacionVecinos(){
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de números de la lista"));
        
        if (cantidad <= 0){
            JOptionPane.showMessageDialog(null,"La cantidad debe ser mayor que 0.");
        } else{
            int[] numeros = new int[cantidad];
            
            for (int i = 0; i < numeros.length; i++){
                numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            }
            boolean ordenado = true;
            //Comparacion
            for (int i = 0; i < numeros.length - 1; i++){

                if (numeros[i] > numeros[i + 1]){
                    ordenado = false;
                    break;
                }
                //Resultado
                if (ordenado){
                    JOptionPane.showMessageDialog(null,"El arreglo está ordenado de forma ascendente");
                } else {
                    JOptionPane.showMessageDialog(null,"El arreglo no está ordenado de forma ascendente");
                }
            }//Fin for
        }
    }
    
    //Nivel 5, ejercicio 20
    public void ComparacionSimetrica(){
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de elementos de la lista"));
        
        if (cantidad <= 0){
            JOptionPane.showMessageDialog(null,"La cantidad debe ser mayor que 0");
        } else{
            int[] numeros = new int[cantidad];
            
            for (int i = 0; i < numeros.length; i++){
                numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            }
            
            boolean capicua = true;
            //Comparacion
            for (int i = 0; i < numeros.length / 2; i++){

                int indiceDerecha = numeros.length - 1 - i;

                if (numeros[i] != numeros[indiceDerecha]){
                    capicua = false;
                    break;
                }
            }
            
            //Resultado
            if (capicua){
                JOptionPane.showMessageDialog(null,"El arreglo es capicúa");
            } else{
                JOptionPane.showMessageDialog(null,"El arreglo no es capicúa");
            }
        }
    }
}
