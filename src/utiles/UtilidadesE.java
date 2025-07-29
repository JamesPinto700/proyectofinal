/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utiles;

import java.io.*;
/**
 *
 * @author Eduardo Moreno
 */
public class UtilidadesE {


    private final String path = "data";

    /**
     * Guarda un texto en un archivo dentro de la carpeta `data`.
     * Se abre en modo de agregar (append).
     * Crea la carpeta "data" si no existe.
     *
     * @param texto texto a guardar (una línea con tabuladores)
     * @param nombreArchivo nombre del archivo
     * @throws IOException si no se puede escribir
     */
    public void guardarLineaEnArchivo(String texto, String nombreArchivo) throws IOException {
        File carpeta = new File(path);
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }
        try (FileWriter fw = new FileWriter(new File(carpeta, nombreArchivo), true)) {
            fw.write(texto);
        }
    }

    /**
     * Cuenta las líneas del archivo.
     *
     * @param nombreArchivo nombre del archivo
     * @return número de líneas o 0 si no existe
     * @throws IOException
     */
    public int contarRegistros(String nombreArchivo) throws IOException {
        File archivo = new File(path, nombreArchivo);
        if (!archivo.exists()) return 0;

        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            while (br.readLine() != null) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Cuenta las columnas (número de campos del primer registro).
     *
     * @param nombreArchivo nombre del archivo
     * @return número de columnas o 0 si vacío/no existe
     * @throws IOException
     */
    public int contarColumnas(String nombreArchivo) throws IOException {
        File archivo = new File(path, nombreArchivo);
        if (!archivo.exists()) return 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea = br.readLine();
            if (linea != null && !linea.trim().isEmpty()) {
                return linea.split("\t").length;
            }
        }
        return 0;
    }
}
