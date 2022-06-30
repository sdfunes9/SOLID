package com.universidad;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Estudiantes extends Usuario implements Estudiante {

    @Setter @Getter
    private double promedio;

    @Setter @Getter
    private String idCarrera;

    @Setter @Getter
    ArrayList<Double> notas = new ArrayList<>();


    @Setter @Getter
    ArrayList<String>historialMaterias = new ArrayList<>();








    @Override
    public ArrayList<Double> listarNotas() {


   return notas;

    }

    @Override
    public void listarMaterias() {



    }

    @Override
    public void registrarEstudiante() {



    }
}
