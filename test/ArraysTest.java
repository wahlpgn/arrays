import org.junit.jupiter.api.*;

class ArraysTest {

    @Test
    @DisplayName("Testing createIntArray(): 0 to 3")
    void create1(){
       int[] test = {0, 1, 2, 3};
       int length = Arrays.createIntArray(0,3) == null ? 0 : Arrays.createIntArray(0,3).length;
        Assertions.assertEquals(test.length, length, "Die Länge des Array soll bei INPUT(0, 3) 4 sein"  );
        Assertions.assertArrayEquals(test, Arrays.createIntArray(0,3), "Das Array ist mit den falschen Werten gefüllt");
    }

    @Test
    @DisplayName("Testing resetingIntArray()")
    void reset1(){
        int[] test = new int[(int)(Math.random() * 25 + 1)] ;
        for(int e: test) {
            e = (int)(Math.random() * 25 + 1);
        }
        System.out.println(test.length);

        Assertions.assertArrayEquals(new int[test.length], Arrays.resetIntArray(test), "Das Array ist mit den falschen Werten gefüllt");
    }

}