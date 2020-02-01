/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_2;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin18_2 {      
    public static void main(String[] args) {
  
        Metodos obj = new Metodos();
        //obj.showArray(obj.creatArray(),'S');
       //  String boletin18_nomes[] = new String[30];
        
        //boletin18_nomes =obj.creatArrayNombres();
        
         String boletin18_nomes[]=obj.creatArrayNombres();
         int boletin18[]=obj.creatArray();
        
      //Visualiza a nota dun alumno determinado
  //  obj.showNota(boletin18_nomes,boletin18,"Jose");
      //Visualiza unha lista co nome dos alumnos aprobados.                  
 //       obj.showAprob(boletin18_nomes,boletin18);
      //Fai unha lista ordenada por orden crecente de notas  
        obj.orderAsc(boletin18_nomes, boletin18);
        
    }    

    
}
