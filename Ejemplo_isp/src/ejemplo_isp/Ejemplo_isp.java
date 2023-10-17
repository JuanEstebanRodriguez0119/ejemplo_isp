
package ejemplo_isp;

import java.util.Scanner;


public class Ejemplo_isp {

  
    
    public static void main(String[] args) {

        int opc = 0;
        Scanner txt = new Scanner (System.in);
        System.out.println("Bienvenid@! A que rol de la universidad deseas entrar? : ");
        System.out.println(" (1) Profesor \n (2) Estudiante \n (3) Celador \n (4) Administrativo/a \n (5) Rector");
        opc = txt.nextInt();
        switch (opc){
            case 1 : 
                System.out.println("Hola Profesor/a! Aqui se encuentran sus metodos: \n____________________________________________________");  
                Acciones.Asistir_clase();
                Acciones.Dictar_clase();
                Acciones.Enseñar();
                Acciones.Aprender();
                Acciones.Dejar_trabajos();
                Acciones.Calificar();
            break;
            
            case 2 : 
                System.out.println("Hola Estudiante! Aqui se encuentran sus metodos: \n____________________________________________________"); 
                Acciones.Asistir_clase();
                Acciones.Aprender();
                Acciones.Entregar_trabajos();
                Acciones.Enseñar();
            break;
            
            case 3 : 
                System.out.println("Hola Celador/a! Aqui se encuentran sus metodos: \n____________________________________________________"); 
                Acciones.Vigilar();
            break;
            
            case 4 : 
                System.out.println("Hola Administrativo/a! Aqui se encuentran sus metodos: \n____________________________________________________");
                Acciones.Aprender();
                Acciones.Gestionar_registros();
                Acciones.Entregar_trabajos();
                Acciones.Enseñar();
            break;
            
            case 5 : 
                System.out.println("Hola Rector/a! Aqui se encuentran sus metodos: \n____________________________________________________");
                Acciones.Gestionar_personal_academico();
                Acciones.Gestionar_administrativos();
                Acciones.Gestionar_registros();
                Acciones.Enseñar();
                Acciones.Aprender();
                
            break;
        }
           
    }
    
}
