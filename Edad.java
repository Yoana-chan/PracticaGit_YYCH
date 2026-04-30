
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pomuch8
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
     for(int n= 1;n<10; n++){
       
         System.out.print("Teclee la fecha_act;");
         int fecha_act= scanner.nextInt();
         
         System.out.print("Teclee la fecha_nac;");
         int fecha_nac=scanner .nextInt();
         
         int edad=fecha_act - fecha_nac;
         
         
         System.out.println("La edad de la persona es;" + edad);
         
          
        
        
        
       }
    
   }

}