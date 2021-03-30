
import bo.edu.uagrm.ficct.inf310sb.mib.grafos.nopesados.UtilsRecorridos;
import bo.edu.uagrm.ficct.inf310sb.mib.grafos.pesado.DigrafoPesado;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP 240 G5
 */
public class Dijkstra extends DigrafoPesado{
    protected UtilsRecorridos controlMarcados;
    public Dijkstra(){
    
    }
    
  
/*
    protected void algoritmoDeDijkstra(List<Double> costos, List<Boolean> marcados,
            List<Integer> predecesores, int indiceDePartida, int indiceDeDestino) {
        int posVertMenorCostoNoMarcado = indiceDePartida;
        do {
            double costoV = costos.get(posVertMenorCostoNoMarcado);
            for (int i = 0; i < this.cantidadDeVertices(); i++) {
                if (!super.estaMarcadoElVertice(marcados, i)) {
                    double costoA = costos.get(i);
                    double pesoV_A = this.pesoEntreVertices(posVertMenorCostoNoMarcado, i);
                    if (this.comparacionAlgDijkstra(costoA, costoV, pesoV_A)) {
                        this.cambiarCostos(costos, i, costoV + pesoV_A);
                        this.cambiarPredecesores(predecesores, i, posVertMenorCostoNoMarcado);
                    }
                }
            }
            //marcando en vertice de menor costo
            super.marcarVertice(marcados, posVertMenorCostoNoMarcado);
            posVertMenorCostoNoMarcado = this.verticeMenorCostoNoMarcado(costos, marcados);
        } while (!super.estaMarcadoElVertice(marcados, indiceDeDestino) && posVertMenorCostoNoMarcado != -1);
    }

    protected boolean comparacionAlgDijkstra(double costoA, double costoV, double pesoV_A) {
        if (costoV == GrafoP.INFINITO || pesoV_A == GrafoP.INFINITO) {
            return false;
        }
        return costoA > (costoV + pesoV_A);
    }

    protected double pesoEntreVertices(int posVerticeA, int posVerticeB) {
        double retorno = GrafoP.INFINITO;
        List<AdyacenteConPeso> listaAdyVerticeA = super.listasDeAdyacencias.get(posVerticeA);
        if (listaAdyVerticeA.contains(new AdyacenteConPeso(posVerticeB))) {
            int indice = listaAdyVerticeA.indexOf(new AdyacenteConPeso(posVerticeB));
            AdyacenteConPeso adyacente = listaAdyVerticeA.get(indice);
            retorno = adyacente.getPeso();
        }
        return retorno;
    }

    protected int verticeMenorCostoNoMarcado(List<Double> costos, List<Boolean> marcados) {
        double menor = -1;
        int posicion = -1;
        for (int i = 0; i < costos.size(); i++) {
            if (!marcados.get(i)) {
                double costoIter = costos.get(i);
                if (posicion == -1) {
                    posicion = i;
                    menor = costos.get(i);
                } else if (costoIter < menor) {
                    posicion = i;
                    menor = costos.get(i);
                }
            }
        }
        return posicion;
    }

    protected List<Double> listaDeCostos(int posicionVerticePartida) {
        List<Double> costos = new LinkedList<>();
        for (int i = 0; i < this.cantidadDeVertices(); i++) {
            if (i == posicionVerticePartida) {
                costos.add((Double) 0.0);
            } else {
                costos.add(INFINITO);
            }
        }
        return costos;
    }

    protected void cambiarCostos(List<Double> costos, int posicion, double valor) {
        costos.set(posicion, (Double) valor);
    }

    protected List<Integer> listaDePredecesores() {
        List<Integer> predecesores = new LinkedList<>();
        for (int i = 0; i < this.cantidadDeVertices(); i++) {
            predecesores.add(-1);
        }
        return predecesores;
    }

    protected void cambiarPredecesores(List<Integer> predecesores, int posicion, int valor) {
        predecesores.set(posicion, valor);
    }

    protected Double[][] matrizInicialDeCostos() {
        int n = super.cantidadDeVertices();
        Double[][] matriz = new Double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = GrafoP.INFINITO;
            }
        }
        for (int i = 0; i < this.listasDeAdyacencias.size(); i++) {
            int f = i;
            matriz[f][f] = 0.0;
            List<AdyacenteConPeso> lista = this.listasDeAdyacencias.get(i);
            for (int j = 0; j < lista.size(); j++) {
                int c = lista.get(j).getIndiceDeVertice();
                matriz[f][c] = this.pesoEntreVertices(f, c);
            }
        }
        return matriz;
    }

    protected Integer[][] matrizInicialPredecesores() {
        int n = super.cantidadDeVertices();
        Integer[][] matriz = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = GrafoP.POSICION_INVALIDA;
            }
        }
        return matriz;
    }

    */
}
