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
public class Nivel_4
{
    //cuarto nivel, ejercicio 13
    public void Inversion()
    {
        int[] cadena={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String original="";
        String invertida="";
        int auxiliar=0;
        
        for(int i=0; i<cadena.length; i++ )
        {
            original+=cadena[i]+" ";
        }//fin del for
        
        for (int i=0; i<cadena.length/2; i++)
        {
            auxiliar=cadena[i];
            cadena[i]=cadena[cadena.length-1-i];
            cadena[cadena.length-1-i]=auxiliar;
        }//fin del for
    
        for (int i = 0; i < cadena.length; i++)
        {
            invertida+=cadena[i] + " ";
        }//fin del for
        
        JOptionPane.showMessageDialog(null, "Este es el arreglo original: "+original
                                           +"\nEste es el arreglo invertido"+invertida);
    }//fin del método
    
    public void CopiaArreglo()
    {
        int[] enteros={23, 24, 35, 67, 12, 34, 54, 32, 80, 56};
     
        String original="";
        String laCopia="";
        
        //nuevo arreglo del mismo tamaño
        int[] copia=new int[enteros.length];
        //copiar cada elemento
        for (int i=0; i < enteros.length; i++)
        {
            copia[i]=enteros[i];
        }//fin del for
        
        //modificar elementos de la copia
        copia[0]=67;
        
        //comparación de los arreglos
        for (int i=0; i < enteros.length; i++)
        {
            original += enteros[i] + " ";
            laCopia += copia[i] + " ";
        }//fin del for
        
        JOptionPane.showMessageDialog(null, "La cadena original es: "+original
                                            +"\n El arreglo de copia es: "+laCopia);
    }//fin del método
}//fin de la clase
