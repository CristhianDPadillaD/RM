/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientermi;

/**
 *
 * @author sistemas
 */

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Interface.RMIDAO;
import java.awt.BorderLayout;

public class ClienteRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Registry registro=LocateRegistry.getRegistry("127.0.0.1",7777);
            RMIDAO interfaz = (RMIDAO) registro.lookup("RemotoRMI");
            String suma;
            suma = interfaz.sumar(10, 14);
            System.out.println(suma);
            
            
            String resta;
            resta = interfaz.restar(10, 14);
            System.out.println(resta);
            
                String multiplicacion;
            multiplicacion = interfaz.multiplicar(10, 14);
            System.out.println(multiplicacion);
            
              String division;
            division = interfaz.dividir(5, 2);
            System.out.println(division);
            
            
        }catch(Exception e){
            System.out.println(""+e);
        }
        
        
                  
        
        
        
       
    }
    
}
