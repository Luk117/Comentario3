/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel1;

import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author lukas
 */
public class OperacionesDatos {
    
    //Variables de clase 
    
    //Metodos
      //OBLIGATORIOS
    public static void main(String[] x){
        
        //responsabilidad
        //JOptionPane.showMessageDialog(null, "Entre al main");
        new OperacionesDatos();
        //JOptionPane.showMessageDialog(null, "volvi y salgo del main");
        
        
    }
    public OperacionesDatos(){
        
        
        //responsabilidad - invocar met locales
       // JOptionPane.showMessageDialog(null,"Estoy en el objeto");
        this.todero();
        
    }
    
      //DE SERVICIO
    private void todero(){
        //Definir estruc de datos
        float datos [], prom, desvi,acum=0, sum=0;
        int n,x;
        
        n=Integer.parseInt(JOptionPane.showInputDialog("Cuantos datos"));
        datos=new float[n];
        
        //Capturar datos
        for (int i=0;i<n;i++){
            datos[i]= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el dato: "+ (i+1)));   
        }
        
        //Mostrar
        for (int i=0;i<n;i++){ 
            System.out.print(datos[i] + " ");
        }
        
        System.out.println();
        //Mostrar datos ordenados
        Arrays.sort(datos);
        for (int i=0;i<n;i++){
            System.out.print(datos[i] + " ");
        }
        
        System.out.println();
        
        //Mostrar mayor dato
        JOptionPane.showMessageDialog(null, "El mayor dato es: " + datos[n-1] );
        
        //Mostrar el menor dato
        JOptionPane.showMessageDialog(null, "El menor dato es: " + datos[0] );
        
        //Mostrar x mejores datos
        x=Integer.parseInt(JOptionPane.showInputDialog("Cuantos mejores datos quieres ver"));
       
        while (x!=n){
            if (x>n)
            x=Integer.parseInt(JOptionPane.showInputDialog("Error, dato mayor que el numero de notas, Cuantos peores datos quieres ver: "));
            else 
                break;
        }
        
        for (int i=0;i<x;i++){
        System.out.print(datos[(n-1)-i]+ " ");
         }
           
        
        System.out.println();
        
        //Mostrar  los 3 peores
        x=Integer.parseInt(JOptionPane.showInputDialog("Cuantos peores datos quieres ver"));
       
        while (x!=n){
            if (x>n)
            x=Integer.parseInt(JOptionPane.showInputDialog("Error, dato mayor que el numero de notas, Cuantos peores datos quieres ver: "));
            else 
                break;
        }
        
        for (int i=0;i<x;i++){
            System.out.print(datos[i]+ " ");
        }
        
        
        System.out.println();
        
        // Promedio
        for (int i=0;i<n;i++)
        {
           acum+=datos[i];
        }
        prom= acum/n;
        JOptionPane.showMessageDialog(null," El promedio de los datos es: " + prom);
        
        //Mostrar desviacion S
        for(int i=0;i<n;i++) 
	{
		sum+=Math.pow((datos[i]-prom),2);
	
	}
	prom=sum/(n-1);
	double deviation=Math.sqrt(prom);
	JOptionPane.showMessageDialog(null,"standard deviation :"+deviation);
      
        
        
    }

}


    
//for (int i=0;i<x;i++)
 //               {
 //                   System.out.print(datos[i]+ " ");
                
//                }
                