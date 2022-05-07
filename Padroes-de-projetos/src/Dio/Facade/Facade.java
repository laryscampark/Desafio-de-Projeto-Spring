package Dio.Facade;

import Dio.Subsistema1.crm.CrmService;
import Dio.Subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        String país = CepApi.getInstancia().recuperarPaís(cep);

        CrmService.gravarCliente(nome,cep, cidade,estado, país);
    }
}
