/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LOQ78
 */
public class MateriaArchivoReader {

    public static List<Materia> leerMateriasDesdeArchivo(String rutaArchivo) {
        List<Materia> materias = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split("\t"); // separa por tabulación
                if (campos.length >= 5) {
                    try {
                        int ciclo = Integer.parseInt(campos[0].trim());
                        String nombre = campos[1].trim();
                        int horas = Integer.parseInt(campos[2].trim());
                        int creditos = Integer.parseInt(campos[3].trim());
                        String sigla = campos[4].trim();

                        materias.add(new Materia(ciclo, nombre, horas, creditos, sigla));
                    } catch (NumberFormatException e) {
                        System.err.println("Error numérico en línea: " + linea);
                    }
                } else {
                    System.err.println("Línea inválida (menos de 5 campos): " + linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error leyendo archivo: " + rutaArchivo);
            e.printStackTrace();
        }

        return materias;
    }
}


