package com.universidad;

import java.util.List;

public class adminFinanciero extends Empleado implements Sueldos
    public void gestionarPagos(Estudiantes estudiante){
        ArrayList<String> meses = new ArrayList<>(Arrays.asList("enero, febrero ,marzo ,abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre"))
        System.out.println("el pago del mes de"+estudiante.getNombre() + estudiante.getApellido() + "fue procesado");
    }
}
