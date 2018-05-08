package pikachu.ti;

import static org.junit.Assert.*;

public class NubbersTest {

    @org.junit.Test
    public void sum() {
        Nubbers num = new Nubbers();
        assertEquals(15,num.sum(5));
    }
}