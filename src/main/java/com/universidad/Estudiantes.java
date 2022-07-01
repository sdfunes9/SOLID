package com.universidad;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;

public class Estudiantes extends Usuario implements Estudiante {

    Scanner x = new Scanner(System.in);
    Carrera carrera = new Carrera();
    int increment = 0;
    @Setter @Getter
    private double promedio;

    @Setter @Getter
    private String idCarrera;

    @Setter @Getter
    List<List<String>> alumnos = new ArrayList<>();

    @Setter @Getter
    ArrayList<Double> notas = new ArrayList<>();

    @Setter @Getter
    ArrayList<String>historialMaterias = new ArrayList<>();

    public Estudiantes(){

    }

    public Estudiantes(int idUsuario, String nombre, String apellido, String sexo, Date fechaNacimiento, String statusUsuario, double promedio, String idCarrera, List<List<String>>  alumnos, ArrayList<Double> notas, ArrayList<String> historialMaterias) {
        super(idUsuario, nombre, apellido, sexo, fechaNacimiento, statusUsuario);
        this.promedio = promedio;
        this.idCarrera = idCarrera;
        this.alumnos = alumnos;
        this.notas = notas;
        this.historialMaterias = historialMaterias;
    }
    @Override
    public ArrayList<Double> listarNotas() {


    return notas;

    }

    @Override
    public void listarMaterias() {



    }

    @Override
    public void registrarEstudiante() {

        List<String> alumno = new ArrayList<>();
        System.out.println("A.Nombre completo del estudiante: ");
        System.out.println("Nombre: ");
        setNombre(x.next());
        System.out.println("Apellido: ");
        setApellido(x.next());
        System.out.println("B.Sexo: ");
        setSexo(x.next());
        System.out.println("C.Fecha de nacimiento");
        Date date = new Date(x.nextInt(),x.nextInt(), x.nextInt());
        setFechaNacimiento(date);
        System.out.println("D.Status: ");
        setStatusUsuario(x.next());
        increment += 1;
        setIdUsuario(increment);
        alumno.add(getNombre());
        alumno.add(getApellido());
        alumno.add(getSexo());
        alumno.add(String.valueOf(getFechaNacimiento()));
        alumno.add(getStatusUsuario());
        String ver = carrera.Carreras();
        alumno.add(ver);
        alumno.add(String.valueOf(getIdUsuario()));
        alumnos.add(alumno);

        System.out.println("Alumno registrado con exito. Desea registrar otro estudiante?: " + "1.Si" + "2.No");

        int registro = x.nextInt();

        if(registro == 1){
            registrarEstudiante();
        }else{
            System.out.println("okey");
        }
    }
    @Override
    public void listarEstudiantes(){
        System.out.println("listado: ");

        if(getAlumnos().size() == 0){

            System.out.println("No hay estudiantes registrados");

        }else {

            for (int i = 0; i < getAlumnos().size(); i++) {

                System.out.println("Alumno: " + (i+1) + " " + alumnos.get(i));

            }
        }
    }

    @Override
    public void registrarCarreraEstudiante() {

    }
}
