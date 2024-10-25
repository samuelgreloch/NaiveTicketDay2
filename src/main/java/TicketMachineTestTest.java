import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * The test class TicketMachineTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicketMachineTestTest {
    /**
     * Default constructor for test class TicketMachineTest
     */
    public TicketMachineTestTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void insertMoneyTest() {
        TicketMachine testTicketMachine = new TicketMachine(0);

        testTicketMachine.insertMoney(0);

        assertEquals(Integer.valueOf(0), testTicketMachine.getBalance());
    }

    @Test
    public void printTicketTest() {
        TicketMachine testTicketMachine = new TicketMachine(20);

        assertEquals("Ticket price: 20 cents. Your total is 20.", testTicketMachine.printTicket());
        assertEquals(Integer.valueOf(1), testTicketMachine.getTicketNumber());
        assertEquals(Integer.valueOf(2), testTicketMachine.incrementTicketNumber());
        assertNotEquals(Integer.valueOf(3), testTicketMachine.getTicketNumber());

    }

    @Test
    public void printTicketTest2() {
        TicketMachine testTicketMachine = new TicketMachine(40);

        assertNotEquals("Ticket price: 13 cents. Your total is 0.", testTicketMachine.printTicket());
        assertEquals(Integer.valueOf(1), testTicketMachine.getTicketNumber());
    }

    @Test
    public void incrementTicketNumberTest() {
        TicketMachine testTicketMachine = new TicketMachine(40);

        for (int i = 0; i < 10; i++) {
            testTicketMachine.printTicket();
        }

        assertEquals(Integer.valueOf(10), testTicketMachine.getTicketNumber());
        assertNotEquals(Integer.valueOf(9), testTicketMachine.getTicketNumber());
    }
}






