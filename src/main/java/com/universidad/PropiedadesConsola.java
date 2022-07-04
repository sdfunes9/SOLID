package com.universidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PropiedadesConsola {
    private int consoleWidth;
    private int consoleHeight;
    private int maxConsoleWidth;
    private int maxConsoleHeight;
    private String sistemaOperativo;

    public PropiedadesConsola() {
        obtenerInformacionSobrePlataforma();
        definirDimensionesConsola();
    }

    private void obtenerInformacionSobrePlataforma() {
        this.sistemaOperativo = System.getProperty("os.name");
    }

    private void definirDimensionesConsola() {
        if(sistemaOperativo.toLowerCase().contains("win")) {
            this.consoleWidth = Integer.parseInt(obtenerSalidaDeConsola("powershell.exe", "(Get-Host).UI.RawUI.WindowSize.Width")[0]);
            this.consoleHeight = Integer.parseInt(obtenerSalidaDeConsola("powershell.exe", "(Get-Host).UI.RawUI.WindowSize.Height")[0]);
        }
        System.out.println("Ajustando la impresion...");
        System.out.println("Console Width: " + this.consoleWidth);
        System.out.println("Console Height: " + this.consoleHeight);
//        System.out.println("Max Console Window Size: "
//                + Arrays.toString(Arrays.stream(obtenerSalidaDeConsola("powershell.exe", "(Get-Host).UI.RawUI.MaxWindowSize")[3]
//                .split("\\s+")).toList().stream().filter(s -> s.matches("^[-+]?\\d+(\\.\\d+)?$")).toArray()));

        System.out.println("Max Console Window Size: "
                + Arrays.toString(obtenerSalidaDeConsola("powershell.exe", "(Get-Host).UI.RawUI.MaxWindowSize")[3].trim().split("\\s+")));
    }

    public String[] obtenerSalidaDeConsola(String... command) {
        Process process;
        ProcessBuilder psBuilder = new ProcessBuilder(command);
        psBuilder.redirectErrorStream(true);
        List<String> salidaConsola = new ArrayList<>();

        try {
            process = psBuilder.start();
            InputStream inputStream = process.getInputStream();
            BufferedReader buffReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;

            while((line = buffReader.readLine()) != null) {
                salidaConsola.add(line);
            }

            buffReader.close();
            inputStream.close();
            process.destroy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return salidaConsola.toArray(new String[0]);
    }

    public void limpiarConsola() {

        if(sistemaOperativo.toLowerCase().contains("win")) {
            ProcessBuilder psBuilder = new ProcessBuilder("powershell.exe", "clear");
            try {
                psBuilder.inheritIO().start().waitFor();
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.flush();
        //System.out.print("\033[H\033[2J")
    }

    public void imprimirLineaConNumerales() {
        String lineLength = "%" + this.consoleWidth + "s";
        System.out.println(String.format(lineLength, " ").replace(" ", "#"));
    }

    public void imprimirTextoCentrado(String texto) {
        String leftPadding = "%" + (((this.consoleWidth - texto.length()) / 2) + texto.length()) + "s";
        System.out.printf(leftPadding + "%n", texto);
    }
}
