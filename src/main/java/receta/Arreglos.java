/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receta;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Arreglos 
{
    //nivel 1, ejercicio 1
    public void Doblecito()
    {
        //creación y definición del arreglo
        double[] numeros = {3.14, 14.15, 6.7, 45.46};

        //ciclo for
        for (int i = 0; i < numeros.length; i++)
        {
            JOptionPane.showMessageDialog(null, "Los números decimales son: " + numeros[i]);
        } //fin del ciclo for
        
    } //fin del método Doblecito
    
    //nivel 1, ejercicio 2
    public void Bulianito()
    {
        boolean[] veracidad={false, false, true, false, true, true};
        for (int i = 0; i < veracidad.length; i++)
        {
            JOptionPane.showMessageDialog(null, "Los valores son equivalentes a: " + veracidad[i]);
        }//fin del for
       
    }//fin del método
}//fin de la clase
