/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.uagrm.ficct.inf310sb.mib.grafos.nopesados;
import bo.edu.uagrm.ficct.inf310sb.mib.grafos.nopesados.DFS;
import bo.edu.uagrm.ficct.inf310sb.mib.grafos.nopesados.Grafo;
import bo.edu.uagrm.ficct.inf310sb.mib.grafos.nopesados.UtilsRecorridos;
import java.util.ArrayList;

/**
 *
 * @author HP 240 G5
 */
public class Practicos {
    private Grafo grafo;
    private UtilsRecorridos controlMarcados;
    private DFS recorridoDFS;
    public Practicos (Grafo unGrafo){
    this.grafo= unGrafo;

        controlMarcados= new UtilsRecorridos(grafo.cantidadDeVertices()); 
    }
     public int cantDeIslas(Grafo grafo){
           // boolean estaTodoMarcado= false;
          //UtilsRecorridos controlMarcados= new UtilsRecorridos(unGrafo.cantidadDeVertices());
         
        int cantIslas=0;
         int verticeDeProceso=0; 
       
       while(!controlMarcados.estanTodosMarcados()){
           //this.continuarDFS(verticeDeProceso);
           recorridoDFS= new DFS(grafo, verticeDeProceso);
        cantIslas++;
        if(controlMarcados.estanTodosMarcados()){
        return cantIslas;
        }
        verticeDeProceso= definirVerticeNoMarcado(grafo,verticeDeProceso);
        }
        return cantIslas;
        }
       private int definirVerticeNoMarcado(Grafo unGrafo,int VerticeDeProceso){
         
         //UtilsRecorridos controlMarcados= new UtilsRecorridos(unGrafo.cantidadDeVertices());
       while( VerticeDeProceso<unGrafo.cantidadDeVertices()) {
        if (controlMarcados.estaMarcado(VerticeDeProceso)==true){
            VerticeDeProceso++;
        }else{
        break;
        }
        }
       return VerticeDeProceso;
       } 

}
