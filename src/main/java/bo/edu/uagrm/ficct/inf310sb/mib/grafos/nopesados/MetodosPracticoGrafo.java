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
public class MetodosPracticoGrafo extends Grafo {
    protected DFS dfs;
    
     public int cantDeIslas(Grafo grafo){
           // boolean estaTodoMarcado= false;
          //UtilsRecorridos controlMarcados= new UtilsRecorridos(unGrafo.cantidadDeVertices());
        
        int cantIslas=0;
         int verticeDeProceso=0; 
        dfs= new DFS(grafo, verticeDeProceso);
       while(!dfs.controlMarcados.estanTodosMarcados()){
           dfs.continuarDFS(verticeDeProceso);
        cantIslas++;
        if(dfs.controlMarcados.estanTodosMarcados()){
        return cantIslas;
        }
        verticeDeProceso= definirVerticeNoMarcado(grafo,verticeDeProceso);
        }
        return cantIslas;
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
       
       public List<Integer> verticesConCiclo(Grafo grafo){
           List<Integer> listaDeVertices= new ArrayList<>();
       for (int posVertice =0; posVertice< grafo.cantidadDeVertices(); posVertice++){
        List<Integer> adyacenciasDeVertice= grafo.listasDeAdyacencias.get(posVertice);
        for (int k=0; k < adyacenciasDeVertice.size();k++){
       if(posVertice == adyacenciasDeVertice.get(k) ){
           listaDeVertices.add(posVertice);
      }
       
       }
           }
       return listaDeVertices;
       }
       
       
       
       public List<List<Integer>> componentesDeIslasGrafo(Grafo grafo){
        int cantIslas=this.cantDeIslas(grafo);
       int verticeDeProceso=0;
       int numIsla=0;
       List<Integer> componentesYaMarcados= new ArrayList<>();
        List<List<Integer>> listaIslas= new ArrayList<>(); 
        for (int i=0; i<cantIslas; i++ ){
        listaIslas.add(new ArrayList<>());
        }
       dfs= new DFS(grafo, verticeDeProceso);

       while(verticeDeProceso<grafo.cantidadDeVertices()){
       dfs.continuarDFS(verticeDeProceso);
         verticesDeLasIslas(numIsla, listaIslas,grafo.cantidadDeVertices(),
                        componentesYaMarcados,verticeDeProceso);
       if(dfs.controlMarcados.estanTodosMarcados()){
       
       return listaIslas;
       }
      
        verticeDeProceso=verticeNoMarcadoConAdyacenteMarcado
                                            (grafo, verticeDeProceso); 
          if(verticeDeProceso<0){
        numIsla++;
        verticeDeProceso= definirVerticeNoMarcado(grafo, 0);
        }
       }
       return listaIslas;
    }
        
      public void verticesDeLasIslas(int numIslas,List<List<Integer>>islas,
                                          int cantVertices,List<Integer> componentesYaMarcados,
                                          int verticeDeProceso ){
      List<Integer> componenteIsla=  islas.get(numIslas);
    
        for(int i=verticeDeProceso;i< cantVertices; i++ ){
            if (dfs.controlMarcados.estaMarcado(i)&& componentesYaMarcados.indexOf(i)<0){
        componenteIsla.add(i);
        componentesYaMarcados.add(i);
            }
        }
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
       return -1;// no encontro verticeNoMarcado
    }
       
       
}
