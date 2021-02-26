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
public class administrativos {
    public String Nombre,apellido, cargo, áreaAsignada, nombreasistente,nomjefeasignado;
    public int numregistro, cansubordinados;

    public administrativos() {
    }

    public administrativos(String Nombre, String apellido, String cargo, String áreaAsignada, String nombreasistente, String nomjefeasignado, int numregistro, int cansubordinados) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.áreaAsignada = áreaAsignada;
        this.nombreasistente = nombreasistente;
        this.nomjefeasignado = nomjefeasignado;
        this.numregistro = numregistro;
        this.cansubordinados = cansubordinados;
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

    public String getÁreaAsignada() {
        return áreaAsignada;
    }

    public void setÁreaAsignada(String áreaAsignada) {
        this.áreaAsignada = áreaAsignada;
    }

    public String getNombreasistente() {
        return nombreasistente;
    }

    public void setNombreasistente(String nombreasistente) {
        this.nombreasistente = nombreasistente;
    }

    public String getNomjefeasignado() {
        return nomjefeasignado;
    }

    public void setNomjefeasignado(String nomjefeasignado) {
        this.nomjefeasignado = nomjefeasignado;
    }

    public int getNumregistro() {
        return numregistro;
    }

    public void setNumregistro(int numregistro) {
        this.numregistro = numregistro;
    }

    public int getCansubordinados() {
        return cansubordinados;
    }

    public void setCansubordinados(int cansubordinados) {
        this.cansubordinados = cansubordinados;
    }

    @Override
    public String toString() {
        return Nombre ;
    }
    
    
}
