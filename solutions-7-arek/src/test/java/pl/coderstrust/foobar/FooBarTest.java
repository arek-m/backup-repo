package pl.coderstrust.foobar;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class FooBarTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testForProperValues(){
        //given
        int maxNumber = 5;
        ArrayList<String> expected = new ArrayList<>();
        expected.add("0 FooBar");
        expected.add("1 ");
        expected.add("2 ");
        expected.add("3 Foo");
        expected.add("4 ");
        expected.add("5 Bar");

        //when
        ArrayList<String> actual = FooBar.printFooOrBarUpToNumber(maxNumber);

        //then
        assertTrue(expected.equals(actual));
    }

    @Test
    public void testForNegativeValues(){
        //given
        int maxNumber = -10;

        //when
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("maxNumber should be greater or equal to 0");
        FooBar.printFooOrBarUpToNumber(maxNumber);
    }

    @Test
    public void testForValueEqualZero(){
        //given
        ArrayList<String> expected = new ArrayList<>();
        expected.add("0 FooBar");

        //when
        ArrayList<String> actual = FooBar.printFooOrBarUpToNumber(0);

        //then
        assertTrue(expected.equals(actual));
    }
}