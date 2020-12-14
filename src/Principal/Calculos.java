/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Josesaul05
 */
public class Calculos {
     int matrizX2[][] = new int [2][3];
    int suma,x,y;
   // int matrizX2[][] = new int [2][2];
    public Calculos(int matrizX2[][]) {
        this.matrizX2 = matrizX2;
        
    }
    
    
    
    
    public int CalculoDeterX2(int matrizX2[][]){
      suma = matrizX2[0][0]*matrizX2[1][1] - (matrizX2[1][0]*matrizX2[0][1]);
    
        return suma;
    }
    public int CalculoDeterX3(){
    
        
        
        
    return 0;
    }

    public int CalculoVarX(int deter,int matrizX2[][]){
    int detX = matrizX2[0][2]*matrizX2[1][1] - (matrizX2[1][2]*matrizX2[0][1]);
    
    x = (int)detX/deter;
    
    
  return x;
    }
      public int CalculoVarY(int deter,int matrizX2[][]){
    
    int detY = matrizX2[0][0]*matrizX2[1][2] - (matrizX2[1][0]*matrizX2[0][2]);
 
    y = (int)detY/deter;
    
  return y;
    }
    
}
