/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_.kevinrodriguez;

/**
 *
 * @author Kevin
 */
public class PersonalConsejoacademico {
    public String nombre,apellido, cargo, puestoconsejo,segundotrabajo,cargosegundotrabajo,nombreacuerdo;
    public int numregistro, cantbecados,numpersonascargo;

    public PersonalConsejoacademico() {
    }

    public PersonalConsejoacademico(String nombre, String apellido, String cargo, String puestoconsejo, String segundotrabajo, String cargosegundotrabajo, String nombreacuerdo, int numregistro, int cantbecados, int numpersonascargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.puestoconsejo = puestoconsejo;
        this.segundotrabajo = segundotrabajo;
        this.cargosegundotrabajo = cargosegundotrabajo;
        this.nombreacuerdo = nombreacuerdo;
        this.numregistro = numregistro;
        this.cantbecados = cantbecados;
        this.numpersonascargo = numpersonascargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPuestoconsejo() {
        return puestoconsejo;
    }

    public void setPuestoconsejo(String puestoconsejo) {
        this.puestoconsejo = puestoconsejo;
    }

    public String getSegundotrabajo() {
        return segundotrabajo;
    }

    public void setSegundotrabajo(String segundotrabajo) {
        this.segundotrabajo = segundotrabajo;
    }

    public String getCargosegundotrabajo() {
        return cargosegundotrabajo;
    }

    public void setCargosegundotrabajo(String cargosegundotrabajo) {
        this.cargosegundotrabajo = cargosegundotrabajo;
    }

    public String getNombreacuerdo() {
        return nombreacuerdo;
    }

    public void setNombreacuerdo(String nombreacuerdo) {
        this.nombreacuerdo = nombreacuerdo;
    }

    public int getNumregistro() {
        return numregistro;
    }

    public void setNumregistro(int numregistro) {
        this.numregistro = numregistro;
    }

    public int getCantbecados() {
        return cantbecados;
    }

    public void setCantbecados(int cantbecados) {
        this.cantbecados = cantbecados;
    }

    public int getNumpersonascargo() {
        return numpersonascargo;
    }

    public void setNumpersonascargo(int numpersonascargo) {
        this.numpersonascargo = numpersonascargo;
    }
    
}
