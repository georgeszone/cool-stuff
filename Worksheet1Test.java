import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** @author <Ali Warsame>
 * This class contains the test cases for Worksheet1 solutions.
 */
public class Worksheet1Test {

    @Test
    void powerTest() {
        int expected1 = 1;
        int expected2 = 32;
        int expected3 = 15*15*15*15*15;

        int actualRegular1 = Worksheet1.power(100, 0);
        int actualRegular2 = Worksheet1.power(2,5);
        int actualRegular3 = Worksheet1.power(15,5);

        int actualFast1 = Worksheet1.fastPower(100, 0);
        int actualFast2 = Worksheet1.fastPower(2,5);
        int actualFast3 = Worksheet1.fastPower(15,5);

        assertEquals(expected1,actualRegular1, "Power test failed. Expected " + expected1 + " but got " + actualRegular1);
        assertEquals(expected2,actualRegular2, "Power test failed. Expected " + expected2 + " but got " + actualRegular2);
        assertEquals(expected3,actualRegular3, "Power test failed. Expected " + expected3 + " but got " + actualRegular3);

        assertEquals(expected1,actualFast1, "Power test failed. Expected " + expected1 + " but got " + actualFast1);
        assertEquals(expected2,actualFast2, "Power test failed. Expected " + expected2 + " but got " + actualFast2);
        assertEquals(expected3,actualFast3, "Power test failed. Expected " + expected3 + " but got " + actualFast3);

    }

    @Test
    void negateAllTest() {

        List<Integer> expected1 = constructList(-2,3,-5,-7);
        List<Integer> expected2 = constructList(1,54,0,1,-5);
        List<Integer> expected3 = new List();

        List<Integer> actual1 = Worksheet1.negateAll(constructList(2,-3,5,7));
        List<Integer> actual2 = Worksheet1.negateAll(constructList(-1,-54,0,-1,5));
        List<Integer> actual3 = Worksheet1.negateAll(new List<>());

        assertEquals(expected1,actual1, "negateAll test failed. Expected: " + expected1 + " but got " + actual1);
        assertEquals(expected2,actual2, "negateAll test failed. Expected: " + expected2 + " but got " + actual2);
        assertEquals(expected3,actual3, "negateAll test failed. Expected: " + expected3 + " but got " + actual3);

    }

    @Test
    void findTest() {

        int expected1 = 3;
        int expected2 = 8;

        int actual1 = Worksheet1.find(-6, constructList(-53,138,2,-6,96,-2));
        int actual2 = Worksheet1.find(8, constructList(1,3,6,9,9,7,6,5,8,8,8));

        assertEquals(expected1,actual1, "find test failed. Expected: " + expected1 + " but got " + actual1);
        assertEquals(expected2,actual2, "find test failed. Expected: " + expected2 + " but got " + actual2);
        assertThrows(IllegalArgumentException.class,  () -> {
            Worksheet1.find(2, constructList(1, 3, 4, 5, 6, 7, 8));
        }, "find Failed. The number was not expected to appear in the list but it did.");
    }

    @Test
    void allEvenTest() {

        boolean actual1 = Worksheet1.allEven(constructList(2,4,6,8,10));
        boolean actual2 = Worksheet1.allEven(constructList(-2,6,-20,100,0));
        boolean actual3 = Worksheet1.allEven(constructList(1,3,2,8,9,10));
        boolean actual4 = Worksheet1.allEven(constructList(2,4,6,8,10,3));

        assertTrue(actual1, "allEven test failed. Expected: " + true + " but got " + actual1);
        assertTrue(actual2, "allEven test failed. Expected: " + true + " but got " + actual2);
        assertFalse(actual3, "allEven test failed. Expected: " + false + " but got " + actual3);
        assertFalse(actual4, "allEven test failed. Expected: " + false + " but got " + actual4);


        assertThrows(IllegalArgumentException.class,  () -> {
            Worksheet1.allEven(new List<Integer>());
        }, "allEven test failed. The provided list was empty. Please provide some values");

    }

    @Test
    void evenNumbersTest() {

        List<Integer> expected1 = constructList(2,4,8,-10);
        List<Integer> expected2 = constructList(-2,100,0,0);;
        List<Integer> expected3 = constructList(-8,-6,10);
        List<Integer> expected4 = new List<>();

        List<Integer> actual1 = Worksheet1.evenNumbers(constructList(2,4,3,8,-10));
        List<Integer> actual2 = Worksheet1.evenNumbers(constructList(-2,3,7,100,0,0,3));
        List<Integer> actual3 = Worksheet1.evenNumbers(constructList(-8,-7,-6,5,3,10));
        List<Integer> actual4 = Worksheet1.evenNumbers(new List<>());

        assertEquals(expected1,actual1, "evenNumbers test failed. Expected: " + expected1 + " but got " + actual1);
        assertEquals(expected2,actual2, "evenNumbers test failed. Expected: " + expected2 + " but got " + actual2);
        assertEquals(expected3,actual3, "evenNumbers test failed. Expected: " + expected3 + " but got " + actual3);
        assertEquals(expected4,actual4, "evenNumbers test failed. Expected: " + expected4 + " but got " + actual4);

    }

    @Test
    void sortedTest() {

        boolean actual1 = Worksheet1.sorted(constructList(9,7,4,4,4,1,0,-5));
        boolean actual2 = Worksheet1.sorted(constructList(2));
        boolean actual3 = Worksheet1.sorted(constructList(1,2,4,5,6,8));
        boolean actual4 = Worksheet1.sorted(constructList(100,99,43,1,0,0,1));

        assertTrue(actual1, "sortedness test failed. Expected true but got false");
        assertTrue(actual2, "sortedness test failed. Expected true but got false");
        assertFalse(actual3, "sortedness test failed. Expected false but got true");
        assertFalse(actual4, "sortedness test failed. Expected false but got true");

    }

    @Test
    void mergeTest() {

        List<Integer> expected1 = constructList(10,8,3,1,0,0,-1);
        List<Integer> expected2 = constructList(100,78,24,1,1,1,1);
        List<Integer> expected3 = constructList(3,3,3,2,2,2);

        List<Integer> actual1 = Worksheet1.merge(constructList(10,0,0,-1),constructList(8,3,1));
        List<Integer> actual2 = Worksheet1.merge(constructList(78,24,1,1),constructList(100,1,1));
        List<Integer> actual3 = Worksheet1.merge(constructList(3,2,2),constructList(3,3,2));

        assertEquals(expected1,actual1, "negateAll test failed. Expected: " + expected1 + " but got " + actual1);
        assertEquals(expected2,actual2, "negateAll test failed. Expected: " + expected2 + " but got " + actual2);
        assertEquals(expected3,actual3, "negateAll test failed. Expected: " + expected3 + " but got " + actual3);

    }

    @Test
    void removeDuplicatesTest() {

        List<Integer> expected1 = constructList(10,8,7,6,5,4);
        List<Integer> expected2 = constructList(100,33,32,-28,-99);
        List<Integer> expected3 = constructList(3,2,1);

        List<Integer> actual1 = Worksheet1.removeDuplicates(constructList(10,10,8,7,6,6,5,4,4,4,4));
        List<Integer> actual2 = Worksheet1.removeDuplicates(constructList(100,100,100,33,33,32,32,-28,-99,-99));
        List<Integer> actual3 = Worksheet1.removeDuplicates(constructList(3,3,3,2,1,1,1));


        assertEquals(expected1,actual1, "removeDuplicates test failed. Expected: " + expected1 + " but got " + actual1);
        assertEquals(expected2,actual2, "removeDuplicates test failed. Expected: " + expected2 + " but got " + actual2);
        assertEquals(expected3,actual3, "removeDuplicates test failed. Expected: " + expected3 + " but got " + actual3);

    }

    static List<Integer> constructList(int... nums){
        if(nums.length == 0){
            return new List<>();
        }
        else if(nums.length == 1){
            return new List<Integer>(nums[0],new List<>());
        }
        else{
            return new List<Integer>(nums[0], constructList(Arrays.copyOfRange(nums,1,nums.length)));
        }
    }

}


