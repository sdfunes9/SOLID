package com.universidad;

import java.util.Locale;
import java.util.Scanner;

public class adminAcademico extends Empleado{

    public String recibirEntrada(){
        Scanner lector = new Scanner(System.in);
        String entrada = lector.nextLine().toLowerCase();
        return entrada;
    }
    public void registrarMateria(){
        System.out.println("Ingresa el codigo de la materia que deseas registrar");
        String entrada = recibirEntrada();
        Materia materia = new Materia();
        materia.setCodigoMateria(entrada);
        System.out.println("Se creó satisfactoriamente la materia"+ materia.mostrarinfo());
    }
    public void eliminarMateria(Materia materia){
        System.out.println("¿Estas seguro que quieres eliminar la materia? (ingresa S o N)" + materia.mostrarinfo());
        String respuesta = recibirEntrada();
        if (respuesta == "s"){
            materia = null;
        }
        else{
            return;
        }
    }

}
