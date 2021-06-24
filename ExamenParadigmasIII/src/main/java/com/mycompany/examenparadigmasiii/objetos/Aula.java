/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenparadigmasiii.objetos;

/**
 *
 * @author juanoviedo28
 */
public class Aula {
    
    private int numero;
    private int modulo;

    public Aula(int numero, int modulo) {
        this.numero = numero;
        this.modulo = modulo;
    }

    public Aula() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    @Override
    public String toString() {
        return "Aula{" + "numero=" + numero + ", modulo=" + modulo + '}';
    }
    
    
    
}
