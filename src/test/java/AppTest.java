import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cashback.SimuladorCashBack;

public class AppTest {
     @Test
    public void testCashbackBronzeAte100() {
        double cashback = SimuladorCashBack.calculaCashBack(100, "Bronze");
        assertEquals(5.0, cashback, 0.01);
    }

    @Test
    public void testCashbackBronzeDe100a500() {
        double cashback = SimuladorCashBack.calculaCashBack(200, "Bronze");
        assertEquals(20.0, cashback, 0.01);
    }

    @Test
    public void testCashbackBronzeAcima500() {
        double cashback = SimuladorCashBack.calculaCashBack(600, "Bronze");
        assertEquals(90.0, cashback, 0.01);
    }

    @Test
    public void testCashbackPrataAte100() {
        double cashback = SimuladorCashBack.calculaCashBack(100, "Prata");
        assertEquals(10.0, cashback, 0.01);
    }

    @Test
    public void testCashbackPrataDe100a500() {
        double cashback = SimuladorCashBack.calculaCashBack(200, "Prata");
        assertEquals(30.0, cashback, 0.01);
    }

    @Test
    public void testCashbackPrataAcima500() {
        double cashback = SimuladorCashBack.calculaCashBack(600, "Prata");
        assertEquals(120.0, cashback, 0.01);
    }

    @Test
    public void testCashbackOuroAte100() {
        double cashback = SimuladorCashBack.calculaCashBack(100, "Ouro");
        assertEquals(15.0, cashback, 0.01);
    }

    @Test
    public void testCashbackOuroDe100a500() {
        double cashback = SimuladorCashBack.calculaCashBack(200, "Ouro");
        assertEquals(40.0, cashback, 0.01);
    }

    @Test
    public void testCashbackOuroAcima500() {
        double cashback = SimuladorCashBack.calculaCashBack(600, "Ouro");
        assertEquals(150.0, cashback, 0.01); 
    }

    @Test
    public void testCashbackCompraZero() {
        double cashback = SimuladorCashBack.calculaCashBack(0, "Bronze");
        assertEquals(0.0, cashback, 0.01);
    }

    @Test
    public void testCashbackCompraNegativa() {
        double cashback = SimuladorCashBack.calculaCashBack(-50, "Bronze");
        assertEquals(0.0, cashback, 0.01); 
        // Não deve aplicar cashback para valores negativos
        // Está aplicando erro e retornando -2.5 de cashback.
    }
}
