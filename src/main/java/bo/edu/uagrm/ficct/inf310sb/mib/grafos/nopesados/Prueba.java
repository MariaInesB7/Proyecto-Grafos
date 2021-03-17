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
    public static void main(String[] argumentos) throws ExcepcionNroVerticesInvalido_1, ExcepcionNroVerticesInvalido {
        Grafo  grafo1= new Grafo(6);
       
       grafo1.insertarArista(0,1);
        grafo1.insertarArista(0,2);
        grafo1.insertarArista(1,3);
        grafo1.insertarArista(3,4);
        grafo1.insertarArista(2,5);
        
        grafo1.eliminarArista(2, 5);
      //  grafo1.eliminarArista(1, 3);
       // Practicos cant= new Practicos();
        Practicos prueba= new Practicos(grafo1);
        DFS nada= new DFS(grafo1,0);
      UtilsRecorridos controlMarcados= new UtilsRecorridos(grafo1.cantidadDeVertices()); 
      System.out.println("# VERTICES: "+ grafo1.cantidadDeVertices());
      System.out.println("CantDeIslas: "+ nada.cantDeIslas(grafo1));
     //System.out.println("CantDeIslas: "+ prueba.cantDeIslas(grafo1));
    
    // System.out.println("Marcados: "+ controlMarcados.estanTodosMarcados());
    // System.out.println("CantDeIslas: "+ grafo1.cantDeIslas());
        System.out.println("BFS "+ grafo1.recorridoBFS(grafo1, 0));
        System.out.println("DFS "+ grafo1.recorridoDFS(grafo1, 0));
   
        //System.out.println("Marcados "+ controlMarcados);
         
      Digrafo digrafo1= new Digrafo(7);   
      digrafo1.insertarArista(0,1 );
      digrafo1.insertarArista(0, 2);
      digrafo1.insertarArista(0,3 );
      digrafo1.insertarArista(1,6 );
      digrafo1.insertarArista(5,1);
      digrafo1.insertarArista(2,5);
      digrafo1.insertarArista(4,3 );
       digrafo1.eliminarArista(1,6);
       
       System.out.println("BFS "+ digrafo1.recorridoBFS(digrafo1, 0));
       System.out.println("DFS "+ digrafo1.recorridoDFS(digrafo1, 0));
     
    }
		
    
}
