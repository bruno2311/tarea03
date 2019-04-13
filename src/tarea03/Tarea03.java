/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Tarea03 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      ArrayList lista = new ArrayList();
      int contador =0;
      double promedio=0;
      while (contador<10){
         Alumno a = new Alumno();
         a.setNombre("Alumno"+Integer.toString(contador+1));
         a.setEdad((int) (Math.random()*50+1));
         if (contador<3){
            a.setCarrera("Ing. de sistemas");
         } else{
            if ((contador<7) && (contador>3)){
               a.setCarrera("Derecho");
            } else{a.setCarrera("Administración");}
         }
         lista.add(a);
         contador+=1;
         promedio=promedio+a.getEdad();
      }
      System.out.println("Contador= "+contador);
      System.out.println("Suma de edades= "+promedio);
      System.out.println(lista.toString());
      promedio=promedio/contador;
      System.out.println("Promedio de edades= "+promedio);
      double redondeado= Math.round(promedio);
      System.out.println("Promedio de edades redondeado= "+redondeado);
     
      System.out.println("Promedio de edades redondeado= "+lista.get(0));
      
      contador=0;
      String carrera1="";
      String carrera2="";
      String carrera3="";
      while (contador<10){
         Alumno b = (Alumno) lista.get(contador);
         switch (b.carrera){
            case "Ing. de sistemas":{carrera1=carrera1+b.getNombre()+" "+b.getEdad()+ " "+b.getCarrera()+"; ";break;}
            case "Derecho":{carrera2=carrera2+b.getNombre()+" "+b.getEdad()+ " "+b.getCarrera()+"; ";break;}
            case "Administración":{carrera3=carrera3+b.getNombre()+" "+b.getEdad()+ " "+b.getCarrera()+"; ";break;}
         }
         contador+=1;
      }
      System.out.println("----------IMPRESION POR CARRERA----------");
      System.out.println("----------Ing. de sistemas----------");
      System.out.println(carrera1);
      System.out.println("----------Derecho----------");
      System.out.println(carrera2);
      System.out.println("----------Administración----------");
      System.out.println(carrera3);
   }
   
}
