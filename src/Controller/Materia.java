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
    private Integer ciclo;
    private String nombre;
    private Integer horas;
    private Integer creditos;
    private String sigla;

    public Materia(Integer ciclo, String nombre, Integer horas, Integer creditos, String sigla) {
        this.ciclo = ciclo;
        this.nombre = nombre;
        this.horas = horas;
        this.creditos = creditos;
        this.sigla = sigla;
    }

    // Getters
    public Integer getCiclo() { return ciclo; }
    public String getNombre() { return nombre; }
    public Integer getHoras() { return horas; }
    public Integer getCreditos() { return creditos; }
    public String getSigla() { return sigla; }
}


