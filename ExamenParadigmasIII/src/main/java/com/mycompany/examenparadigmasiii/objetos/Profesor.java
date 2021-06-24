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
public class Profesor {
    
    private String legajo;

    public Profesor(String legajo) {
        this.legajo = legajo;
    }

    public Profesor() {
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Profesor{" + "legajo=" + legajo + '}';
    }
    
    
    
}
