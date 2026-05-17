package com.mycompany.java_hashmap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Java_hashmap {

    static HashMap<Integer, Estudiante> estudiantes = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("Nombre: ERICK RUBEN HERNANDEZ CHAVEZ");
            System.out.println("Carnet: 9941 24 24182");
            System.out.println();
            System.out.println("===== MENU JAVA HASHMAP =====");
            System.out.println("1. Cargar archivo CSV");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Mostrar estudiantes cargados");
            System.out.println("5. Mostrar estadisticas");
            System.out.println("6. Comparacion C++ y Java");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            while (!sc.hasNextInt()) {
                System.out.print("Ingrese una opcion valida: ");
                sc.next();
            }

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    cargarCSV();
                    break;
                case 2:
                    buscarEstudiante();
                    break;
                case 3:
                    eliminarEstudiante();
                    break;
                case 4:
                    mostrarEstudiantes();
                    break;
                case 5:
                    mostrarEstadisticas();
                    break;
                case 6:
                    mostrarComparacion();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }

            System.out.println();

        } while (opcion != 7);
    }

    public static void cargarCSV() {
        System.out.print("Ingrese nombre del archivo CSV: ");
        String nombreArchivo = sc.nextLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            boolean primeraLinea = true;

            while ((linea = br.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false;
                    continue;
                }

                String[] datos = linea.split(",");

                if (datos.length == 6) {
                    int studentId = Integer.parseInt(datos[0].trim());
                    String nombreCompleto = datos[1].trim();
                    String carrera = datos[2].trim();
                    int semestre = Integer.parseInt(datos[3].trim());
                    double promedio = Double.parseDouble(datos[4].trim());
                    int puntuacion = Integer.parseInt(datos[5].trim());

                    if (!estudiantes.containsKey(studentId)) {
                        Estudiante estudiante = new Estudiante(studentId, nombreCompleto, carrera, semestre, promedio, puntuacion);
                        estudiantes.put(studentId, estudiante);
                    } else {
                        System.out.println("Estudiante duplicado no insertado. ID: " + studentId);
                    }
                }
            }

            br.close();
            System.out.println("Archivo cargado correctamente.");

        } catch (Exception e) {
            System.out.println("Error al abrir o leer el archivo.");
        }
    }

    public static void buscarEstudiante() {
        System.out.print("Ingrese student_id a buscar: ");

        while (!sc.hasNextInt()) {
            System.out.print("Ingrese un ID valido: ");
            sc.next();
        }

        int id = sc.nextInt();
        sc.nextLine();

        if (estudiantes.containsKey(id)) {
            System.out.println("Estudiante encontrado:");
            estudiantes.get(id).mostrar();
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public static void eliminarEstudiante() {
        System.out.print("Ingrese student_id a eliminar: ");

        while (!sc.hasNextInt()) {
            System.out.print("Ingrese un ID valido: ");
            sc.next();
        }

        int id = sc.nextInt();
        sc.nextLine();

        if (estudiantes.containsKey(id)) {
            estudiantes.remove(id);
            System.out.println("Estudiante eliminado correctamente.");
        } else {
            System.out.println("No existe un estudiante con ese ID.");
        }
    }

    public static void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes cargados.");
        } else {
            System.out.println("Estudiantes cargados:");
            for (Estudiante e : estudiantes.values()) {
                System.out.println("-------------------------");
                e.mostrar();
            }
        }
    }

    public static void mostrarEstadisticas() {
        System.out.println("Total de estudiantes cargados: " + estudiantes.size());
        System.out.println("Estructura utilizada: HashMap<Integer, Estudiante>");
        System.out.println("Llave utilizada: student_id");
    }

    public static void mostrarComparacion() {
        System.out.println("En C++ la tabla hash puede crearse manualmente usando arreglos, nodos y punteros.");
        System.out.println("En Java se utiliza HashMap, una estructura nativa ya incluida en el lenguaje.");
        System.out.println("HashMap permite insertar, buscar y eliminar estudiantes de forma mas sencilla usando student_id como llave.");
    }
}