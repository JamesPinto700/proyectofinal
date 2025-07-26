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
public class ArchivoElectricidad {

    public static void main(String[] args) {
        String rutaArchivo = "materias_electricidad.txt";

        String[] materias = {
            "1\tCalculo de una Variable\t160\t10\tCV",
            "1\tFisica\t160\t10\tFis",
            "1\tAlgebra Lineal\t160\t10\tAL",
            "1\tExpresion Oral y Escritura\t80\t5\tEOE",
            "1\tDibujo Tecnico\t80\t5\tDT",
            "1\tProgramacion 1\t80\t5\tPro1",
            "2\tCalculo de Varias Variables\t160\t10\tCVV",
            "2\tEstatica\t160\t10\tEst",
            "2\tDeontologia y Ejes de Igualdad\t80\t5\tDEI",
            "2\tMetodologia de la Investigacion\t160\t10\tMI",
            "3\tCircuitos Electricos\t160\t10\tCE",
            "3\tTeoria Electromagnetica\t120\t8\tTE",
            "3\tEcuaciones Diferenciales\t160\t10\tED",
            "3\tDinamica\t120\t8\tDin",
            "3\tAnalisis Socioeconomico y Politico del Mundo Contemporaneo\t80\t5\tASPMC",
            "4\tMetodos Numericos y Optimizacion\t120\t8\tMNO",
            "4\tEnergias Alternativas\t80\t5\tEA",
            "4\tElectricidad Analogica\t120\t8\tElecA",
            "4\tCircuitos Electricos II\t160\t10\tCEII",
            "4\tAnalisis de Señales de Sistemas\t80\t5\tASS",
            "5\tProbabilidad y Estatica\t120\t8\tPE",
            "5\tMaquinas Electricas I\t120\t8\tMEI",
            "5\tElectronica Digital\t120\t8\tED",
            "5\tControl Automatico\t160\t10\tCA",
            "5\tProcesos Transitorios\t120\t8\tPT",
            "6\tMaquinas Electricas II\t120\t8\tMEII",
            "6\tAlto Voltaje\t120\t8\tAV",
            "6\tElectronica de Potencia\t160\t10\tEP",
            "6\tOperacion y Control de Maquinas Electricas\t120\t8\tOCME",
            "6\tAutomatizacion Industrial y Sistemas Electricas SCADA\t120\t8\tAISS.SCADA",
            "7\tCentrales de Generacion Electrica\t120\t8\tCGE",
            "7\tInvestigacion de Operaciones\t120\t8\tOP",
            "7\tRedes Inteligentes y Generacion Distribuida\t120\t8\tRIGD",
            "7\tSistemas Electricos de Potencia I\t120\t8\tSEPI",
            "7\tInstalaciones Electricas Residenciales y Comerciales\t120\t8\tIERC",
            "8\tLineas de Transmision y Sub Estaciones\t120\t8\tLTSE",
            "8\tProtecciones Electricas\t160\t10\tPE",
            "8\tInstalaciones Electricas Industriales y Calidad de la Energia\t120\t8\tIEICE",
            "8\tSistemas Electricos de Potencia II\t120\t8\tSEPII",
            "8\tOperacion y Estabilidad de Sistemas Electricos de Potencia\t120\t8\tOESEP",
            "8\tProyecto de Titulacion\t80\t5\tPT",
            "9\tDiseño de Redes de Distribucion\t120\t8\tDRD",
            "9\tEmprendimiento e Innovacion\t160\t10\tEI",
            "9\tUnidad de Integracion Curricular\t360\t23\tUIC"
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (String linea : materias) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Archivo '" + rutaArchivo + "' creado con éxito.");
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }
}

