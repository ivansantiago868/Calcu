/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.showcase.view.button;

/**
 *
 * @author KIVANDY-PC
 */
public class Operacion {
    
     public String numero1;
     public String numero2;
     public String operador;
     
    public String getNumero1() {
            return numero1;
    }
    public void setNumero1(String numero1) {
            this.numero1 = numero1;
    }
    public String getNumero2() {
            return numero2;
    }
    public void setNumero2(String numero2) {
            this.numero2 = numero2;
    }
    public String getOperador() {
            return operador;
    }
    public void setOperador(String operador) {
            this.operador = operador;
    }
        
    public Operacion() {
        numero1 = "";
        numero2 = "";
        operador = "";
    }
}
