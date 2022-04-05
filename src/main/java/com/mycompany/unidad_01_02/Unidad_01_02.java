/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.unidad_01_02;

/**
 *
 * @author mlata
 */
public class Unidad_01_02 {

    public static void main(String[] args) {
        var autoMauricio = new Auto();
        autoMauricio.color="plomo";
        autoMauricio.placa="ABF8592";
        autoMauricio.year=2017;
        autoMauricio.marca="chevrolet";
        
        System.out.println(autoMauricio.color+" | "+
                autoMauricio.placa+" | "+
                autoMauricio.year+" | "+
                autoMauricio.marca+" | ");
                
    }
}
