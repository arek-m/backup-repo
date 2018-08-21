package pl.coderstrust.multiplication;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class MultiplicationTableTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testForDefaultValues(){
        //given
        int defaultNumber = 4;
        ArrayList<String> expected = new ArrayList<>();
        expected.add("      1    2    3    4");
        expected.add(" 1    1    2    3    4");
        expected.add(" 2    2    4    6    8");
        expected.add(" 3    3    6    9   12");
        expected.add(" 4    4    8   12   16");

        //when
        ArrayList<String> actual = MultiplicationTable.printMultiplicationTable(defaultNumber);

        //then
        assertTrue(expected.equals(actual));
    }

    @Test
    public void testForNegativeValues(){
        //given
        int size = -10;

        //when
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Size of Multiplication Table should be grater than 0");
        MultiplicationTable.printMultiplicationTable(size);
    }

}