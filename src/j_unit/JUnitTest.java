package j_unit;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JUnitTest {

    @Test
    public void test0() {

        int a = 50;
        int b = 100;

        int actualTotal;

        int expectedTotal = 150;

        actualTotal = a + b;

        Assert.assertEquals(expectedTotal, actualTotal);

        System.out.println("test 0 passed");
    }

    @Test
    public void test1() {

        int a = 15;
        int b = 7;

        int actualTotal;

        int expectedTotal = 8;

        actualTotal = a - b;

        Assert.assertEquals(expectedTotal, actualTotal);

        System.out.println("test 1 passed");
    }

    @Test
    public void test2() {

        int z = 1738;
        int y = 100;

        int actualTotal;

        int expectedTotal = 1838;

        actualTotal = z + y;

        Assert.assertEquals(expectedTotal, actualTotal);

        System.out.println("test 2 passed");
    }

    @Test
    public void test3() {

        int number = 1000;
        int more = 371;

        int actualTotal;

        int expectedTotal = 371000;

        actualTotal = number * more;

        Assert.assertEquals(expectedTotal, actualTotal);

        System.out.println("test 3 passed");
    }

    @Test
    public void test4() {

        String string = "Java";
        String substring = "va";
        System.out.println(string.contains(substring));
        System.out.println("test 4 passed");

    }

    @Test
    public void test5() {

        ArrayList<Integer> arr = new ArrayList<Integer>(4);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        boolean ans = arr.contains(2);
        if (ans)
            System.out.println("The list contains 2");
        else
            System.out.println("The list does not contains 2");

        ans = arr.contains(5);

        if (ans)
            System.out.println("The list contains 5");
        else
            System.out.println("The list does not contains 5");
        System.out.println("test 5 passed");
    }

    @Test
    public void test6() {

        String str_Sample = "This is a String contains Example";
        System.out.println("Contains sequence 'ing': " + str_Sample.contains("ing"));
        System.out.println("Contains sequence 'Example': " + str_Sample.contains("Example"));
        System.out.println("Contains sequence 'example': " + str_Sample.contains("example"));
        System.out.println("Contains sequence 'is String': " + str_Sample.contains("is String"));
        System.out.println("test 6 passed");

    }

    @Test
    public void test7() {
        Map<String, String> asiaCapital1 = new HashMap<String, String>();
        asiaCapital1.put("Japan", "Tokyo");
        asiaCapital1.put("South Korea", "Seoul");

        Map<String, String> asiaCapital2 = new HashMap<String, String>();
        asiaCapital2.put("South Korea", "Seoul");
        asiaCapital2.put("Japan", "Tokyo");

        Map<String, String> asiaCapital3 = new HashMap<String, String>();
        asiaCapital3.put("Japan", "Tokyo");
        asiaCapital3.put("China", "Beijing");

        assertTrue(asiaCapital1.equals(asiaCapital3));
        assertFalse(asiaCapital1.equals(asiaCapital3));
    }

    @Test
    public void test8() {

        int integer = 18;
        int integer2 = 45;

        int actualTotal;

        int expectedTotal = 27;

        actualTotal = integer + integer2;

        Assert.assertEquals(expectedTotal, actualTotal);

        System.out.println("test 8 passed");
    }

    @Test
    public void test9() {
        int g = 1000;
        int f = 371;
        int actualTotal;
        int expectedTotal = 10000;
        actualTotal = g * f;
        Assert.assertEquals(expectedTotal, actualTotal);
        System.out.println("test 9 passed");
    }
}