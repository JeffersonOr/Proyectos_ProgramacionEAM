/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Mascota;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ControllerMascota {

    private ArrayList<Mascota> listaMascotas;

    public ControllerMascota() {

        listaMascotas = new ArrayList<>();

    }

    /////////BuscarMascota
    public Mascota buscarMascota(int code) {

        for (int i = 0; i < listaMascotas.size(); i++) {
            if (code == listaMascotas.get(i).getCodigo()) {
                return listaMascotas.get(i);
            }
        }

        return null;

    }

    /////////GuardarMascota
    public boolean guardarMascota(Mascota mascota) {

        Mascota aux = buscarMascota(mascota.getCodigo());

        if (aux == null) {

            if (mascota.getEdadMeses() < 12 || mascota.getEdadMeses() > 96) {

                return false;

            } else {

                if (listaMascotas.size() < 10) {
                    listaMascotas.add(mascota);
                    return true;
                }
            }
        }

        return false;

    }

    ////////ModificarMascota
    public boolean modificarMascota(Mascota mascota) {

        Mascota aux = buscarMascota(mascota.getCodigo());

        for (int i = 0; i < listaMascotas.size(); i++) {

            if (aux != null) {

                listaMascotas.get(i).setCodigo(mascota.getCodigo());
                listaMascotas.get(i).setEdadMeses(mascota.getEdadMeses());
                listaMascotas.get(i).setRaza(mascota.getRaza());
                listaMascotas.get(i).setNombreMascota(mascota.getNombreMascota());
                listaMascotas.get(i).setSexo(mascota.getSexo());

                return true;
            }

        }

        return false;

    }

    //////EliminarMascota
    public boolean eliminarMascota(Mascota mascota) {

        Mascota aux = buscarMascota(mascota.getCodigo());

        for (int i = 0; i < listaMascotas.size(); i++) {

            if (aux != null) {
                listaMascotas.remove(i);
                return true;
            }

        }

        return false;
    }

    public int contarHembras() {
        int count = 0;

        for (int i = 0; i < listaMascotas.size(); i++) {
            if (listaMascotas.get(i).getSexo().equals("H")) {

                count = count + 1;

            }
        }

        return count;

    }

    public void crearTabla() {

        DefaultTableModel modelo = new DefaultTableModel();
        JTable miTabla = new JTable();
        String[] columnNames = {"Id", "Nombre Mascota", "Edad", "Raza", "Genero"};
        modelo.setColumnIdentifiers(columnNames);

        try {
            Object[] fila = new Object[modelo.getColumnCount()];
            for (int i = 0; i < listaMascotas.size(); i++) {
                fila[0] = listaMascotas.get(i).getCodigo();
                fila[1] = listaMascotas.get(i).getNombreMascota();
                fila[2] = listaMascotas.get(i).getEdadMeses();
                fila[3] = listaMascotas.get(i).getRaza();
                fila[4] = listaMascotas.get(i).getSexo();
                modelo.addRow(fila);

            }

            miTabla.setModel(modelo);

        } catch (Exception ex) {

            System.err.println("Error >:o");

        }

    }

}
