package com.universidad;

import java.util.Scanner;

public class AdminPersonal extends Empleado{

    public void agregarUsuario(){
            do {
                imprimirMensaje();
                int respuesta = recibirEntrada();
                switch (respuesta) {
                    case 0:
                        System.out.println("Saliste del menú");
                        break;
                    case 1:
                        System.out.println("Se creará un nuevo estudiante");
                        Estudiantes estudiante = new Estudiantes();
                        solicitarNombre();
                        String nombre = recibirDatos();
                        estudiante.setNombre(nombre);
                        solicitarApellido();
                        String apellido = recibirDatos();
                        estudiante.setApellido(apellido);
                        System.out.println("Se creó el estudiante " + estudiante.getIdUsuario() + " " + estudiante.getNombre() + " " + estudiante.getApellido()
                        );
                        break;
                    case 2:
                        System.out.println("Se creará un nuevo Maestro");
                        Maestro maestro = new Maestro();
                        solicitarNombre();
                        String nombre = recibirDatos();
                        maestro.setNombre(nombre);
                        solicitarApellido();
                        String apellido = recibirDatos();
                        maestro.setApellido(apellido);
                        System.out.println("Se creó el maestro " + maestro.getIdUsuario() + " " + maestro.getNombre() + " " + maestro.getApellido()
                        );
                        break;
                    case 3:
                        System.out.println("Se creará un nuevo Adminstrador Academico");
                        AdminAcademico admin = new AdminAcademico();
                        solicitarNombre();
                        String nombre = recibirDatos();
                        admin.setNombre(nombre);
                        solicitarApellido();
                        String apellido = recibirDatos();
                        admin.setApellido(apellido);
                        System.out.println("Se creó el administrador Academico " + admin.getIdUsuario() + " " + admin.getNombre() + " " + admin.getApellido()
                        );
                        break;
                    case 4:
                        System.out.println("Se creará un nuevo Administrador Financiero");
                        AdminFinanciero admin = new AdminFinanciero();
                        solicitarNombre();
                        String nombre = recibirDatos();
                        admin.setNombre(nombre);
                        solicitarApellido();
                        String apellido = recibirDatos();
                        admin.setApellido(apellido);
                        System.out.println("Se creó el Administrador Financiero " + admin.getIdUsuario() + " " + admin.getNombre() + " " + admin.getApellido()
                        );
                        break;
                    case 5:
                        System.out.println("Se creará un nuevo Administrador de Personal");
                        AdminPersonal admin = new AdminPersonal();
                        solicitarNombre();
                        String nombre = recibirDatos();
                        admin.setNombre(nombre);
                        solicitarApellido();
                        String apellido = recibirDatos()
                        admin.setApellido(apellido);
                        System.out.println("Se creó el administrador de Personal " + maestro.getIdUsuario() + " " + admin.getNombre() + " " + admin.getApellido()
                        );
                        break;
                    default:
                        System.out.println("Ingresa un numero valido o velve a intentarlo por favor");
                }
                while (respuest != 3);
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

    private void solicitarNombre(){
        System.out.println("ingresa el nombre");
    }
    private void solicitarApellido(){
        System.out.println("ingresa el apellido");
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
