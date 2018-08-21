package pl.coderstrust.pascal;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class PascalTriangleTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testDefaultValues() {
        //given
        int size = 5;
        ArrayList<String> expected = new ArrayList<>();
        expected.add("           1");
        expected.add("         1   1");
        expected.add("       1   2   1");
        expected.add("     1   3   3   1");
        expected.add("   1   4   6   4   1");

        //when
        ArrayList<String> actual = new ArrayList<>();
        actual = PascalTriangle.printPascalTriangle(size);

        //than
        assertTrue(expected.equals(actual));
    }

    @Test
    public void testNegativeAnd0Sizes() {
        //given
        int size =-10;
        //when
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("maxNumber should be greater than 0");
        //then
        PascalTriangle.printPascalTriangle(size);
    }
}
//nie testowac metod pomocniczych
//    @Test
//    public void testFactorial(){
//        //given
//        long expectedFactorialValueFor10 = 3628800;
//        long expectedFactorialValueFor0 = 1;
//        Long expectedFactorialValueForNegativeNumbers = null;
//        PascalTriangle testPascalTriangle = new PascalTriangle();
//        //when
//        long actualFactorialValuueFor10 = testPascalTriangle.factorial(10);
//        long actualFactorialValueFor0 = testPascalTriangle.factorial(0);
//        Long actualFactorialValueForNegativeNumbers = testPascalTriangle.factorial(-1);
//        //then
//        assertEquals("Factorial test has failed for 10", expectedFactorialValueFor10,actualFactorialValuueFor10);
//        assertEquals("Factorial test has failed for 0", expectedFactorialValueFor0,actualFactorialValueFor0);
//        assertEquals("Factorial test has failed for negative numbers", expectedFactorialValueForNegativeNumbers,actualFactorialValueForNegativeNumbers);
//    }
////nie testowac metod pomocniczych
//    @Test
//    public void testCalculateTriangleNodeValue(){
////        //given
//        long expectedTriangleNodeValueFor10And5 = 252;
//        long expectedTriangleNodeValueFor0And0 = 1;
//        Long expectedTriangleNodeValueForRowLowerThanCol = null;
//        Long expectedTriangleNodeValueForNegativeNumbers = null;
//        //when
//        PascalTriangle testPascalTriangle = new PascalTriangle();
//        long actualTriangleNodeValueFor10and5 = testPascalTriangle.calculateTriangleNodeValue(10,5);
//        long actualTriangleNodeValueFor0And0 = testPascalTriangle.calculateTriangleNodeValue(0,0);
//        Long actualTriangleNodeValueForRowLowerThanCol = testPascalTriangle.calculateTriangleNodeValue(0,1);
//        Long actualTriangleNodeValueForNegativeNumbers = testPascalTriangle.calculateTriangleNodeValue(-1,-4);
//        //then
//        assertEquals("TriangleNodeValue test failed for row=10 and col=5", expectedTriangleNodeValueFor10And5,actualTriangleNodeValueFor10and5);
//        assertEquals("TriangleNodeValue test failed for row=0 and col=0 ", expectedTriangleNodeValueFor0And0, actualTriangleNodeValueFor0And0);
//        assertEquals("TriangleNodeValue test failed for row lower than col", expectedTriangleNodeValueForRowLowerThanCol, actualTriangleNodeValueForRowLowerThanCol);
//        assertEquals("TriangleNodeValue test failed for row=0 and col=0 ", expectedTriangleNodeValueForNegativeNumbers, actualTriangleNodeValueForNegativeNumbers);
//
//    }
////rozbic na osobne case'y - analogicznie
//    //nie tworzyc instancji (materializacja) klasy - nie tworzyc obiektu
//    @Test
//    public void  testOfPrintPascalTriangle() {
//        //given
//        int testValueForDefaultSizes = 7;
//        int testValueForNegativeSizes = -1;
//        PascalTriangle testPascalTriangle = new PascalTriangle();
//        ArrayList<String> expectedPascalTriangleForDefaultSizes = PascalTriangle.DEFAULTPASCALTRIANGLE;
//        //when
//        ArrayList<String> actualPascalTriangleForDefaultSizes = testPascalTriangle.printPascalTriangle(testValueForDefaultSizes);
//        ArrayList<String> actualPascalTriangleForNegativeSizes = testPascalTriangle.printPascalTriangle(testValueForNegativeSizes);
//        //then
//        assertEquals("printPascalTriangle test failed for defaultValue of size=7",expectedPascalTriangleForDefaultSizes,actualPascalTriangleForDefaultSizes);
//        assertEquals("printPascalTriangle test failed for negative value of size = -1",null, actualPascalTriangleForNegativeSizes);
//    }
//
//
//}