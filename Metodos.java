/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_2;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class Metodos {
 
    
    public int[] creatArray(){  
       int x =Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño Array notas"));
        int boletin18[] = new int[x];               
        for(int i=0;i<boletin18.length;i++){            
         int  y=generaNumeroAleatorio(0,10);
            boletin18[i]=y;
        }
    return boletin18;
    }
    public String[] creatArrayNombres(){  
        int x =Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño Array nombres")); 
        String boletin18_nomes[] = new String[x];        
        for(int i=0;i<boletin18_nomes.length;i++){
              boletin18_nomes[i]=PedirString("Nombre Alumno");
        }
    return boletin18_nomes;
    }
    public void showArray(int[] p_array,char p_comprobar){   
       //variables
       int acumuladorAprobados=0;
       int acumuladorSuspensos=0;
       int acumuladorMediaAlumnos=0;
       int notaMedia=0;       
                
        for(int i=0;i<p_array.length;i++){
            System.out.println(p_array[i]);                    
        if (p_comprobar=='S'){
            acumuladorAprobados= acumuladorAprobados+calAprob(p_array[i]);            
            acumuladorSuspensos=acumuladorSuspensos+calSup(p_array[i]);                      
            acumuladorMediaAlumnos=acumuladorMediaAlumnos+p_array[i];
            notaMedia =(int) (acumuladorMediaAlumnos/p_array.length);            
            } 
    }    
        if (p_comprobar=='S'){
        System.out.println("Aprovados "+acumuladorAprobados +"\n Suspendos "+acumuladorSuspensos);    
        System.out.println("Nota Media"+notaMedia);
        }
        System.out.println("Nota Mas alta ="+calNotaAlta(p_array));
    }
    public void showArraySort(int[] p_array){   
       Arrays.sort(p_array);
        for(int i=0;i<p_array.length;i++){
            System.out.println(p_array[i]);            
        }
    }
    public int calAprob(int nota){          
            if (nota >=5){   
                return 1;
            }else{
                return 0;
        }
    }
    public int calSup(int nota){          
            if (nota <=5){   
                return 1;
            }else{
                return 0;
        }
    }
    public int calNotaAlta(int[] p_array){          
            
        int v_nota=0;
         for(int i=0;i<p_array.length;i++){
         
             if(p_array[i] > v_nota){            
                
                v_nota = p_array[i];             
                }
           }
        return v_nota;
    }
    
     public static String PedirString(String mensaxe){        
           return JOptionPane.showInputDialog(mensaxe);                                               
    }
     
     public void showNota(String[] p_array_nomes,int[] p_arrayNota,String p_alumno){
     
     for(int i=0;i<p_array_nomes.length;i++){
         
         if (p_array_nomes[i] == null ? p_alumno == null : p_array_nomes[i].equals(p_alumno)){
             
             System.out.println(p_arrayNota[i]);
         }     
     }
     }  
        public void showAprob(String[] p_array_nomes,int[] p_arrayNota){
     
     for(int i=0;i<p_array_nomes.length;i++){
         
         if (calAprob(p_arrayNota[i])==1){
             
             System.out.println(p_array_nomes[i]);
         }
     
     }  
     }
    public void orderAsc(String[] p_array_nomes,int[] p_arrayNota){
     int aux=0;
     String auxnome;;
                for(int i=0;i<p_arrayNota.length-1;i++){

                   for(int j=0;j<p_arrayNota.length-1;j++){
                   if(p_arrayNota[i] > p_arrayNota[j]){

                       aux = p_arrayNota[i];
                       p_arrayNota[i] = p_arrayNota[j];
                       p_arrayNota[j] = aux;
                        
                        auxnome = p_array_nomes [i];
                        p_array_nomes[i] = p_array_nomes[j];
                        p_array_nomes[j]=auxnome;
                        
                       
                    }
                }
         }
                showArray(p_arrayNota,'N');                        
    
    }
    public static int generaNumeroAleatorio(int minimo,int maximo){
        
       int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
       return num;
   }
           
}
