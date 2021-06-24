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
public class Persona {
    
    private String documento;
    private String apellido_nombre;

    public Persona(String documento, String apellido_nombre) {
        this.documento = documento;
        this.apellido_nombre = apellido_nombre;
    }

    public Persona() {
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getApellido_nombre() {
        return apellido_nombre;
    }

    public void setApellido_nombre(String apellido_nombre) {
        this.apellido_nombre = apellido_nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "documento=" + documento + ", apellido_nombre=" + apellido_nombre + '}';
    }
    
    
    
}
