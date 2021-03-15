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
public class BFS {
   // private List<Boolean> marcados;
    private List<Integer> recorrido;
    private Grafo grafo;
    private UtilsRecorridos controlMarcados;
    public BFS (Grafo unGrafo, int posVerticePartida){
        this.grafo= unGrafo;
        recorrido= new ArrayList<>();
        controlMarcados= new UtilsRecorridos(grafo.cantidadDeVertices()); 
        controlMarcados.desmarcarTodos();
        ejecutarBFS(posVerticePartida);
    }
    
    /*
    private void desmarcarTodos(){
     marcados = new ArrayList<>();
     recorrido = new ArrayList<>();
     for (int i=0; i<grafo.cantidadDeVertices();i++){
     marcados.add(Boolean.FALSE);
     }
    }
    private void marcarVertice(int posVertice){
        marcados.set(posVertice, Boolean.TRUE);
    }
    */
    public void ejecutarBFS(int posVertice){
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
    
    /*
    private boolean estaMarcado(int posVertice){     
        return marcados.get(posVertice);
    }
    */
    public boolean hayCaminoA(int posVertice){
        grafo.validarVertice(posVertice);
        return controlMarcados.estaMarcado(posVertice);
    }
    
    public Iterable <Integer> elRecorrido(){
    return recorrido;
    }
}
