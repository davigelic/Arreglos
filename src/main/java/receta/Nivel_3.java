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
public class Nivel_3 
{
    //tercer nivel, ejercicio 9
    public void MeyorEntero()
    {
        int[] numeros={34, 56, 23, 93, 15, 4, 67, 95, 23, 5};
        int mayor=0;
        int menor=0;
        
        for(int i=0; i < numeros.length; i++)
        {
            if (numeros[i]>mayor)
            {
                mayor=numeros[i];
            }//fin del if
            if (numeros[i]<menor)
            {
                menor=numeros[i];
            }//fin del if
        }//fin del for
        
        JOptionPane.showMessageDialog(null, "Los números dentro del sistema son: "+numeros.length
                                            +"\n El número mayor es: "+mayor
                                            +"\n El número menor es: "+menor);
    }//fin del método
    
    
    //nivel tres, ejercicio 10
    public void Buscador()
    {
        int[] numeros={24, 40, 37, 45, 67, 84, 12, 34, 45};
        int posicion= -1;
        int buscar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número que desea buscar en la línea"));
        
        for (int i=0; i <numeros.length; i++)
        {
            if (numeros[i]==buscar)
            {
                posicion=i;
                break;
            }//fin del if
        }//fin del for
        
        if (posicion != -1)
        {
            JOptionPane.showMessageDialog(null, "El número "+buscar+ " está en la posición: "+posicion);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Resultado: "+posicion+" (El número no existe en el arreglo)");
        } //fin del if else
    }//fin del método
    
}//fin de la clase
