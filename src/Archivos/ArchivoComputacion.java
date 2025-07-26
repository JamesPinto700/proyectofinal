/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author LOQ78
 */
public class ArchivoComputacion {

    public static void main(String[] args) {
        String rutaArchivo = "materias_computacion.txt";

        String[] materias = {
            "1\tAlgebra lineal\t160\t10\tAL",
            "1\tTeoria de la Programacion\t240\t15\tTLP",
            "1\tElectricidad\t180\t12\tElec",
            "1\tMatematicas Discretas\t120\t8\tMD",
            "1\tComunicacion y Redaccion Tecnica\t40\t3\tCyRT",
            "2\tDiseño de Circuito\t120\t8\tCD",
            "2\tAnalisis Matematico\t240\t15\tAnM",
            "2\tTeoria de la Distribucion y Probalidad\t80\t5\tTDP",
            "2\tProgramacion Orientada a Objetos\t200\t13\tPOO",
            "2\tEmprendimiento e Innovacion Tecnologica\t80\t5\tEIT",
            "3\tEsructura de Datos\t160\t10\tED",
            "3\tRequisitos de Software\t160\t10\tRS",
            "3\tEstadisticas Analitica\t80\t5\tEA",
            "3\tArquirtectura de Ordenadores\t80\t5\tAO",
            "3\tBase de Datos\t200\t13\tBD",
            "4\tComplejidad Computacional\t160\t10\tCC",
            "4\tEcuaciones Diferenciales\t120\t8\tED",
            "4\tDiseño de Sotfware\t200\t13\tDS",
            "4\tSistema Operativos\t160\t10\tSO",
            "4\tMetodologia de la Investigacion en Computacion\t80\t5\tMIC",
            "5\tSistemas Digitales\t120\t8\tSD",
            "5\tAnalisis Numerico\t160\t10\tAN",
            "5\tDesarrollo Basado en Plataformas\t200\t13\tDBP",
            "5\tSimulacion\t120\t8\tSim",
            "5\tFumdamentos de Redes de Comunicaciones\t120\t8\tFRC",
            "6\tTeoria de Automatas y Computabilidad Avanzada\t160\t10\tTACA",
            "6\tSistemas Distribuidos\t120\t8\tSD",
            "6\tProcesos de Sotfware\t120\t8\tPS",
            "6\tComputacion en la Nube\t120\t8\tCN",
            "6\tGestion de Redes y Comunicacion\t120\t8\tGRC",
            "7\tALgoritmo, Analisis y Programacion Paralelo\t80\t5\tAAPP",
            "7\tSeguridad de la Informacion\t120\t8\tSI",
            "7\tProyectos Tecnologicos l\t120\t8\tPT1",
            "8\tEtica Profesional\t80\t5\tEP",
            "8\tProyecto Tecnologico 2\t200\t13\tPT2",
            "9\tComposicion de Textos Cientificos en Ingenieria\t160\t10\tCTCI",
            "9\tTrabajo de Integracion Curricular\t360\t23\tTIC"
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (String linea : materias) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Archivo '" + rutaArchivo + "' creado con éxito.");
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


