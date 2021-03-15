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
      BFS recorridoBFS1 = new BFS(grafo1,0);
      DFS recorridoDFS1= new DFS(grafo1,0);
      
      System.out.println("# VERTICES: "+ grafo1.cantidadDeVertices());
        System.out.println("BFS "+ recorridoBFS1.elRecorrido());
         System.out.println("DFS "+ recorridoDFS1.elRecorrido());
    }
		
    
}
