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
public class Estudiante {
    public String Nombre, apellido, carrestudia, equipo,facultadadpertenece,cantClases,beca,automivil;
    public int numregistro;

    public Estudiante() {
    }

    public Estudiante(String Nombre, String apellido, String carrestudia, String equipo, String facultadadpertenece, String cantClases, String beca, String automivil, int numregistro) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.carrestudia = carrestudia;
        this.equipo = equipo;
        this.facultadadpertenece = facultadadpertenece;
        this.cantClases = cantClases;
        this.beca = beca;
        this.automivil = automivil;
        this.numregistro = numregistro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrestudia() {
        return carrestudia;
    }

    public void setCarrestudia(String carrestudia) {
        this.carrestudia = carrestudia;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getFacultadadpertenece() {
        return facultadadpertenece;
    }

    public void setFacultadadpertenece(String facultadadpertenece) {
        this.facultadadpertenece = facultadadpertenece;
    }

    public String getCantClases() {
        return cantClases;
    }

    public void setCantClases(String cantClases) {
        this.cantClases = cantClases;
    }

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }

    public String getAutomivil() {
        return automivil;
    }

    public void setAutomivil(String automivil) {
        this.automivil = automivil;
    }

    public int getNumregistro() {
        return numregistro;
    }

    public void setNumregistro(int numregistro) {
        this.numregistro = numregistro;
    }

    @Override
    public String toString() {
        return Nombre ;
    }
    
}
