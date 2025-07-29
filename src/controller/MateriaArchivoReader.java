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
 * @author Eduardo Moreno
 */
public class MateriaArchivoReader {

    private String path = "data";

    public List<Materia> leerMateriasDesdeArchivo(String nombreArchivo) {
        List<Materia> materias = new ArrayList<>();
        File archivo = new File(path, nombreArchivo);

        if (!archivo.exists()) {
            System.out.println("Archivo no encontrado: " + archivo.getAbsolutePath());
            return materias;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) continue;

                String[] tokens = linea.split("\\s+");
                if (tokens.length < 6) {
                    System.out.println("Línea inválida, menos de 6 tokens: " + linea);
                    continue;
                }

                try {
                    int ciclo = Integer.parseInt(tokens[0]);
                    String tipo = tokens[1];

                    int horas = Integer.parseInt(tokens[tokens.length - 3]);
                    int creditos = Integer.parseInt(tokens[tokens.length - 2]);
                    String sigla = tokens[tokens.length - 1];

                    StringBuilder nombreBuilder = new StringBuilder();
                    for (int i = 2; i <= tokens.length - 4; i++) {
                        nombreBuilder.append(tokens[i]);
                        if (i < tokens.length - 4) nombreBuilder.append(" ");
                    }
                    String nombre = nombreBuilder.toString();

                    Materia materia = new Materia(ciclo, tipo, nombre, horas, creditos, sigla);
                    materias.add(materia);
                } catch (NumberFormatException e) {
                    System.out.println("Error parseando línea: " + linea);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return materias;
    }
}
