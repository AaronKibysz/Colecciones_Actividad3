/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadcoleccionesiii.ENUMS_METODOS_UTILES;

/**
 *
 * @author Aaron
 */
public class Principal {
    public static void main(String[] args) {
//        System.out.println(NivelEstudio.PRIMARIO.ordinal());
//        System.out.println(NivelEstudio.PRIMARIO.toString());

//        NivelEstudio[] niveles = NivelEstudio.values();
//        for (int i = 0; i < niveles.length; i++) {
//            System.out.println((i + 1) + ") " + niveles[i]);
//        }
//        int opcUsuario = Consola.leerEntero("Ingrese su nivel de estudios: ");
//        System.out.println("Usted eligió " + niveles[opcUsuario - 1]);
        NivelEstudio.valueOf("PRIMARIO"); // Funciona
        NivelEstudio.valueOf("primario"); // Lanza IllegalArgumentException
    }
}
