/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package roboquestion.teoriadacomputacao;

import java.io.*;





public class TeoriaDaComputacao  {
   
  public static void main(String[] args) throws IOException {
  File file = new File ("C:/Users/User/Desktop/Trabalho Della Mura/arquivosTexto/teste.txt");
  InputStream is = new FileInputStream(file);
  InputStreamReader isr = new InputStreamReader(is);
  BufferedReader br = new BufferedReader (isr);
  
  int cont=1;
  String line =br.readLine();
  String partes[];
  String tipo=null;
  int inicial=9;
  int finals[]= new int[25];
  int contFinal=0;
  while(line !=null){
      partes = line.split(",");
      for(int i = 0 ;i < partes.length ;i++){
          
          if(cont == 1){
          tipo =partes[i];    
          }
          if(cont == 2){
              inicial = Integer.parseInt(partes[i]);
          }
          if(cont==3){
              finals[contFinal]=Integer.parseInt(partes[i]);
              contFinal++;
          }     
      }
        line=br.readLine();
        cont++;
    }
        
  if(tipo.equals("f"))   {
      
      AutomatoFinito teste = new AutomatoFinito(inicial,finals);
      
      teste.imprimir();
      
      
      
  } 
      
      
      
      
      
      
      
      
      
      
      
      
  }   
           
    }

