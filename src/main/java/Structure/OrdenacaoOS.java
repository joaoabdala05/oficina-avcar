/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * classe responsavel por ordenar listas de ordemservico.
 * implementacao manual do algoritmo insertion sort.
 * 
 * @author gsantiagommv
 */
import Model.OrdemServico;
import java.util.List;

public class OrdenacaoOS {

    /**
     * ordena a lista de ordens de servico por data de entrada (mais antiga primeiro).
     * usa o algoritmo insertion sort de forma manual.
     * 
     * @param lista lista de ordens de servico que sera ordenada
     */
    public static void insertionSortPorDataEntrada(List<OrdemServico> lista) {
        
        // percorre a lista a partir do segundo elemento
        for (int i = 1; i < lista.size(); i++) {
            
            // pega o elemento atual que vamos inserir na posicao correta
            OrdemServico chave = lista.get(i);
            int j = i - 1;

            // move os elementos maiores que a chave uma posicao para frente
            // enquanto ainda houver elementos e o elemento anterior for maior que a chave
            while (j >= 0 && lista.get(j).getDataEntrada().after(chave.getDataEntrada())) {
                
                // desloca o elemento maior para a direita
                lista.set(j + 1, lista.get(j));
                j = j - 1;
            }

            // insere a chave na posicao correta
            lista.set(j + 1, chave);
        }
    }

    /**
     * ordena a lista de ordens de servico por valor total (do menor para o maior).
     * tambem usa insertion sort manual.
     * 
     * @param lista lista de ordens de servico
     */
    public static void insertionSortPorValorTotal(List<OrdemServico> lista) {
        
        for (int i = 1; i < lista.size(); i++) {
            
            OrdemServico chave = lista.get(i);
            int j = i - 1;

            while (j >= 0 && lista.get(j).getValorTotal() > chave.getValorTotal()) {
                lista.set(j + 1, lista.get(j));
                j = j - 1;
            }

            lista.set(j + 1, chave);
        }
    }
}