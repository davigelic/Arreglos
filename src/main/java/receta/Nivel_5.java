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
public class Nivel_5 
{
    //quinto nivel, ejercicio 17
    public void TresArreglos()
    {
        int[] arregloUno={23, 34, 54, 75, 12};
        int[] arregloDos={76, 67, 98, 22, 31};
        String arreglo1="";
        String arreglo2="";
        String total="";
        
        //creación del tercer arreglo 
        int[] resultado=new int[arregloUno.length];
        
        //suma de arreglos
        for (int i=0; i<arregloUno.length; i++)
        {
            resultado[i]=arregloUno[i]+arregloDos[i];
            
            arreglo1+=arregloUno[i]+"";
            arreglo2+=arregloDos[i]+"";
            total+=resultado[i]+"";
            
            
        }//fin del ciclo for
        
        JOptionPane.showMessageDialog(null, "La primera cadena de arreglos es: "+arreglo1
                                           +"\n La segunda cadena de arreglos es: "+arreglo2
                                           +"\n El resultado de la suma de las cadenas es: "+total);
    }//fin del método
    
    public void Precio()
    {
        double[] preciosUno={23.34, 56.67, 98.99, 21.05, 67.00};
        double[] preciosDos={45.00, 34.02, 96.43, 75.25, 28.39};
        double[] diferencias=new double[preciosUno.length];
        double suma=0;
        double promedio=0;
        
        String precios1="";
        String precios2="";
        String lasDiferencias="";
        
        for(int i=0; i<preciosUno.length; i++)
        {
            if (preciosUno[i]>=preciosDos[i])
            {
               diferencias[i]=preciosUno[i]-preciosDos[i]; 
            }
            else
            {
                diferencias[i]=preciosDos[i]-preciosUno[i];
            }//fin del if else
            
            suma+=diferencias[i];
            
            precios1+=preciosUno[i]+" | ";
            precios2+=preciosDos[i]+" | ";
            lasDiferencias+=diferencias[i]+" | ";
            
        }//fin del ciclo
        
        promedio=suma/diferencias.length;
        
        JOptionPane.showMessageDialog(null, "La primera lista de precios es: "+precios1
                                           +"\n La segunda lista de precios es: "+precios2
                                           +"\n La diferencia entre precios es: "+lasDiferencias
                                           +"\n El promedio equivale a: "+promedio);
    }//fin del método
}//fin de la clase
