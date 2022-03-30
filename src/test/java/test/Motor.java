/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

public class Motor {

    private int numeroCilindros;
    private String tipo;
    private int registro = 0;

    public Motor(int numeroCilindros, String tipo, int registro) {
        this.numeroCilindros = numeroCilindros;
        this.tipo = tipo;
        this.registro = registro;
    }

    public void cambiarRegistro(int registro) {
        this.setRegistro(registro);
        System.out.print("Su nuevo registro es: " + this.getRegistro());
    }

    public void asignarTipo(String tipo) {
        String[] tiposPermitido = {"gasolina", "electrico"};
        int permitir = 0;
        String tmp = tipo;
        tmp = tmp.toLowerCase();
        for (int i = 0; i < tiposPermitido.length; i++) {
            if (tmp.equals(tiposPermitido[i])) {
                permitir = 1;
            }
        }
        if (permitir == 1) {
            this.setTipo(tipo);
            System.out.print("Su motor ahora es de tipo " + tipo);
        } else {
            System.out.println("Tipo no permitido, intentelo de nuevo");
        }
    }

    //Getter y Setter
    public int getNumeroCilindros() {
        return numeroCilindros;
    }

    public void setNumeroCilindros(int numeroCilindros) {
        this.numeroCilindros = numeroCilindros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

}
