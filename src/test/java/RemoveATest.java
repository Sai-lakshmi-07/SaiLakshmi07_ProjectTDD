import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RemoveATest {
    /*To do list
    1.Zero string length: "" - ""
    2.length of string is 1 and A :"A" - ""
    3.length of string is 1 and not A :"B" - "B"
    4.Single A at first:"ABCD" - "BCD"
    5.Single A at second:"BACD" - "BCD"
    6.No A's in first two positions:"BBAA" - "BBAA"
    7.Two A's in first two positions:"AACD" - "CD"
    8.Two A's in both sides:"AABAA" - "BAA"
     */
    RemoveA removeA;

    @BeforeEach
    void setUp()
    {
        removeA =new RemoveA();
    }
    @Test
    void testlength0Str()
    {
        assertEquals("",removeA.deleteA(""));
    }
    @Test
    void testlength1Str()
    {
        assertEquals("",removeA.deleteA("A"));
    }
    @Test
    void testlength1StrnotA()
    {
        assertEquals("B",removeA.deleteA("B"));
    }
    @Test
    void test1stchar()
    {
        assertEquals("BCD",removeA.deleteA("ABCD"));
    }
    @Test
    void test2ndchar()
    {
        assertEquals("BCD",removeA.deleteA("BACD"));
    }
    @Test
    void testnoAinfirstTwo()
    {
        assertEquals("BBAA",removeA.deleteA("BBAA"));
    }
    @Test
    void test2chars()
    {
        assertEquals("CD",removeA.deleteA("AACD"));
    }
    @Test
    void testAsfromBothsides()
    {
        assertEquals("BAA",removeA.deleteA("AABAA"));
    }
}
