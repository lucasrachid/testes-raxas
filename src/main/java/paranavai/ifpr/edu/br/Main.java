package paranavai.ifpr.edu.br;

import com.cashback.SimuladorCashBack;

public class Main {
    public static void main(String[] args) {
        double cashback1 = SimuladorCashBack.calculaCashBack(100, "Bronze");
        System.out.println("Cashback para Bronze e compra de 100: " + cashback1);

        double cashback2 = SimuladorCashBack.calculaCashBack(200, "Prata");
        System.out.println("Cashback para Prata e compra de 200: " + cashback2);

        double cashback3 = SimuladorCashBack.calculaCashBack(600, "Ouro");
        System.out.println("Cashback para Ouro e compra de 600: " + cashback3);
    }
}