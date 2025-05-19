/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadcoleccionesiii.ENUMS_METODOS_UTILES;

import java.util.ArrayList;
/**
 *
 * @author Aaron
 */
public class Empresa {
    private ArrayList<Persona> listaPersonas;

    public Empresa() {
        this.listaPersonas = new ArrayList<>();
    }

    public void agregarPersona(Persona p) {
        this.listaPersonas.add(p);
    }

    public void mostrarPorNivel(NivelEstudio nivel) {
        for (Persona p : listaPersonas) {
            if (p.getNivelEstudio() == nivel) {
                System.out.println(p);
            }
        }
    }
}
