/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author LOQ78
 */
public class Materia {
    private int ciclo;
    private String tipo;    // nuevo campo
    private String nombre;
    private int horas;
    private int creditos;
    private String sigla;

    public Materia(int ciclo, String tipo, String nombre, int horas, int creditos, String sigla) {
        this.ciclo = ciclo;
        this.tipo = tipo;
        this.nombre = nombre;
        this.horas = horas;
        this.creditos = creditos;
        this.sigla = sigla;
    }

    public int getCiclo() {
        return ciclo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getSigla() {
        return sigla;
    }
}


