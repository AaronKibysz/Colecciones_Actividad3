/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadcoleccionesiii.ENUMS_CON_ATRIBUTOS_Y_METODOS;

/**
 *
 * @author Aaron
 */
public enum Continente {
    AMERICA(910000000, 42330000),
    EUROPA(731000000, 10180000),
    AFRICA(922011000, 30370000),
    ASIA(3879000000l, 43810000),
    OCEANIA(27000000, 8720710),
    ANTARTIDA(1000, 13720000);

    private long cantHabitantes;
    private double superficie;

    private Continente(long cantHabitantes, double superficie) {
        this.cantHabitantes = cantHabitantes;
        this.superficie = superficie;
    }

    public double densidadPoblacion() {
        return this.cantHabitantes / this.superficie;
    }

    @Override
    public String toString() {
        return "Continente{" + "cantHabitantes=" + cantHabitantes + ", superficie=" + superficie + '}';
    }
}
