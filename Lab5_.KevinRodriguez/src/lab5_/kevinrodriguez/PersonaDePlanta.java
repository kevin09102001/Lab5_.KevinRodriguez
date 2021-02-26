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
public class PersonaDePlanta {
    public String Nombre, apellido, cargo, facultad,carreraasignada,claseasignada;
    public int numregistro;

    public PersonaDePlanta() {
    }

    public PersonaDePlanta(String Nombre, String apellido, String cargo, String facultad, String carreraasignada, String claseasignada, int numregistro) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.facultad = facultad;
        this.carreraasignada = carreraasignada;
        this.claseasignada = claseasignada;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCarreraasignada() {
        return carreraasignada;
    }

    public void setCarreraasignada(String carreraasignada) {
        this.carreraasignada = carreraasignada;
    }

    public String getClaseasignada() {
        return claseasignada;
    }

    public void setClaseasignada(String claseasignada) {
        this.claseasignada = claseasignada;
    }

    public int getNumregistro() {
        return numregistro;
    }

    public void setNumregistro(int numregistro) {
        this.numregistro = numregistro;
    }
    
}
