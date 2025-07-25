/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividadcoleccionesiii.BUSCAR_EN_COLECCION;

/**
 *
 * @author Aaron
 */
public class ActividadColeccionesIII {

    public static void main(String[] args) {
        
        //PUNTO A
        Concesionaria c = new Concesionaria("FakeCar");

        // Autos para testear
        c.agregarAuto(new Auto("ABC123", "Rojo", 1003));
        c.agregarAuto(new Auto("DEF456", "Negro", 4000));
        c.agregarAuto(new Auto("BCD234", "Verde", 2000));
        c.agregarAuto(new Auto("DEF458", "Blanco", 4000));
        c.agregarAuto(new Auto("CDE345", "Azul", 3000));
        c.agregarAuto(new Auto("DEF457", "Gris", 4000));

        //Auto a = c.buscarAuto("cualquierCosa");
        Auto a = c.buscarAuto("bcd234");
        if (a == null) {
            System.out.println("No se encontró");
        } else {
            System.out.println("Se encontró: " + a);
        }
        
    }
}
