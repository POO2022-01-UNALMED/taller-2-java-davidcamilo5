/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

public class Asiento {

    private String color;
    private int precio = 0;
    private int registro = 0;

    public Asiento(String color, int precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }

    public void cambiarColor(String color) {
        String[] coloresPermitidos = {"rojo", "verde", "amarillo", "negro", "blanco"};
        int permitir = 0;
        String tmp = color;
        tmp = tmp.toLowerCase();
        for (int i = 0; i < coloresPermitidos.length; i++) {
            if (tmp.equals(coloresPermitidos[i])) {
                permitir = 1;
            }
        }
        if (permitir == 1) {
            this.setColor(color);
            System.out.println("Su asiento ahora es de color " + color);
        } else {
            System.out.println("Color no permitido, intentelo de nuevo");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

}
