package Dio.Subsistema2.cep;

import Dio.Singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {

        super();
    }

    public static CepApi getInstancia() {

        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Queimados";
    }

    public String recuperarEstado(String cep){
        return "RJ";
    }

    public String recuperarPaís(String cep){
        return "Brazil";
    }
}


