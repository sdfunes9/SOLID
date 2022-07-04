package com.universidad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        Menu menu = new Menu(new PropiedadesConsola());
        Estudiantes e1 = new Estudiantes();
        Carrera c1 = new Carrera();
        Materia m1 = new Materia();

        menu.imprimirBienvenida();
        int opcion;
        opcion = x.nextInt();

//        do {
//            switch(opcion) {
//                case 1: {
//                    e1.registrarEstudiante();
//                    menu.menu();
//                    opcion = x.nextInt();
//                    break;
//                }
//                case 2: {
//                    e1.listarEstudiantes();
//                    menu.menu();
//                    opcion = x.nextInt();
//                    break;
//                }
//                case 3: {
//                    System.exit(3);
//                    break;
//                }
//
//
//            }
//        }while(opcion != 3);

    }
}
