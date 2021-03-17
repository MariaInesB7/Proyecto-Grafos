/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.uagrm.ficct.inf310sb.mib.grafos.nopesados;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP 240 G5
 */
public class MetodosPracticoDigrafo extends Digrafo {
    private DFS dfs;
    public MetodosPracticoDigrafo(){
    }
     
       private int definirVerticeNoMarcado(Grafo unGrafo,int verticeDeProceso){
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
       
        public int cantIslasDi(Grafo grafo){
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

    private int verticeNoMarcadoConAdyacenteMarcado(Grafo unGrafo,int VerticeDeProceso) {
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
    
      public String componentesDeIslasDigrafo(Grafo unGrafo){
        String componentes="";
        List<Integer> listasAdyacencias= new ArrayList<>();
        int posVertice= 0;
        listasAdyacencias.add(posVertice);
        dfs.controlMarcados.marcarVertice(posVertice);
        for (int i=0; i<this.cantIslasDi(unGrafo); i++){
        componentes= "Isla "+ i + ": ";
        
         Iterable<Integer> adyacentesEnTurno= unGrafo.adyacentesDeVertice(posVertice);
        for(Integer posVerticeAdyacente: adyacentesEnTurno){
            if(!dfs.controlMarcados.estaMarcado(posVerticeAdyacente)){
                dfs.continuarDFS(posVerticeAdyacente);
            }
        }
        
        
        }
        return componentes;
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
}
