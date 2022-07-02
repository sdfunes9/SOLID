package com.universidad;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

public class Materia {
    @Setter @Getter
    private String codigoMateria;

    @Setter @Getter
    private Date fechaInicio;

    @Setter @Getter
    private Date fechaFin;

    @Setter @Getter
    private String maestroMateria;

    @Setter @Getter
    private String idMateria;

    @Setter @Getter
    private ArrayList<Date> horarioMateria = new ArrayList<>();

    public String mostrarinfo(){


     return codigoMateria;
    }


}
