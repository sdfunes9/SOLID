package com.universidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {

    private final PropiedadesConsola consola;

    public Menu(PropiedadesConsola consola){
        this.consola = consola;
    }

    public void imprimirBienvenida() {
        this.consola.limpiarConsola();
        this.consola.imprimirLineaConNumerales();
        this.consola.imprimirTextoCentrado("Bienvenido/a al Sistema de Administración Universitaria. (Version 1.0)");
        this.consola.imprimirLineaConNumerales();
        System.out.println();
        System.out.println("Para continuar debe iniciar sesion!");
        System.out.println("Desea iniciar sesion como ");

    }

}
