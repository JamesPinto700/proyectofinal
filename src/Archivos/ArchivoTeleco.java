/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author LOQ78
 */
public class ArchivoTeleco {
    
    public static void main(String[] args) {
        String rutaArchivo = "materias_telecomunicaciones.txt";

        String[] materias = {
            "1\tFisica Basica\t160\t10\tFB",
            "1\tCalculo de una Variable\t160\t10\tCV",
            "1\tAlgebra Lineal\t120\t8\tAL",
            "1\tFundamentos de la Programacion\t80\t5\tFP",
            "1\tMatematica Discreta\t120\t8\tMD",
            "1\tExpresion oral y Escrita\t80\t5\tEOyE",
            "2\tFisica Aplicada\t160\t10\tFA",
            "2\tCalculo Multivariable\t120\t8\tCM",
            "2\tEcuasiones Diferenciales\t160\t10\tED",
            "2\tProbabilidad y Estatica\t120\t8\tPE",
            "2\tCircuitos Electricos\t120\t8\tCE",
            "2\tInterculturalidad\t40\t3\tInter",
            "3\tTeoria Electromagnetica\t120\t8\tTE",
            "3\tSeñales y Sistemas\t120\t8\tSS",
            "3\tProcesos Estocasticos\t80\t5\tPE",
            "3\tProgramacion Aplicada\t80\t5\tPA",
            "3\tElectronica Analogica y Digital\t160\t10\tEAyD",
            "4\tLineas de Transmision\t120\t8\tLT",
            "4\tProcesamiento Digital de Señales\t160\t10\tPDS",
            "4\tComunicacion Analogicas\t120\t8\tCA",
            "4\tTeoria de la Informacion\t120\t8\tTI",
            "4\tSistemas Microprocesadores\t120\t8\tSM",
            "4\tInnovacion y Emprendimiento\t80\t5\tIE",
            "5\tElectronica de Alta Frecuencia\t120\t8\tEAF",
            "5\tAntenas\t160\t10\tAte",
            "5\tComunicaciones Digitales\t160\t10\tCD",
            "5\tIngenieria de Trafico\t120\t8\tIT",
            "5\tFundamentos de Redes de Datos\t160\t10\tFRD",
            "6\tRadio Propagacion\t120\t8\tRP",
            "6\tComunicacion Opticas\t120\t8\tCO",
            "6\tSistemas Operativos\t80\t5\tSO",
            "6\tRedes de Datos\t120\t8\tRD",
            "7\tComunicaciones Inalambricas\t160\t10\tCI",
            "7\tRedes de Acceso\t160\t10\tRA",
            "7\tComunicacion Unificaciones\t120\t8\tCU",
            "7\tIngenieria Economica\t80\t5\tIE",
            "8\tRedes Celulares\t120\t8\tRC",
            "8\tSeguridad de Redes\t160\t10\tSR",
            "8\tAplicaciones de Telecomunicaciones\t80\t5\tAT",
            "8\tMarco Regulatorio de Telecomunicaciones\t80\t5\tMRT",
            "9\tUnidad de Integracion\t360\t23\tUIC"
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) { // BufferedWriter para escritura eficiente [1]
            for (String linea : materias) {
                bw.write(linea); // Escribe la línea [1]
                bw.newLine();    // Agrega un salto de línea [1]
            }
            System.out.println("Archivo '" + rutaArchivo + "' creado con éxito.");
        } catch (IOException e) { // Manejo de posibles errores de E/S [1]
            System.err.println("Error al crear el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
