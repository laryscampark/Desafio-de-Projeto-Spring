package Dio.Strategy;

import Dio.Singleton.SingletonEager;
import Dio.Singleton.SingletonLazy;
import Dio.Singleton.SingletonLazyHolder;

public class Robo {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }

    public static class Test {
        public static void main (String [] args){
            SingletonLazy lazy = SingletonLazy.getInstancia();
            System.out.println(lazy);
            lazy = SingletonLazy.getInstancia();
            System.out.println(lazy);


            SingletonEager eager = SingletonEager.getInstancia();
            System.out.println(eager);
            eager = SingletonEager.getInstancia();
            System.out.println(eager);

            SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
            System.out.println(holder);
            holder = SingletonLazyHolder.getInstancia();
            System.out.println(holder);
        }
    }
}
