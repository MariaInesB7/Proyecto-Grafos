/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.uagrm.ficct.inf310sb.mib.grafos.nopesados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author HP 240 G5
 */
public class MetodosPracticoDigrafo extends Digrafo {
    private DFS dfs;
    private UtilsRecorridos controlMarcados;
    //
    public MetodosPracticoDigrafo(){
         UtilsRecorridos controlMarcados;
    }
     
       private int definirVerticeNoMarcado(Digrafo unGrafo,int verticeDeProceso){
         //dfs= new DFS(unGrafo, verticeDeProceso);
         //UtilsRecorridos controlMarcados= new UtilsRecorridos(unGrafo.cantidadDeVertices());
       while( verticeDeProceso<unGrafo.cantidadDeVertices()) {
        if (dfs.controlMarcados.estaMarcado(verticeDeProceso)==true){
            verticeDeProceso++;
        }else{
        break;
        }
        }
       return verticeDeProceso;
       } 
       
        public int cantIslasDi(Digrafo grafo){
       int cantIslas=0;
       int verticeDeProceso=0;
       dfs= new DFS(grafo, verticeDeProceso);
     //  for(int i= verticeDeProceso; i<grafo.cantidadDeVertices();i++)
       while(verticeDeProceso<grafo.cantidadDeVertices()){
       dfs.continuarDFS(verticeDeProceso);
       if(dfs.controlMarcados.estanTodosMarcados()){
        cantIslas++;
        return cantIslas;
       //verticeDeProceso++;
       
       }
         verticeDeProceso=verticeNoMarcadoConAdyacenteMarcado
                                            (grafo, verticeDeProceso);
        if(verticeDeProceso<0){
        cantIslas++;
        verticeDeProceso= definirVerticeNoMarcado(grafo, 0);
        
        }
       }
       return cantIslas;
       }

    private int verticeNoMarcadoConAdyacenteMarcado(Digrafo unGrafo,int VerticeDeProceso) {
      while( VerticeDeProceso<unGrafo.cantidadDeVertices()) {
        if (!dfs.controlMarcados.estaMarcado(VerticeDeProceso)){
            Iterable<Integer> adyacentesEnTurno= unGrafo.adyacentesDeVertice(VerticeDeProceso);
            
        for(Integer posVerticeAdyacente: adyacentesEnTurno){
           if(dfs.controlMarcados.estaMarcado(posVerticeAdyacente)){
               return VerticeDeProceso;
           }
        }
        
        }
        VerticeDeProceso++;
        }
       return -1;// no econtro verticeNoMarcado
    }
    
      public List<List<Integer>> componentesDeIslasDigrafo(Digrafo grafo){
        int cantIslas=this.cantIslasDi(grafo);
       int verticeDeProceso=0;
       int numIsla=0;
       List<Integer> componentesYaMarcados= new ArrayList<>();
        List<List<Integer>> listaIslas= new ArrayList<>(); 
        for (int i=0; i<cantIslas; i++ ){
        listaIslas.add(new ArrayList<>());
        }
       dfs= new DFS(grafo, verticeDeProceso);
     //  for(int i= verticeDeProceso; i<grafo.cantidadDeVertices();i++)
       while(verticeDeProceso<grafo.cantidadDeVertices()){
       dfs.continuarDFS(verticeDeProceso);
        
         verticesDeLasIslas(numIsla, listaIslas,grafo.cantidadDeVertices(),componentesYaMarcados);
       if(dfs.controlMarcados.estanTodosMarcados()){
       // numIsla++;
        //verticesDeLasIslas(numIsla,listaIslas,grafo.cantidadDeVertices());
       //verticeDeProceso++;
       //verticesDeLasIslas(numIsla, listaIslas.get(numIsla),grafo.cantidadDeVertices());
       return listaIslas;
       }
      
        verticeDeProceso=verticeNoMarcadoConAdyacenteMarcado
                                            (grafo, verticeDeProceso); 
          if(verticeDeProceso<0){
        numIsla++;
        verticeDeProceso= definirVerticeNoMarcado(grafo, 0);
        
        }else{
          List<Integer>listaABorrar= listaIslas.get(numIsla);
          listaABorrar.clear();
           componentesYaMarcados.clear();   
          }
       }
       return listaIslas;
    }
      public void verticesDeLasIslas(int numIslas,List<List<Integer>>islas,
                                          int cantVertices,List<Integer> componentesYaMarcados ){
      List<Integer> componenteIsla=  islas.get(numIslas);
    
        for(int i=0;i< cantVertices; i++ ){
            if (dfs.controlMarcados.estaMarcado(i)&& componentesYaMarcados.indexOf(i)<0){
        componenteIsla.add(i);
        componentesYaMarcados.add(i);
            }
        }
      }
      
     public boolean hayCiclo(Digrafo digrafo){
        for (int posVertice =0; posVertice< digrafo.cantidadDeVertices(); posVertice++){
       List<Integer> adyacenciasDeVertice= digrafo.listasDeAdyacencias.get(posVertice);
       for (int i=0; i< adyacenciasDeVertice.size();i++){
       if(posVertice == adyacenciasDeVertice.get(i) ){
       return true;
        }
       }
       }  
       return false;
       } 
     public boolean esDebilmenteConexo(Digrafo digrafo){
         Conexo DebilmenteConexo= new Conexo(digrafo);
         return DebilmenteConexo.esConexo();
     }
     public int[][] matrizDeAdyacencia(Digrafo digrafo){
         int cantVertices= digrafo.cantidadDeVertices();
     int matriz[][]= new int[cantVertices][cantVertices];
        for(int i=0; i<cantVertices;i++){
            List<Integer>adyacencias= digrafo.listasDeAdyacencias.get(i);
            
            for(int j=0; j<adyacencias.size();j++){
                int posAdyacencia= adyacencias.get(j);
                for(int k=0; k<=posAdyacencia;k++ )
                matriz[i][posAdyacencia]= 1;
            }
     }
     return matriz;
     }
     
     public void imprimirMatriz(int matriz[][], int tamaño){
        for(int i=0; i<tamaño;i++){ 
            for(int j=0; j<tamaño;j++){
            System.out.print(" "+matriz[i][j]);;
            }
            System.out.println(" ");
     }
     
     }
     public void algoritmoWarshall(Digrafo digrafo){
     int matrizDigrafo[][]= this.matrizDeAdyacencia(digrafo);
     int columnas= digrafo.cantidadDeVertices();
     for(int i=0; i<columnas; i++){
         for(int j=0; j<columnas;j++){
             for(int k=0; k<columnas; k++){
             if(matrizDigrafo[j][k]!=1){
             matrizDigrafo[j][k]= matrizDigrafo[j][i]&matrizDigrafo[i][k];
             }
             }
         }
     }
     this.imprimirMatriz(matrizDigrafo, columnas);
             
     }
     public void algoritmoFloydWarshall(Digrafo digrafo){
     int matrizDigrafo[][]= this.matrizDeAdyacencia(digrafo);
     int columnas= digrafo.cantidadDeVertices();
     for(int i=0; i<columnas; i++){
         for(int j=0; j<columnas;j++){
             for(int k=0; k<columnas; k++){
             if(matrizDigrafo[j][k]!=1){
                 if(matrizDigrafo[j][i]+ matrizDigrafo[i][k] <matrizDigrafo[j][k]){
                     matrizDigrafo[j][k]= matrizDigrafo[j][i]+ matrizDigrafo[i][k];
                     matrizDigrafo[j][k]= k;
                 }
             }
             }
         }
     }
     this.imprimirMatriz(matrizDigrafo, columnas);
     }
     
     
     /*
       public List<Integer> caminosAVertice(int posVertice){ 
         UtilsRecorridos controlMarcados= new UtilsRecorridos(this.cantidadDeVertices());
         Queue<Integer> cola = new LinkedList<>();
        cola.offer(posVertice);
        controlMarcados.marcarVertice(posVertice);
    do{
        int posVerticeEnTurno= cola.poll();
        recorrido.add(posVerticeEnTurno);
        Iterable<Integer> adyacentesEnTurno= grafo.adyacentesDeVertice(posVerticeEnTurno);
        for(Integer posVerticeAdyacente: adyacentesEnTurno){
            int z= posVerticeAdyacente;
            if(!controlMarcados.estaMarcado(posVerticeAdyacente)){
            cola.add(posVerticeAdyacente);
            controlMarcados.marcarVertice(posVerticeAdyacente);
            }
        }
    }while(!cola.isEmpty());
     }
     */
}
