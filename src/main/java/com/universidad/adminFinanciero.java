package com.universidad;

import java.util.List;

public class adminFinanciero extends Empleado implements Sueldos
    
        private int pagosPendientes(Estudiantes estudiante, int numeroCuotas){
            int pagos = estudiante.getPagosRealizados() + 1;
            estudiante.setPagosRealizados(pagos);
            int pagosPendientes = numeroCuotas - pagos;
            return pagosPendientes;
    }
        public void gestionarPagos(Estudiantes estudiante){
            int numeroCuotas = estudiante.getNumeroCuotas();
            while (estudiante.getPagosRealizados() <= numeroCuotas){
                int pagosPendientes = pagosPendientes(estudiante, numeroCuotas);
                System.out.println("El pago de "+estudiante.getNombre() +" "+ estudiante.getApellido() + " fue procesado");
                System.out.println("Quedan "+((String)pagosPendientes)+" pagos pendientes en el año");
            } else {
                System.out.println("Ya se procesaron todos los pagos de "+estudiante.getNombre()+ " "+ estudiante.getApellido());
        }

    }
}
