package com.mycompany.java_hashmap;

public class Estudiante {

    private int studentId;
    private String nombreCompleto;
    private String carrera;
    private int semestre;
    private double promedioCalificaciones;
    private int puntuacionHabilidad;

    public Estudiante(int studentId, String nombreCompleto, String carrera, int semestre, double promedioCalificaciones, int puntuacionHabilidad) {
        this.studentId = studentId;
        this.nombreCompleto = nombreCompleto;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedioCalificaciones = promedioCalificaciones;
        this.puntuacionHabilidad = puntuacionHabilidad;
    }

    public int getStudentId() {
        return studentId;
    }

    public void mostrar() {
        System.out.println("ID: " + studentId);
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedioCalificaciones);
        System.out.println("Puntuacion de habilidad: " + puntuacionHabilidad);
    }
}