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
public class CEO {
    public String Nombre,apellido,nacionalidad, título;
    public int numregistros, edad, añosexperiencia,añosLaborando;

    public CEO() {
    }

    public CEO(String Nombre, String apellido, String nacionalidad, String título, int numregistros, int edad, int añosexperiencia, int añosLaborando) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.título = título;
        this.numregistros = numregistros;
        this.edad = edad;
        this.añosexperiencia = añosexperiencia;
        this.añosLaborando = añosLaborando;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public int getNumregistros() {
        return numregistros;
    }

    public void setNumregistros(int numregistros) {
        this.numregistros = numregistros;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAñosexperiencia() {
        return añosexperiencia;
    }

    public void setAñosexperiencia(int añosexperiencia) {
        this.añosexperiencia = añosexperiencia;
    }

    public int getAñosLaborando() {
        return añosLaborando;
    }

    public void setAñosLaborando(int añosLaborando) {
        this.añosLaborando = añosLaborando;
    }
    
}
