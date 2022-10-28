/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roboquestion.teoriadacomputacao;

/**
 *
 * @author User
 */
public class AutomatoFinito {
    public int inicial;
    public int finals[];

    public AutomatoFinito(int inicial, int[] finals) {
        this.inicial = inicial;
        this.finals = finals;
    }

    public AutomatoFinito() {
        this.inicial=9;
    }
    
    public void imprimir(){
       int i=0;
        System.out.println("inicial "+ this.inicial);
         if(this.finals[0]==0){
            System.out.println("estado final:"+0);
        }else{
             while(finals[i]!=0){
        System.out.println("finais"+ this.finals[i]);
        i++;
             }
    }
    }
    
}
