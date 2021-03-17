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
      digrafo1.insertarArista(0,1 );
      digrafo1.insertarArista(0, 2);
      digrafo1.insertarArista(0,3 );
      digrafo1.insertarArista(1,6 );
      digrafo1.insertarArista(5,1);
     // digrafo1.insertarArista(2,5);
      digrafo1.insertarArista(4,3 );
       digrafo1.eliminarArista(1,6);
      digrafo1.insertarArista(1,1 );
  
       MetodosPracticoDigrafo digrafo= new MetodosPracticoDigrafo();
       /*System.out.println("CantDeIslas Digrafo: "+ digrafo.cantIslasDi(digrafo1));
       System.out.println("BFS digarfo"+ digrafo1.recorridoBFS(digrafo1, 0));
       System.out.println("DFS digrafo"+ digrafo1.recorridoDFS(digrafo1, 0));*/
       
      //Practico Grafos
      System.out.println("Practico Grafos");
      
    //Estudiante: Maria Ines Barrios Barrientos         Registro: 218006403
    /*. 2.Para un grafo dirigido implementar un algoritmo para encontrar si el grafo dirigido tiene 
        ciclos*/
    System.out.println("2. Tiene ciclo: "+ digrafo.hayCiclo(digrafo1) );
    /*4.. Para un grafo no dirigido implementar un algoritmo para encontrar que en que vértices del 
    grafo hay ciclos*/
    System.out.println("4. Vertices que tienen ciclo: "+ metodoGrafo.verticesConCiclo(grafo1) );
     
     /*5. Para un grafo no dirigido implementar un algoritmo para encontrar el número de islas que 
            hay en el grafo
     */
       System.out.println("5. CantDeIslas grafo:" + metodoGrafo.cantDeIslas(grafo1));
      
       
    }
    

    
}
