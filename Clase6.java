
package boletin.pkg6.pkg6;

import java.util.Scanner;

public class Clase6 {
    Scanner sc=new Scanner(System.in);
    private int prod;

    public Clase6(){
    }

   public Clase6(int prod){
        this.prod=prod;
    }
    
    public void setprod(){
        this.prod=prod;
    }
        public int getprod(){
        return prod; 
    }
    public void Paso(int prod){
        if (prod<=100)
            System.out.println("consumo baixo");
        else if(prod>100&&prod<=500)
            System.out.println("consumo medio");
        else if(prod>500&&prod<=1000)
            System.out.println("consumo alto");
        else if(prod>1000)
            System.out.println("primera necesidad");
    } 
    public int pedirInt(){

       System.out.println("Las ventas son: ");
       int ed=sc.nextInt();
       return ed;
    }

    }

