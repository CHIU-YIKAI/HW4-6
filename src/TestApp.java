import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestApp {


    @Test
    public void testX(){
        assertEquals(App.lettergrade(-5), 'X');
        assertEquals(App.lettergrade(105), 'X');
    }
    @Test
    public void testF(){
        assertEquals(App.lettergrade(40), 'F');
    }
    @Test
    public void testD(){
        assertEquals(App.lettergrade(65), 'D');
    }
    @Test
    public void testC(){
        assertEquals(App.lettergrade(75), 'C');
    }
    @Test
    public void testB(){
        assertEquals(App.lettergrade(85), 'B');
    }
    @Test
    public void testA(){
        assertEquals(App.lettergrade(95), 'A');
    }

    @Test
    public void testXboundary  (){
        assertEquals(App.lettergrade(-1), 'X');
        assertEquals(App.lettergrade(-9999), 'X');
        assertEquals(App.lettergrade(101), 'X');
        assertEquals(App.lettergrade(9999), 'X');
    }
    @Test
    public void testFboundary  (){
        assertEquals(App.lettergrade(0), 'F');
        assertEquals(App.lettergrade(59), 'F');
    }
    @Test
    public void testDboundary  (){
        assertEquals(App.lettergrade(60), 'D');
        assertEquals(App.lettergrade(69), 'D');
    }
    @Test
    public void testCboundary  (){
        assertEquals(App.lettergrade(70), 'C');
        assertEquals(App.lettergrade(79), 'C');
    }
    @Test
    public void testBboundary  (){
        assertEquals(App.lettergrade(80), 'B');
        assertEquals(App.lettergrade(89), 'B');
    }
    @Test
    public void testAboundary  (){
        assertEquals(App.lettergrade(90), 'A');
        assertEquals(App.lettergrade(100), 'A');
    }
}
