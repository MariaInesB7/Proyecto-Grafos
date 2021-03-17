/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.uagrm.ficct.inf310sb.mib.grafos.nopesados;

import java.util.ArrayList;

/**
 *
 * @author HP 240 G5
 */
public class UtilsGrafos {
    private Grafo grafo;
    private UtilsRecorridos utilsRecorridos;
    
    public UtilsGrafos  (Grafo unGrafo){
        this.grafo=unGrafo;
        utilsRecorridos= new UtilsRecorridos(grafo.cantidadDeVertices()); 
    

    }
    
     public Iterable recorridoBFS(Grafo unGrafo, int posVertice){
            BFS recorrido= new BFS(unGrafo, posVertice);   
        Iterable<Integer> recorridoBFS= recorrido.elRecorrido();
        return recorridoBFS;
        }
        public Iterable recorridoDFS(Grafo unGrafo, int posVertice){
            DFS recorrido= new DFS(unGrafo, posVertice);
            
        Iterable<Integer> recorridoDFS= recorrido.elRecorrido();
        return recorridoDFS;
        }
     public void desmarcarTodos(){
         
     utilsRecorridos.desmarcarTodos();
     }
     public void marcarVertice(int posVertice){
     utilsRecorridos.marcarVertice(posVertice);
     }
     public boolean estaMarcado(int posVertice){
      return utilsRecorridos.estaMarcado(posVertice);
     }
    public boolean  estanTodosMarcados(){
    return utilsRecorridos.estanTodosMarcados();
    }
}
