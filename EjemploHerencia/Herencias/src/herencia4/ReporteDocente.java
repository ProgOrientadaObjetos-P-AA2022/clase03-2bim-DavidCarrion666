/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String doc) {
        super(doc);
    }

    public void establecerPromedioSueldos() {
        double suma = 0;

        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getSueldo();

        }
        
        promedioSueldos = suma/ lista.size();

    }

    public void establecerLista(ArrayList<Docente> lt) {
        lista = lt;
    }

    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }

    public ArrayList<Docente> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {

        String cadena = "";
        for (int i = 0; i < lista.size(); i++) {

            cadena = String.format("%s\nNombre: %s\n"
                    + "Apellido: %s\n"
                    + "Edad: %d\n"
                    + "Sueldo: %.2f\n",
                    cadena,
                    lista.get(i).getNombre(),
                    lista.get(i).getApellido(),
                    lista.get(i).getEdad(),
                    lista.get(i).getSueldo());
        }

        cadena = String.format("%s\nEl total de Los Sueldos es: %.2f\n", cadena,
                obtenerPromedioSueldos());

        return cadena;

    }
}
