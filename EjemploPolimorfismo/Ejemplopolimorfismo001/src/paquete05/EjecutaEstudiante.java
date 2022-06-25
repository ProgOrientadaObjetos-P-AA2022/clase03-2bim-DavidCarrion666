package paquete05;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.        
         */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador;

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        //  ArrayList<EstudiantePresencial> estudiantesP = new ArrayList<>();

        // inicio de solución
        System.out.println("Ingrese El numero de Estudiantes Presencial desea "
                + "ingresar");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese El numero de Estudiantes Distancia desea "
                + "ingresar");
        int num2 = entrada.nextInt();
        entrada.nextLine();

        System.out.println("------------------------------------------------");
        System.out.println("Se van a ingresar  Estudiantes Presencial");
        for (int i = 0; i < num1; i++) {

            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();
            entrada.nextLine();
            EstudiantePresencial estudianteP = new EstudiantePresencial();
            System.out.println("Ingrese el número de créditos");
            numeroCreds = entrada.nextInt();
            System.out.println("Ingrese el costo de cada créditos");
            costoCred = entrada.nextDouble();
            entrada.nextLine();

            estudianteP.establecerNombresEstudiante(nombresEst);
            estudianteP.establecerApellidoEstudiante(apellidosEst);
            estudianteP.establecerIdentificacionEstudiante(identificacionEst);
            estudianteP.establecerEdadEstudiante(edadEst);
            estudianteP.establecerNumeroCreditos(numeroCreds);
            estudianteP.establecerCostoCredito(costoCred);
            estudiantes.add(estudianteP);

        }
        System.out.println("------------------------------------------------");
        System.out.println("Se van a ingresar  Estudiantes Presencial");
        for (int i = 0; i < num2; i++) {
            EstudianteDistancia estudianteD = new EstudianteDistancia();
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese el número de asignaturas");
            numeroAsigs = entrada.nextInt();
            System.out.println("Ingrese el costo de cada cada asignatura");
            costoAsig = entrada.nextDouble();

            // se hace uso de los métodos establecer para asignar valores
            // a los datos (atributos) del objeto
            estudianteD.establecerNombresEstudiante(nombresEst);
            estudianteD.establecerApellidoEstudiante(apellidosEst);
            estudianteD.establecerIdentificacionEstudiante(identificacionEst);
            estudianteD.establecerEdadEstudiante(edadEst);
            estudianteD.establecerNumeroAsginaturas(numeroAsigs);
            estudianteD.establecerCostoAsignatura(costoAsig);
            estudiantes.add(estudianteD);

        }

        for (int i = 0; i < estudiantes.size(); i++) {

            estudiantes.get(i).calcularMatricula();

            System.out.printf("%s\n",
                    estudiantes.get(i));

        }
    }

}
