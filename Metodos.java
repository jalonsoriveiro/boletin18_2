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
       int x =Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño Array"));
        int boletin18[] = new int[x];        
        for(int i=0;i<boletin18.length;i++){
            int y = (int) (Math.random()*((10-0)+1));
            boletin18[i]=y;
        }
    return boletin18;
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
        System.out.println("Aprovados "+acumuladorAprobados +"\n Suspendos "+acumuladorSuspensos);    
        System.out.println("Nota Media"+notaMedia);
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
   
    
    
}
