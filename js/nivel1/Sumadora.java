/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel1;

import javax.swing.JOptionPane;

/**
 *
 * @author lukas
 */
public class Sumadora {
    
    //Variables de clase 
    
    //Metodos
      //OBLIGATORIOS
    public static void main(String[] x){
        
        //responsabilidad
        JOptionPane.showMessageDialog(null, "Entre al main");
        new Sumadora();
        JOptionPane.showMessageDialog(null, "volvi y salgo del main");
        
        
    }
    public Sumadora(){
        
        
        //responsabilidad - invocar met locales
        JOptionPane.showMessageDialog(null,"Estoy en el objeto");
        this.todero();
        
    }
    
      //DE SERVICIO
    private void todero(){
        //Definir estruc de datos
       
        }
        
        
        
        
    }
  
