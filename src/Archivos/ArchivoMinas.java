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
public class ArchivoMinas {

    public static void main(String[] args) {
        String rutaArchivo = "materias_minas.txt";

        String[] materias = {
            "1\tCalculo Diferencial e Integral\t120\t8\tCDI",
            "1\tGeometria Descriptiva\t120\t8\tGD",
            "1\tFisica\t120\t8\tFis",
            "1\tQuimica\t120\t8\tQui",
            "1\tExpresion Oral y Escrita\t120\t8\tEOE",
            "1\tFundamentos de Mineria\t120\t8\tFM",
            "2\tEcuasiones Diferenciales\t120\t8\tED",
            "2\tAnalisis Estadistico y Geosestadistica\t160\t10\tAEyG",
            "2\tTermodinamica\t120\t8\tTer",
            "2\tQuimica Inorganica y Analitica\t120\t8\tQIyA",
            "2\tCambio y Desarrollo Social\t80\t5\tCyDS",
            "2\tGeologia General\t120\t8\tGG",
            "3\tFundamentos Teoricos Mineros\t80\t5\tFTM",
            "3\tGeologia Estructural\t120\t8\tGE",
            "3\tGraficadores\t80\t5\tGra",
            "3\tMineralogia\t80\t5\tMine",
            "3\tMecanico de Fluidos\t120\t8\tMF",
            "3\tTopografia\t200\t13\tTop",
            "4\tPetrografia\t120\t8\tPetro",
            "4\tHidrogeologia\t120\t8\tHidro",
            "4\tResustencia de Materiales\t120\t8\tRM",
            "4\tMecanica de Rocas\t120\t8\tRM",
            "4\tSistemas de Informacion Geografica Aplicacion de Sotfwares Mineros\t120\t8\tSIGASM",
            "4\tGeologia de Minas\t120\t8\tGM",
            "5\tCartografia Geologica\t80\t5\tCG",
            "5\tLegislacion y Leyes Nacionales\t80\t5\tLyLN",
            "5\tGeotecnia Minera\t80\t5\tGM",
            "5\tMaquinaria de Mineria\t80\t5\tMM",
            "5\tYacimientos Minerales-Geologicos del Ecuador\t120\t8\tYAC",
            "5\tCaracterizacion Geologica Minera\t80\t5\tCGM",
            "6\tConstrucciones Mineras de Superficie\t120\t8\tCMS",
            "6\tPerforacion y Voladura\t120\t8\tPyV",
            "6\tEvaluacion de Yacimientos\t120\t8\tEY",
            "6\tExplotacion s Cielo Abierto\t160\t10\tECA",
            "6\tSeguridad Minera\t80\t5\tSM",
            "6\tTransporte Minero\t120\t8\tTM",
            "7\tDrenaje, Ventilacion y Alumbrado\t120\t8\tDVyA",
            "7\tObras Subterraneas\t160\t10\tOS",
            "7\tFranqueo y Etibacion\t120\t8\tFE",
            "7\tExplotacion Subterranea\t160\t10\tES",
            "7\tBeneficio\t160\t10\tBen",
            "8\tIngenieria de la Contaminacion\t80\t5\tIC",
            "8\tProyecto de Titulacion\t160\t10\tPT",
            "8\tPlaneacion y Organizacion de Obras Mineras\t120\t8\tPyOOM",
            "8\tDiseño de Minas\t120\t8\tDM",
            "8\tPerforacion y Volabura de Rocas/Sistema de Explotacion\t80\t5\tPV",
            "9\tAdministracion Ambiental\t120\t8\tAA",
            "9\tAplicacion Informaticas para la Mineria/Automatizacion y Control\t120\t8\tAIM",
            "9\tEconomia Minera\t120\t8\tEM",
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
            e.printStackTrace();
        }
    }
}
