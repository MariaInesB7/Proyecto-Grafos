/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.uagrm.ficct.inf310sb.mib.grafos.pesado;

import bo.edu.uagrm.ficct.inf310sb.mib.grafos.nopesados.Digrafo;
import bo.edu.uagrm.ficct.inf310sb.mib.grafos.nopesados.UtilsRecorridos;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author HP 240 G5
 */
public class MetodosDigrafoPesado extends DigrafoPesado{
    protected UtilsRecorridos controlMarcados;
    
    
    
    public double[][] matrizDeAdyacencia(DigrafoPesado digrafoP){
         int cantVertices= digrafoP.cantidadDeVertices();
     double matriz[][]= new double[cantVertices][cantVertices];
        for(int i=0; i<cantVertices;i++){
            List<AdyacenteConPeso> adyacencias= digrafoP.listaDeAdyacencias.get(i); 
            for(int j=0; j<adyacencias.size();j++){
                AdyacenteConPeso adyacenciaPeso= adyacencias.get(j);    
                matriz[i][adyacenciaPeso.getIndiceVertice()]=adyacenciaPeso.getPeso() ;
                 
     } 
     }
        
        return matriz;
    }
    
     public void imprimirMatriz(double matriz[][], int tamaño){
        for(int i=0; i<tamaño;i++){ 
            System.out.print("|");
            for(int j=0; j<tamaño;j++){
            System.out.print("  "+matriz[i][j]);;
            }
            System.out.println(" |");
     }
     }
     public double pesoArista(int origen, int destino, DigrafoPesado digrafoP){
     List<AdyacenteConPeso> adyacencias= digrafoP.listaDeAdyacencias.get(origen); 
     for(int i=0; i< adyacencias.size();i++){
       AdyacenteConPeso adyacenciasDestino= adyacencias.get(i);  
       if(adyacenciasDestino.getIndiceVertice()==destino){
       return adyacenciasDestino.getPeso();
       }
     }
     return -1;
     }
     public double[][] matrizDeCostos(DigrafoPesado digrafoP, int vertice){
         int cantVertices= digrafoP.cantidadDeVertices();
     double matriz[][]= new double[cantVertices][cantVertices];
        for(int i=0; i<cantVertices;i++){
            List<AdyacenteConPeso> adyacencias= digrafoP.listaDeAdyacencias.get(i); 
            for(int j=0; j<adyacencias.size();j++){
                AdyacenteConPeso adyacenciaPeso= adyacencias.get(j);   
                if(i==vertice){
                 matriz[i][adyacenciaPeso.getIndiceVertice()]=0;
                }
                matriz[i][adyacenciaPeso.getIndiceVertice()]=2147483647;      
                 
     } 
     }
        
        return matriz;
    }
   
     
  
    public List<Integer> algoritmoDijkstra(int posOrigen,int posDestino, DigrafoPesado digrafoP){
        List<Integer> recorrido=new Stack<>();
        List<Double> costos=inicializaCosto(digrafoP.cantidadDeVertices());
        List<Integer> predecesores=inicializaPredecesores(digrafoP.cantidadDeVertices());
        int posMenorCosto=posOrigen;
         actualizarCosto(costos,posOrigen,0);
         controlMarcados= new UtilsRecorridos(digrafoP.cantidadDeVertices());
          controlMarcados.desmarcarTodos();
        while(!controlMarcados.estaMarcado(posMenorCosto)){
          List<AdyacenteConPeso> adyacencia=digrafoP.listaDeAdyacencias.get(posMenorCosto);
          controlMarcados.marcarVertice(posMenorCosto);
            for (int i = 0; i < adyacencia.size(); i++) {
                if(!controlMarcados.estaMarcado(adyacencia.get(i).getIndiceVertice())){
                    double costoA=costos.get(adyacencia.get(i).getIndiceVertice());
                    double costoV=costos.get(posMenorCosto);
                    double costoVA=adyacencia.get(i).getPeso();
                     if(costoA>costoV+costoVA){
                         actualizarCosto(costos,adyacencia.get(i).getIndiceVertice(),costoV+costoVA);
                         
                         actualizarPredecesores(predecesores, adyacencia.get(i).getIndiceVertice(),
                                 posMenorCosto);
                         
                     }     
            }
        }
            
        posMenorCosto=posicionCostoMenor(costos);   
     }
      int k=posDestino;
     
        while(k!=posOrigen){
            recorrido.add(k);
            k=predecesores.get(k);
        }
         recorrido.add(posOrigen);
         
        System.out.println("Costo= "+ this.costoTotal(recorrido, digrafoP));
        return recorrido; 
     }
     private double costoTotal(List<Integer> recorrido,DigrafoPesado digrafoP){
      double costoTotal=0;
     for(int i=0; i<recorrido.size()-1;i++){
       int vertice1= recorrido.get(i);
       int vertice2= recorrido.get(i+1);
       costoTotal= costoTotal+ this.pesoArista(vertice2, vertice1, digrafoP);
     }
     return costoTotal;
     }

    private List<Double> inicializaCosto(int cantVertices) {
        List<Double> costos= new ArrayList<>();
        for(int i=0; i<cantVertices;i++ ){
        costos.add(2147483647.0);
        }
        return costos;
    }

    private List<Integer> inicializaPredecesores(int cantVertices) {
       
     List<Integer> predecesores= new ArrayList<>();
        for(int i=0; i<cantVertices;i++ ){
        predecesores.add(-1);
        }
        return predecesores;
    }

    private void actualizarCosto(List<Double> costos, int posOrigen, double valor) {
         
        costos.set(posOrigen, valor);
        
    }

    private void actualizarPredecesores(List<Integer> predecesores, int indiceVertice, int posMenorCosto) {
      
        predecesores.set(indiceVertice,posMenorCosto);
        
        
    }

    private int posicionCostoMenor(List<Double> costos) {
        double menor=2147483647;
        for(int i=0; i<costos.size(); i++){
         if(costos.get(i)!=0){  
        if(costos.get(i)<menor){
            menor=costos.get(i);
        }
         }
        }
        return costos.indexOf(menor);
    }
    
     
     
}
