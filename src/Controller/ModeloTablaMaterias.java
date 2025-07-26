/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author LOQ78
 */
public class ModeloTablaMaterias extends AbstractTableModel {
    private final String[] columnas = { "Ciclo", "Materia", "Horas", "Créditos", "Sigla" };
    private List<Materia> materias;

    public ModeloTablaMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public int getRowCount() {
        return materias.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Materia m = materias.get(rowIndex);
        switch (columnIndex) {
            case 0: return m.getCiclo();
            case 1: return m.getNombre();
            case 2: return m.getHoras();
            case 3: return m.getCreditos();
            case 4: return m.getSigla();
            default: return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    public Materia getMateriaAt(int rowIndex) {
        return materias.get(rowIndex);  
    }
}
