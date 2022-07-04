package com.universidad;

import com.universidad.adminAcademico.*;
import java.util.Scanner;

public class adminPersonal extends Empleado{

    public void agregarUsuario(){
        int respuesta = recibirEntrada();
        imprimirMensaje();
        do {
                switch (respuesta) {
                    case 0:
                        System.out.println("Se creará un nuevo estudiante");

                        break;
                    case 1:
                        System.out.println("Se creará un nuevo estudiante");
                        Estudiantes estudiante = new Estudiantes();
                        String nombre = recibirDatos();
                        estudiante.setNombre(nombre);
                        String apellido = recibirDatos();
                        estudiante.setApellido(apellido);
                        System.out.println("Se creó el estudiante "+ estudiante.getNombre()+ " "+estudiante.getApellido()
                        );
                        break;
                    case 2:
                        System.out.println("Se creará un nuevo Maestro");
                        Maestro maestro = new Maestro();
                        String nombre = recibirDatos();
                        maestro.setNombre(nombre);
                        String apellido = recibirDatos();
                        maestro.setApellido(apellido);
                        System.out.println("Se creó el maestro "+ maestro.getNombre()+ " "+maestro.getApellido()
                        );
                        break;
                    case 3:
                        System.out.println("Se creará un nuevo Adminstrador Academico");
                        adminAcademico admin = new adminAcademico();
                        String nombre = recibirDatos();
                        admin.setNombre(nombre);
                        String apellido = recibirDatos();
                        admin.setApellido(apellido);
                        System.out.println("Se creó el administrador Academico"+ estudiante.getNombre()+ " "+estudiante.getApellido()
                        );
                        break;
                    case 4:
                        System.out.println("Se creará un nuevo Administrador Financiero");
                        adminFinanciero admin = new adminFinanciero();
                        String nombre = recibirDatos();
                        admin.setNombre(nombre);
                        String apellido = recibirDatos();
                        admin.setApellido(apellido);
                        System.out.println("Se creó el Administrador Financiero"+ estudiante.getNombre()+ " "+estudiante.getApellido()
                        );
                        break;
                    case 5:
                        System.out.println("Se creará un nuevo Administrador de Personal");
                        adminPersonal admin = new adminPersonal();
                        String nombre = recibirDatos();
                        admin.setNombre(nombre);
                        String apellido = recibirDatos()
                        admin.setApellido(apellido);
                        System.out.println("Se creó el administrador de Personal"+ estudiante.getNombre()+ " "+estudiante.getApellido()
                        );
                        break;
                    default:
                        System.out.println("Ingresa un numero valido o uelve a intentarlo por favor");
                }

        }

    }
    public void eliminarUsuario(Usuario usuario){
        System.out.println("Se eliminará el usuario "+ usuario.getNombre()+ " "+usuario.getApellido());
        usuario = null;
    }
    private int recibirEntrada(){
        Scanner lector = new Scanner(System.in);
        int entrada =lector.nextInt();
        return entrada;
    }
    private String recibirDatos(){
        Scanner lector = new Scanner(System.in);
        String entrada =lector.nextLine();
        return entrada;
    }

    private void imprimirMensaje(){
        System.out.println("Seleccionar el numero  del tipo de usuario que deseas registrar");
        System.out.println("1-Estudiante");
        System.out.println("2-Maestro");
        System.out.println("3-Adminstrador Academico");
        System.out.println("4-Administrador Financiero");
        System.out.println("5-Administrador de Personal");
        System.out.println("0-Salir");
    }

}
