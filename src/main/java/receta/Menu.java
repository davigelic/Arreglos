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
public class Menu {

    private int opcion;
    private int opcioncita;

    public void Menu() {
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                               ============== Sistema de Arreglos ==============
                                                              ¡Bienvenido, por favor seleccione una dificultad!
                                                            
                                                                1. Dificultad básica
                                                                2. Dificultad básica-intermedia
                                                                3. Dificultad intermedia
                                                                4. Dificultad intermedia-alta
                                                                5. Dificultad avanzada
                                                                6. Salir
                                                               """));

            switch (opcion) {
                case 1: {
                    opcioncita = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                            Seleccione el ejercicio que desea consultar:
                                                                            1. Primer ejercicio
                                                                            2. Segundo ejercicio
                                                                            3. Tercer ejercicio
                                                                            4. Cuarto ejercicio
                                                                            5. Regresar
                                                                            """));

                    if (opcioncita == 1) 
                    {
                        Nivel_1 receta = new Nivel_1();
                        receta.Doblecito();

                    }
                    if (opcioncita == 2) 
                    {
                        Nivel_1 receta = new Nivel_1();
                        receta.Bulianito();
                    }
                }
                break;

                case 2: {
                    opcioncita = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                            Seleccione el ejercicio que desea consultar:
                                                                            1. Primer ejercicio
                                                                            2. Segundo ejercicio
                                                                            3.  Tercer ejercicio
                                                                            4.  Cuarto ejercicio
                                                                            """));
                    if (opcioncita == 1)
                    {
                        Nivel_2 receta = new Nivel_2();
                        receta.SegundoDoubulcito();
                        
                    }//fin del primer if
                    if (opcioncita == 2)
                    {
                        JOptionPane.showMessageDialog(null, "Accediendo a lista de asistencia...");
                        Nivel_2 receta = new Nivel_2();
                        receta.SegundoBuliancito();
                    }//fin del segundo if
                }
                break;

                case 3: {
                    opcioncita = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                            Seleccione el ejercicio que desea consultar:
                                                                            1. Primer ejercicio
                                                                            2. Segundo ejercicio
                                                                            3.  Tercer ejercicio
                                                                            4.  Cuarto ejercicio
                                                                            """));
                    if (opcioncita == 1)
                    {
                         Nivel_3 receta = new Nivel_3();
                        receta.MeyorEntero();
                        
                    }//fin del primer if
                    if (opcioncita == 2)
                    {
                        Nivel_3 receta = new Nivel_3();
                        receta.Buscador();
                    }//fin del segundo if
                    
                }
                break;

                case 4: {
                    opcioncita = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                            Seleccione el ejercicio que desea consultar:
                                                                            1. Primer ejercicio
                                                                            2. Segundo ejercicio
                                                                            3.  Tercer ejercicio
                                                                            4.  Cuarto ejercicio
                                                                            """));
                    if (opcioncita == 1)
                    {
                        Nivel_4 receta = new Nivel_4();
                        receta.Inversion();
                    }//fin del primer if
                    if (opcioncita == 2)
                    {
                        Nivel_4 receta = new Nivel_4();
                        receta.CopiaArreglo();
                    }//fin del segundo if
                    
                    
                }
                break;

                case 5: {
                    opcioncita = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                            Seleccione el ejercicio que desea consultar:
                                                                            1. Primer ejercicio
                                                                            2. Segundo ejercicio
                                                                            3.  Tercer ejercicio
                                                                            4.  Cuarto ejercicio
                                                                            """));
                    if (opcioncita == 1)
                    {
                        Nivel_5 receta = new Nivel_5();
                        receta.TresArreglos();
                    }//fin del primer if
                    if (opcioncita == 2)
                    {
                        Nivel_5 receta = new Nivel_5();
                        receta.Precio();
                    }//fin del segundo if
                }
                break;

                case 6: {
                    JOptionPane.showMessageDialog(null, "Gracias por consultar");
                }
                break;

                default: {
                    JOptionPane.showMessageDialog(null, "Opción errónea");
                }//fin del default

             }//fin del switch
            
            }while(opcion !=6);
        }
    }//fin de la clase
