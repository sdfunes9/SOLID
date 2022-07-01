package com.universidad;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Carrera {

    @Setter @Getter
    private List<Integer> idCarrera = Arrays.asList(0 ,1 , 2, 3, 4, 5);


    @Setter @Getter
    private List<String> nombreCarrera = Arrays.asList(" ", "Arquitectura", "Odontologia", "Ing.Informatica", "Sociologia", "Contabilidad");

    public Carrera(){

    }

    public Carrera(List<Integer> idCarrera, List<String> nombreCarrera) {
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
    }

    public String Carreras(){

        Scanner x = new Scanner(System.in);
        int i = 0;
        String registrarCarrera = "";

        System.out.println("Registro para carrera de: ");

        for(i = 0; i < idCarrera.size(); i++){

            System.out.println(idCarrera.get(i) + ". " + nombreCarrera.get(i));

        }

        int opcion = x.nextInt();

        for(i = 1; i < idCarrera.size(); i++){

            if(opcion == idCarrera.get(i)){

                registrarCarrera = nombreCarrera.get(opcion);

            }
        }

        return registrarCarrera;
    }

}
