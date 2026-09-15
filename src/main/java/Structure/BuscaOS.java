/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * classe de busca manual de ordens de servico.
 * implementa busca linear (exigencia de estrutura de dados).
 * 
 * @author gsantiagommv
 */
import Model.OrdemServico;
import java.util.ArrayList;
import java.util.List;

public class BuscaOS {

    public static List<OrdemServico> buscarPorNumeroOS(List<OrdemServico> lista, int numeroOS) {
        List<OrdemServico> resultado = new ArrayList<>();
        for (OrdemServico os : lista) {
            if (os.getNumeroOS() == numeroOS) {
                resultado.add(os);
            }
        }
        return resultado;
    }

    public static List<OrdemServico> buscarPorPlaca(List<OrdemServico> lista, String placa) {
        List<OrdemServico> resultado = new ArrayList<>();
        for (OrdemServico os : lista) {
            if (os.getVeiculo() != null && 
                os.getVeiculo().getPlaca() != null &&
                os.getVeiculo().getPlaca().equalsIgnoreCase(placa)) {
                resultado.add(os);
            }
        }
        return resultado;
    }
}