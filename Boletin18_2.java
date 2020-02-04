/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_2;

import javax.swing.JOptionPane;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin18_2 {      
    public static void main(String[] args) {
        boolean repetir=true;    
        
            Metodos obj = new Metodos();
            String boletin18_nomes[]=obj.creatArrayNombres();
               int boletin18[]=obj.creatArray();    
       do  {       
        int option   = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu: \n"
             + "1)Crear Array y mostrar Aprobados y suspensos \n"
             + "2)Visualiza a nota dun alumno determinado \n"
             + "3)Visualiza unha lista co nome dos alumnos aprobados.\n"
             + "4)Fai unha lista ordenada por orden crecente de notas \n" 
             + "5)Visualiza a nota dun alumno determinado que pides por teclado\n"
                + "6)Salir \n"));        
     
        switch(option)
        {
        case 1:
            // Visualiza o numero de aprobados e o de suspensos
            // Calcula e visualiza a nota media da clase
            //Visualiza a nota mais alta .
                obj.showArray(obj.creatArray(),'S');
            break;
        case 2:
            //Visualiza a nota dun alumno determinado
                
         String nameAlumno =JOptionPane.showInputDialog(null, "");
             obj.showNota(boletin18_nomes,boletin18,nameAlumno);
              break;
        case 3:
            //Visualiza unha lista co nome dos alumnos aprobados.
              obj.showAprob(boletin18_nomes,boletin18);
              break;
        case 4:
            //Fai unha lista ordenada por orden crecente de notas
            obj.orderAsc(boletin18_nomes, boletin18);   
              break;
        case 5:
            //Visualiza a nota dun alumno determinado que pides por teclado
            String nameAlum =JOptionPane.showInputDialog(null, "Nombre Alumno");
             obj.showNota(boletin18_nomes,boletin18,nameAlum);
            break;
            
        case 6:               
                repetir=false;                                
        }
        }while(repetir==true);
               
       }

    
}
