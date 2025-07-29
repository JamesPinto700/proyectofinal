/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.IOException;
import utiles.UtilidadesE;
/**
 *
 * @author Eduardo Moreno
 */
public class MateriaControl {


    private UtilidadesE util = new UtilidadesE();

    // El archivo será asignado según carrera, el cliente debe setearlo
    public String fileName;

    public MateriaControl(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Guarda una materia en el archivo configurado.
     * La materia se escribe en formato: ciclo \t nombre \t horas \t creditos \t sigla\n
     *
     * @param materia objeto Materia
     * @return true si guardó, false si error
     */
    public boolean guardarMateria(Materia materia) {
        String linea = materia.getCiclo() + "\t" +
                materia.getNombre() + "\t" +
                materia.getHoras() + "\t" +
                materia.getCreditos() + "\t" +
                materia.getSigla() + "\n";
        try {
            util.guardarLineaEnArchivo(linea, fileName);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
