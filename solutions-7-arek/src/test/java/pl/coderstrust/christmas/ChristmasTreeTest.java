package pl.coderstrust.christmas;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ChristmasTreeTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testForDefaultValues() {
        //given
        ArrayList<String> expected = new ArrayList<>();
        expected.add("    *");
        expected.add("   ***");
        expected.add("  *****");
        expected.add(" *******");
        expected.add("*********");
        expected.add("   **");

        //when1
        ArrayList<String> actual = new ArrayList<>();
        actual = ChristmasTree.printChristmasTree(5);

        //then
        assertTrue(expected.equals(actual));
    }

    @Test
    public void testForValue1() {
        //given
        ArrayList<String> expected = new ArrayList<>();
        expected.add("*");
        expected.add("**");

        //when
        ArrayList<String> actual = new ArrayList<>();
        actual = ChristmasTree.printChristmasTree(1);

        //then
        assertTrue(expected.equals(actual));
    }

    @Test
    public void testFor0AndNegativeSizeValue() {
        //given
        int size =-5;
        //when
        thrown.expect(IllegalArgumentException.class);
        //then
        ChristmasTree.printChristmasTree(size);
    }
}