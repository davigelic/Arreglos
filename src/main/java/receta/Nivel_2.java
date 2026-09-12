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
public class Nivel_2 
{
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
    
}//fin de la clase
