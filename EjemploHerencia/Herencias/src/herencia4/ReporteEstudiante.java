/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String est) {
        super(est);
    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    public void establecerPromedioMatriculas() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getMatricula();

        }

        promedioMatriculas = suma / lista.size();
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    public void establecerLista(ArrayList<Estudiante> lt) {
        lista = lt;
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
                    lista.get(i).getMatricula());
        }

        cadena = String.format("%s\nEl total de La Matricula es: %.2f\n", cadena,
                obtenerPromedioMatriculas());

        return cadena;

    }

}
