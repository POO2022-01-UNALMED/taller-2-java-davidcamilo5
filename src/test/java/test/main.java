/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        //Asiento asiento = new Asiento();
        //asiento.cambiarColor("rojo");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el registro del carro: ");
        int registro = Integer.parseInt(sc.nextLine());
        Auto auto = new Auto("Serie 8", 20000, "BMW", registro);
        auto.definirMotor();
        auto.numeroAsientos(2);
        auto.llenarAsientos();
        System.out.println("La cantidad de asientos de tipo asientos es de:  " + auto.cantidadAsientos());
        System.out.println(auto.verificarIntegridad());
        auto.motor.asignarTipo("Electrico");
        System.out.println(" ");
        auto.motor.cambiarRegistro(2);
        System.out.println(" ");

    }

}
