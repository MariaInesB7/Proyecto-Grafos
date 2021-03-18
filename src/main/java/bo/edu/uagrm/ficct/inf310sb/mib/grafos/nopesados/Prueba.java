/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.uagrm.ficct.inf310sb.mib.grafos.nopesados;
 

import bo.edu.uagrm.ficct.inf310sb.mib.grafos.excepciones.ExcepcionNroVerticesInvalido;
import bo.edu.uagrm.ficct.inf310sb.mib.grafos.excepciones.ExcepcionNroVerticesInvalido_1;
import bo.edu.uagrm.ficct.inf310sb.mib.grafos.nopesados.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author HP 240 G5
 */
public class Prueba {
    public static void main(String[] argumentos) 
            throws ExcepcionNroVerticesInvalido_1, ExcepcionNroVerticesInvalido {
        
       
        
     
      
        MetodosPracticoGrafo metodoGrafo= new MetodosPracticoGrafo();
        Grafo  grafo1= new Grafo(6);
       Grafo  grafo2= new Grafo(6);
       grafo1.insertarArista(0,1);
        grafo1.insertarArista(0,2);
        grafo1.insertarArista(1,3);
        grafo1.insertarArista(3,4);
        grafo1.insertarArista(2,5);
        
        grafo1.insertarArista(5,5);
        grafo1.insertarArista(1,1);
        grafo1.eliminarArista(2, 5);
      //  grafo1.eliminarArista(1, 3);
      
   /*
         System.out.println("# VERTICES: "+ grafo1.cantidadDeVertices());
        System.out.println(" BFS grafo: "+ grafo1.recorridoBFS(grafo1, 0) );
        System.out.println(" DFS grafo: "+ grafo1.recorridoDFS(grafo1,0) );
       
      System.out.println("CantDeIslas grafo:" + metodoGrafo.cantDeIslas(grafo1));
   
       System.out.println("Tiene ciclo: "+ metodoGrafo.hayCiclo(grafo1,5) );
       System.out.println("Vertices que tienen ciclo: "+ metodoGrafo.verticesConCiclo(grafo1) );
      */
      
      Digrafo digrafo1= new Digrafo(7);   
     
      digrafo1.insertarArista(0, 2);
      digrafo1.insertarArista(0,3 );
      digrafo1.insertarArista(1,6 );
      digrafo1.insertarArista(5,1);
     // digrafo1.insertarArista(2,5);
      digrafo1.insertarArista(4,3 );
       digrafo1.eliminarArista(1,6);
      digrafo1.insertarArista(1,1 );
      
        Digrafo digrafo2= new Digrafo(4);
       digrafo2.insertarArista(0, 1);
       digrafo2.insertarArista(0, 2);
       digrafo2.insertarArista(2, 3);
       digrafo2.insertarArista(3, 1);
       
       MetodosPracticoDigrafo digrafo= new MetodosPracticoDigrafo();
       /*System.out.println("CantDeIslas Digrafo: "+ digrafo.cantIslasDi(digrafo1));
       System.out.println("BFS digarfo"+ digrafo1.recorridoBFS(digrafo1, 0));
       System.out.println("DFS digrafo"+ digrafo1.recorridoDFS(digrafo1, 0));*/
       
     /*  int n= digrafo2.cantidadDeVertices();
       
       int matrizAdyacencias[][]= digrafo.matrizDeAdyacencia(digrafo2);
       System.out.println("Matriz de adyacencias"); 
        digrafo.imprimirMatriz(matrizAdyacencias,n);*/
       
      //Practico Grafos
      System.out.println("Practico Grafos");
      
    //Estudiante: Maria Ines Barrios Barrientos         Registro: 218006403
    /*1. Para un grafo dirigido implementar un método o clase que sea capas de retornar los 
    componentes de las islas que existen en dicho digrafo */
   // System.out.println("1. Componentes de las islas: " + digrafo.componentesDeIslasDigrafo(digrafo1));
    /*. 2.Para un grafo dirigido implementar un algoritmo para encontrar si el grafo dirigido tiene 
        ciclos*/
    System.out.println("2. Tiene ciclo: "+ digrafo.hayCiclo(digrafo1) );
    /*3. Para un grafo dirigido implementar un algoritmo para encontrar si es débilmente conexo
    */
    
      
     System.out.println("3. Es debilmente conexo: "+ digrafo.esDebilmenteConexo(digrafo2) );
     
    /*4.. Para un grafo no dirigido implementar un algoritmo para encontrar que en que vértices del 
    grafo hay ciclos*/
    System.out.println("4. Vertices que tienen ciclo: "+ metodoGrafo.verticesConCiclo(grafo1) );
     
     /*5. Para un grafo no dirigido implementar un algoritmo para encontrar el número de islas que 
            hay en el grafo
     */
       System.out.println("5. CantDeIslas grafo:" + metodoGrafo.cantDeIslas(grafo1));
     /*6. Para un grafo dirigido implementar un algoritmo para encontrar el número de islas que hay 
        en el grafo*/ 
       System.out.println("6.CantDeIslas digrafo: "+ digrafo.cantIslasDi(digrafo1));
      /* 7. Para un grafo dirigido implementar el algoritmo de Wharshall, que luego muestre entre que 
        vértices hay camino */
        //int n= digrafo2.cantidadDeVertices();
       
      // int matriz[][]= digrafo.matrizDeAdyacencia(digrafo2);
       System.out.println("7. Warshall"); 
       digrafo.algoritmoWarshall(digrafo2);
      /* Para un grafo dirigido usando la implementación del algoritmo de Floyd-Wharsall encontrar 
        los caminos de costo mínimo entre un vértice a y el resto. Mostrar los costos y cuáles son 
        los caminos*/
      System.out.println("8.Floyd Warshall"); 
      digrafo.algoritmoFloydWarshall(digrafo2);
    }
    

    
}
