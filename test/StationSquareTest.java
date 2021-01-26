import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Test;

import static org.junit.Assert.*;

public class StationSquareTest {
    Passenger avtandil = new Passenger("Avtandil", true);
    Passenger gela = new Passenger("Gela", false);
    Train train = new Train();

    @Test
    public void haveTicketTest(){
        assertTrue(avtandil.haveTicket());
    }

    @Test
    public void haveNoTicketTest(){
        assertFalse(gela.haveTicket());
    }

    @Test
    public void onTheTrainTest(){
        train.addPassenger(avtandil);
        assertTrue(train.getPassengerList().contains(avtandil));
    }

    @Test
    public void notOnTheTrainTest(){
        train.addPassenger(gela);
        assertFalse(train.getPassengerList().contains(gela));
    }

    @Test
    public void getTrueNameTest(){
        assertEquals("Avtandil", avtandil.getName());
    }

    @Test
    public  void getFalseNameTest(){
        assertNotEquals("Zauri", gela.getName());
    }
}
