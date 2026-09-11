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
    
    //nivel 2, ejercicio 5
    public void SegundoDoubulcito()
    {
        double[] promDouble={4.0, 6.0, 8.0, 1.8, 6.7, 5.8, 9.0, 4.14};
        double promedio=0;
        double dividir=0;
        double total=0;
        for (int i=0; i < promDouble.length; i++)
        {
            dividir=promDouble[i]+=promedio;
            total=dividir*100/8;
        }//fin del ciclo
        
        JOptionPane.showMessageDialog(null, "El promedio general corresponde a: "+total);
        
    }//fin del método
    
    public void SegundoBuliancito()
    {
        boolean[] alumnos={false, false, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, false, false, false};
        int presentes=0;
        int ausentes=0;
        double promedio=0;
        
        for (int i=0; i < alumnos.length; i++)
        {
            if (alumnos[i]==true)
            {
                presentes++;
            }else
            {
                ausentes++;
            }//fin del if else
        }//fin del for
        
        promedio= (presentes*100)/alumnos.length;
        
        JOptionPane.showMessageDialog(null, "Hay "+presentes+" presentes, y "+ausentes+" alumnos ausentes."
                                            +"\n El promedio de estudiantes presentes equivale a: "+promedio+"%");
        
    }//fin del método
    
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
    
}//fin de la clase
