/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadcoleccionesiii.ENUMS_CON_ATRIBUTOS_Y_METODOS;

/**
 *
 * @author Aaron
 */
public class Principal {
    public static void main(String[] args) {
        Continente[] continentes = Continente.values();
        for (int i = 0; i < continentes.length; i++) {
            System.out.println(continentes[i].densidadPoblacion());
        }
    }
}
