package com.universidad;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

abstract public class Empleado extends Usuario{
    @Getter @Setter
    private double salarioEmpleado;
    @Getter @Setter
    private String rol;
    @Getter @Setter
    private String cuentaBancaria;
    @Getter @Setter
    private String profesion;

    public Empleado() {
    }

    public Empleado(int idUsuario, String nombre, String apellido, char sexo, Date fechaNacimiento, String statusUsuario, double salarioEmpleado) {
        super(idUsuario, nombre, apellido, sexo, fechaNacimiento, statusUsuario);
        this.salarioEmpleado = salarioEmpleado;
    }
}
