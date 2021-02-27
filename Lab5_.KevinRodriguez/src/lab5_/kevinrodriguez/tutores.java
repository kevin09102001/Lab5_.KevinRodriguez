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
public class tutores extends Estudiante{
      private String tutorlab, tutorclase;

    public tutores(String tutorlab, String tutorclase) {
        this.tutorlab = tutorlab;
        this.tutorclase = tutorclase;
    }

    public tutores(String tutorlab, String tutorclase, String Nombre, String apellido, String carrestudia, String equipo, String facultadadpertenece, String cantClases, String beca, String automivil, int numregistro) {
        super(Nombre, apellido, carrestudia, equipo, facultadadpertenece, cantClases, beca, automivil, numregistro);
        this.tutorlab = tutorlab;
        this.tutorclase = tutorclase;
    }

    public String getTutorlab() {
        return tutorlab;
    }

    public void setTutorlab(String tutorlab) {
        this.tutorlab = tutorlab;
    }

    public String getTutorclase() {
        return tutorclase;
    }

    public void setTutorclase(String tutorclase) {
        this.tutorclase = tutorclase;
    }

    @Override
    public String toString() {
        return Nombre;
    }
      
}
