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
public class MenuMariel {
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

                    if (opcioncita == 3) 
                    {
                        NivelUno receta = new NivelUno();
                        receta.Listita();

                    }
                    if (opcioncita == 4) 
                    {
                        NivelUno receta = new NivelUno();
                        receta.Palabra();
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
                    if (opcioncita == 3)
                    {
                        NivelDos receta = new NivelDos();
                        receta.BuscaVocales();
                        
                    }//fin del primer if
                    if (opcioncita == 4)
                    {
                        JOptionPane.showMessageDialog(null, "Accediendo a lista de asistencia...");
                        NivelDos receta = new NivelDos();
                        receta.TrabajoIndices();
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
                    if (opcioncita == 3)
                    {
                         NivelTres receta = new NivelTres();
                        receta.CuantoValor();
                        
                    }//fin del primer if
                    if (opcioncita == 4)
                    {
                        NivelTres receta = new NivelTres();
                        receta.ClasificacionCaracteres();
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
                    if (opcioncita == 3)
                    {
                        NivelCuatro receta = new NivelCuatro();
                        receta.RotacionDerecha();
                    }//fin del primer if
                    if (opcioncita == 4)
                    {
                        NivelCuatro receta = new NivelCuatro();
                        receta.ValidacionIndices();
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
                    if (opcioncita == 3)
                    {
                        NivelCinco receta = new NivelCinco();
                        receta.ComparacionVecinos();
                    }//fin del primer if
                    if (opcioncita == 4)
                    {
                        NivelCinco receta = new NivelCinco();
                        receta.ComparacionSimetrica();
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
        }//Fin del Menu
}//Fin de la clase

