/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class Alumno {
      String nombre;
      int edad;
      String carrera;

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   public String getCarrera() {
      return carrera;
   }

   public void setCarrera(String carrera) {
      this.carrera = carrera;
   }

   @Override
   public String toString() {
      return "\nAlumno{" + "nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + '}';
   }
      
}
