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
public class ModeloDeTabla extends AbstractTableModel {

    private final String[] columnas = {
        "Número de Ciclo", "Tipo", "Materia", "Horas", "Créditos", "Siglas de la Materia"
    };

    private List<Materia> materias;

    public ModeloDeTabla(List<Materia> materias) {
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
    public String getColumnName(int column) {
        if (column >= 0 && column < columnas.length) {
            return columnas[column];
        }
        return super.getColumnName(column);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Materia materia = materias.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return materia.getCiclo();
            case 1:
                return materia.getTipo();
            case 2:
                return materia.getNombre();
            case 3:
                return materia.getHoras();
            case 4:
                return materia.getCreditos();
            case 5:
                return materia.getSigla();
            default:
                return null;
        }
    }

    // Si quieres, puedes agregar este método para obtener la Materia de una fila dada
    public Materia getMateriaAt(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < materias.size()) {
            return materias.get(rowIndex);
        }
        return null;
    }
}
