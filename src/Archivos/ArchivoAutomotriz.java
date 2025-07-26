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
public class ArchivoAutomotriz {

    public static void main(String[] args) {
        String rutaArchivo = "materias_automotriz.txt";

        String[] materias = {
            "1\tCalculo de una Variable\t160\t10\tCV",
            "1\tAlgebra Lineal\t80\t5\tAL",
            "1\tFisica Aplicada\t120\t8\tFA",
            "1\tNormalizacion y Diseño Asistido por Computador\t160\t10\tNDAC",
            "1\tQuimica del Automovil\t120\t8\tQA",
            "1\tExpresion Oral y Escrita\t80\t5\tEOE",
            "2\tCalculo de Varias Variables\t120\t8\tCVV",
            "2\tEstatica\t120\t8\tEst",
            "2\tElectricidad Automotriz\t160\t10\tEA",
            "2\tProcesos de Fabricacion del Vehiculo\t120\t8\tPFV",
            "2\tFundamentos de Ciencias de Materiales\t120\t8\tFCM",
            "2\tMetodologia de la Investigacion\t80\t5\tMI",
            "3\tEcuaciones Diferenciales\t120\t8\tED",
            "3\tElasticidad y Resistencia de Materiales\t160\t10\tERM",
            "3\tElectronica Analogica y Digital\t120\t8\tEAD",
            "3\tDinamica\t120\t8\tDin",
            "3\tSeguridad y Salud Ocupacional\t80\t5\tSSO",
            "3\tEntornos de Trabajo en el Sector Automotriz\t80\t5\tETSA",
            "4\tSistemas de Traslacion\t200\t13\tST",
            "4\tAnalisis Numerico\t80\t5\tAN",
            "4\tMecanica de Fluidos\t120\t8\tMF",
            "4\tTermodinamica\t120\t8\tTermod",
            "4\tDiseño Mecanico\t120\t8\tDM",
            "4\tDiseño de Experimentos\t80\t5\tDE",
            "5\tSistemas de Transmision y Frenado\t200\t13\tSTF",
            "5\tRefrigeracion y Climatizacion Vehicular\t120\t8\tRCV",
            "5\tTransporte Sostenible\t120\t8\tTS",
            "5\tTransferencia de Calor\t80\t5\tTC",
            "5\tTeoria de Mecanismos de Transporte\t120\t8\tTMT",
            "5\tLiderazgo y Emprendimiento\t80\t5\tLE",
            "6\tMotores de Encendido Provocado\t200\t13\tMEP",
            "6\tDinamica del Automovil\t120\t8\tDA",
            "6\tElectronica Automotriz\t120\t8\tEA",
            "6\tGestion del Mantenimiento\t80\t5\tGM",
            "6\tTecnologia del Transporte y Sistemas Automotrices\t80\t5\tTTSA",
            "7\tMotores de Encendido por Compresion\t200\t13\tMEC",
            "7\tVehiculos Electricos e Hibridos\t120\t8\tVEH",
            "7\tAutotronica\t120\t8\tAuto",
            "7\tReglamentacion y Regulacion Vehicular\t80\t5\tRRV",
            "7\tTeoria de Control\t80\t5\tTC",
            "8\tSistemas de Inyeccion\t160\t10\tSI",
            "8\tComputadoras Automotrices\t120\t8\tCA",
            "8\tDeontologia\t40\t3\tDeont",
            "8\tGerencia Administrativa y Financiera\t80\t5\tGAF",
            "8\tDesarrollo e Innovacion en el Transporte\t120\t8\tDIT",
            "9\tEscritura y Publicacion Cientifica\t120\t8\tEPC",
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
