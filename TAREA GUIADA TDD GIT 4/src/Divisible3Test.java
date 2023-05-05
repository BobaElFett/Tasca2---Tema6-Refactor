import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Divisible3Test {
    
    @org.junit.jupiter.api.Test
    void divisible() {
    }
    
    
    @Test
    void divisibleTest1() {
        assertTrue(Divisible3.divisible(2));
    }
    
    @Test
    void divisibleTest2() {
        assertTrue(Divisible3.divisible(6));
    }
    
    @Test
    void divisibleTest3() {
        assertFalse(Divisible3.divisible(4));
    }
    
    @Test
    void divisibleTest4() {
        assertTrue(Divisible3.divisible(12));
    }
    
    @Test
    void divisibleTest5() {
        assertFalse(Divisible3.divisible(1));
    }
    
    @Test
    void divisibleTest6() {
        assertFalse(Divisible3.divisible(10));
    }
    
    @Test
    void divisibleTest7() {
        assertFalse(Divisible3.divisible(7));
    }
    
    
}