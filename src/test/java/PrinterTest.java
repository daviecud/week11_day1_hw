import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 4, 3);
    }

    @Test
    public void testPaperQuantity(){
        assertEquals(50, printer.getPaperQuantity());
    }

    @Test
    public void testNumberofPages(){
        assertEquals(4, printer.getNumberOfPages());
    }

    @Test
    public void testNumberOfCopies(){
        assertEquals(3, printer.getNumberOfCopies());
    }

    @Test
    public void testPrint(){
        assertEquals(12, printer.print());
    }

    @Test
    public void testOkayToPrint(){
        assertEquals(false, printer.okayToPrint());
    }

    @Test
    public void testPrinting(){
        assertEquals(12, printer.printing());
    }


}
