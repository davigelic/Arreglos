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
public class NivelCuatro {
    
    //Nivel 4, ejercicio 15
    public void RotacionDerecha(){
        int[] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        }
        
        int ultimo = numeros[numeros.length - 1];
        
        for (int i = numeros.length - 1; i > 0; i--){
            numeros[i] = numeros[i - 1];
        }
        
        numeros[0] = ultimo;
        String mensaje = "Arreglo rotado:\n";
         
        for (int i = 0; i < numeros.length; i++){
            mensaje += numeros[i] + " ";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    //Nivel 4, ejercicio 16
    public void ValidacionIndices(){
        
        int[] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        }
        //Solicitando los indices
        int indiceUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer índice"));
        int indiceDos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer índice"));
        
        if (indiceUno >= 0 && indiceUno < numeros.length && indiceDos >= 0 && indiceDos < numeros.length){
            
            //Intercambio de esos valores
            int indice= numeros[indiceUno];
            numeros[indiceUno] = numeros[indiceDos];
            numeros[indiceDos] = indice;
            
            String mensaje = "Arreglo después del intercambio:\n";

            for (int i = 0; i < numeros.length; i++) {
                mensaje += numeros[i]+" ";
            }
            JOptionPane.showMessageDialog(null, mensaje);
        } else{
            JOptionPane.showMessageDialog(null,"Error: uno o ambos índices no son válidos.");
        } 
    }
}
