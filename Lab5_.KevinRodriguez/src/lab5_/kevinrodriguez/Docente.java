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
public class Docente{
    public String Nombre, apellido, claseasignado, facultadasignada,trabajadisfacultad,areaconocimiento,laboratorio;
    public int numregistro;

    public Docente() {
    }

    public Docente(String Nombre, String apellido, String claseasignado, String facultadasignada, String trabajadisfacultad, String areaconocimiento, String laboratorio, int numregistro) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.claseasignado = claseasignado;
        this.facultadasignada = facultadasignada;
        this.trabajadisfacultad = trabajadisfacultad;
        this.areaconocimiento = areaconocimiento;
        this.laboratorio = laboratorio;
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

    public String getClaseasignado() {
        return claseasignado;
    }

    public void setClaseasignado(String claseasignado) {
        this.claseasignado = claseasignado;
    }

    public String getFacultadasignada() {
        return facultadasignada;
    }

    public void setFacultadasignada(String facultadasignada) {
        this.facultadasignada = facultadasignada;
    }

    public String getTrabajadisfacultad() {
        return trabajadisfacultad;
    }

    public void setTrabajadisfacultad(String trabajadisfacultad) {
        this.trabajadisfacultad = trabajadisfacultad;
    }

    public String getAreaconocimiento() {
        return areaconocimiento;
    }

    public void setAreaconocimiento(String areaconocimiento) {
        this.areaconocimiento = areaconocimiento;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getNumregistro() {
        return numregistro;
    }

    public void setNumregistro(int numregistro) {
        this.numregistro = numregistro;
    }

    @Override
    public String toString() {
        return  Nombre ;
    }
    
    
}
