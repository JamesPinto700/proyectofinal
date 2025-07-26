/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.util.List;
/**
 *
 * @author LOQ78
 */
public class Utiles {


    // Suma créditos de una lista de Materia
    public static int sumarCreditos(List<Materia> materias) {
        int suma = 0;
        for (Materia m : materias) {
            suma += m.getCreditos();
        }
        return suma;
    }

    // Suma el valor total de las materias, dado valor unitario por crédito
    public static double sumarValorMaterias(List<Materia> materias, double valorPorCredito) {
        int totalCreditos = sumarCreditos(materias);
        return totalCreditos * valorPorCredito;
    }
}

