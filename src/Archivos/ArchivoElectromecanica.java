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
public class ArchivoElectromecanica {

    public static void main(String[] args) {
        String rutaArchivo = "materias_electromecanica.txt";

        String[] materias = {
            "1\tCalculo de una Variable\t160\t10\tCV",
            "1\tDibujo Tecnico\t120\t8\tDT",
            "1\tAlgebra Lineal\t120\t8\tAL",
            "1\tFisica\t120\t8\tFis",
            "1\tDeontologia y Ejes de Igualdad\t80\t5\tDEI",
            "1\tExpresion Oral y Escrita\t120\t8\tEOE",
            "2\tCalculo de Varias Variables\t120\t8\tCVV",
            "2\tDiseño Asistido por Computador\t120\t8\tDAC",
            "2\tLenguaje Programacion\t120\t8\tLP",
            "2\tEstatica\t120\t8\tEst",
            "2\tTaller Mecanico\t120\t8\tTM",
            "2\tMetodologia de la Investigacion\t120\t8\tMI",
            "3\tEcuaciones Diferenciales\t120\t8\tED",
            "3\tTeoria Electromagnetica\t120\t8\tTE",
            "3\tCiencias de los Materiales\t120\t8\tCM",
            "3\tDinamica\t120\t8\tDin",
            "3\tTecnologia de los Metales\t120\t8\tTM",
            "3\tEficiencia Energetica en la Industria\t40\t3\tEEI",
            "4\tCircuitos Electricos I\t120\t8\tCE",
            "4\tMetodos Numericos y Optimizacion\t120\t8\tMNO",
            "4\tTaller Electrico\t120\t8\tTE",
            "4\tMecanica de Solidos\t120\t8\tMS",
            "4\tTermodinamica\t120\t8\tTermod",
            "4\tManufactura Computarizada\t120\t8\tMC",
            "5\tCircuitos Electricos II\t120\t8\tCEII",
            "5\tElectronica Analogica\t120\t8\tEA",
            "5\tMecanica de Fluidos\t120\t8\tMF",
            "5\tTeoria de Mecanismos y Maquinas\t120\t8\tTMM",
            "5\tTransferencia de Calor\t120\t8\tTC",
            "5\tMantenimiento y Seguridad Industrial\t120\t8\tMSI",
            "6\tMaquinas Electricas I\t120\t8\tMEI",
            "6\tElectronica Digital\t120\t8\tED",
            "6\tControl Automatico\t120\t8\tCA",
            "6\tDiseño Mecanico\t120\t8\tDM",
            "6\tSistemas de Conversion de Energia\t40\t3\tSCE",
            "7\tMaquinas Electricas II\t120\t8\tMEII",
            "7\tElectronica de Potencia\t120\t8\tEP",
            "7\tHidraulica y Neumatica\t120\t8\tHN",
            "7\tMaquinas Hidraulicas\t120\t8\tMH",
            "7\tProtecciones Electricas\t120\t8\tPE",
            "8\tCentrales de Generacion Electrica\t120\t8\tCGE",
            "8\tAccionamiento Electrico\t120\t8\tAE",
            "8\tSuministro Electrico\t120\t8\tSE",
            "8\tEnergias Renovables\t120\t8\tER",
            "8\tRedes de Distribucion Electrica\t120\t8\tRDE",
            "9\tEmprendimiento e Ingenieria Financiera\t120\t8\tEIF"
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

