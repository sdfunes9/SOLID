package com.universidad;

import java.util.Date;
import java.util.Scanner;

public class AdminAcademico extends Empleado{

    public AdminAcademico() {
    }

    public AdminAcademico(int idUsuario, String nombre, String apellido, char sexo, Date fechaNacimiento, String statusUsuario, double salarioEmpleado) {
        super(idUsuario, nombre, apellido, sexo, fechaNacimiento, statusUsuario, salarioEmpleado);
    }

    public void registrarMateria(){
        System.out.println("Ingresa el código de la materia que deseas registrar");
        String[] materias
        int entrada = recibirNumero();
        Materia materia = new Materia();

        System.out.println("Se creó satisfactoriamente la materia"+ materia.mostrarinfo());
    }
    public void eliminarMateria(Materia materia){
        System.out.println("¿Estas seguro que quieres eliminar la materia?" + materia.mostrarinfo()+ " (ingresa S o N)");
        String respuesta = recibirEntrada();
        if (respuesta == "s"){
            materia = null;
        }
        else{
            return;
        }
    }
    private String recibirEntrada(){
        Scanner lector = new Scanner(System.in);
        String entrada = lector.nextLine().toLowerCase();
        return entrada;
    }
    private int recibirNumero(){
        Scanner lector = new Scanner(System.in);
        int entrada =lector.nextInt();
        return entrada;
    }
}
