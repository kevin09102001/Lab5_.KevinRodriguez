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
public class Docente extends administrativos{
    public String Nombre1, apellido1, claseasignado, facultadasignada,trabajadisfacultad,areaconocimiento,laboratorio;
    public int numregistro1;

    public Docente() {
    }

    public Docente(String Nombre1, String apellido1, String claseasignado, String facultadasignada, String trabajadisfacultad, String areaconocimiento, String laboratorio, int numregistro1, String Nombre, String apellido, String cargo, String áreaAsignada, String nombreasistente, String nomjefeasignado, int numregistro, int cansubordinados) {
        super(Nombre, apellido, cargo, áreaAsignada, nombreasistente, nomjefeasignado, numregistro, cansubordinados);
        this.Nombre1 = Nombre1;
        this.apellido1 = apellido1;
        this.claseasignado = claseasignado;
        this.facultadasignada = facultadasignada;
        this.trabajadisfacultad = trabajadisfacultad;
        this.areaconocimiento = areaconocimiento;
        this.laboratorio = laboratorio;
        this.numregistro1 = numregistro1;
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
    
}
