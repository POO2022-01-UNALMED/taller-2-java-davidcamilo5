/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

public class Auto {

    Scanner sc = new Scanner(System.in);
    private String modelo;
    private int precio = 0;
    private Asiento[] asientos;
    private String marca;
    public Motor motor;
    private int registro = 0;
    private int cantidadCreados = 0;

    public Auto(String modelo, int precio, String marca, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
        this.registro = registro;
    }

    public void numeroAsientos(int n) {
        this.asientos = new Asiento[n];
    }

    public void llenarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            System.out.print("Digite el color del asiento: ");
            String colorAsiento = sc.nextLine();
            System.out.print("Digite el precio del asiento: ");
            int precioAsiento = Integer.parseInt(sc.nextLine());
            System.out.print("Digite el registro del asiento: ");
            int registroAsiento = Integer.parseInt(sc.nextLine());
            asientos[i] = new Asiento(colorAsiento, precioAsiento, registroAsiento);
        }
    }

    public void definirMotor() {
        System.out.print("Digite el cilindraje del motor: ");
        int cilindrajeMotor = Integer.parseInt(sc.nextLine());
        System.out.print("Indique el tipo de motor (Gasolina | Electrico): ");
        String tipo = sc.nextLine();
        System.out.print("Digite el registro del motor: ");
        int registroMotor = Integer.parseInt(sc.nextLine());
        this.setMotor(new Motor(cilindrajeMotor, tipo, registroMotor));

    }

    int cantidadAsientos() {
        int tmp = 0;
        for (Asiento asiento : this.asientos) {
            if (asiento != null) {
                tmp++;
            }
        }
        return tmp;
    }

    String verificarIntegridad() {
        Asiento registroAsiento = null;
        if (motor.getRegistro() == registro) {

            for (int i = 0; i < (asientos.length - 1); i++) {
                if (asientos[i].getRegistro() == asientos[i + 1].getRegistro()) {
                    registroAsiento = asientos[i];
                } else {
                    registroAsiento = asientos[i + 1];
                }
            }
            if (registro == registroAsiento.getRegistro()) {
                return "Auto Original";
            } else {
                return "Las piezas no son originales";
            }
        }
        return "Error, intentelo nuevamente";
    }

//Getter y Setter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Asiento[] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[] asientos) {
        this.asientos = asientos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public int getCantidadCreados() {
        return cantidadCreados;
    }

    public void setCantidadCreados(int cantidadCreados) {
        this.cantidadCreados = cantidadCreados;
    }

}
