package com.universidad;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class Maestro extends Empleado{

    @Getter @Setter
   private String materiaImpartida;

    public void  registrarNotas(){
        Scanner entrada = new Scanner(System.in);
        Estudiantes e1 = new Estudiantes();
        String nombreestudiante = entrada.nextLine();
        double notasregistrar = entrada.nextDouble();



    System.out.println("Escribir nombre del alumno");

     for (int i = 0; i< e1.alumnos.size(); i++){
    if(e1.alumnos.get(i) == nombreestudiante) {

        e1.notas.add(notasregistrar);

    }
    }










    }






}
