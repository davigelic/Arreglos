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
public class NivelTres {
    
    //Nivel 3, ejercicio 11
    public void CuantoValor(){
        
        int[] numeros = new int[12];
        
         for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        }
         
        int numeroBuscado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea buscar:"));
        
        int contador = 0;
        
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == numeroBuscado){
                contador++;
            }
        }
        
        JOptionPane.showMessageDialog(null,"El valor " +numeroBuscado+ " aparece " +contador+ " veces");
    }
    
    //Nivel 3, ejercicio 12
    public void ClasificacionCaracteres(){
        
        String mensaje = JOptionPane.showInputDialog("Ingrese un mensaje:");
        
        char[] caracteres = mensaje.toCharArray();

        int vocales = 0;
        int consonantes = 0;
        int simbolos = 0;
        
        for (int i = 0; i < caracteres.length; i++) {
            char caracter = Character.toLowerCase(caracteres[i]);
            if(caracter == 'a'
                || caracter == 'e'
                || caracter == 'i'
                || caracter == 'o'
                || caracter == 'u'){
                vocales++;
            }else if(Character.isLetter(caracter)){
                consonantes++;
            }else{
                simbolos++;
            }
        }
        JOptionPane.showMessageDialog(null,"Clasificación de caracteres"
            + "\nVocales: " +vocales
            + "\nConsonantes: " +consonantes
            + "\nOtros símbolos: " +simbolos);
    }
}
