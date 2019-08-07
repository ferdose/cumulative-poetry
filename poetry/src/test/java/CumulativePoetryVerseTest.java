import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CumulativePoetryVerseTest {
    private Poetry poetry;

    @Before
    public void setUp() {
        poetry = new Poetry();
    }

    @Test
    public void testRevealForDayInvalid() {
        String expectedRevealForDayOne = "Provided input for reveal-for-day option is not a valid day. Please check and try again";
        assertEquals(expectedRevealForDayOne, poetry.revealForDay("abc"));
    }

    @Test
    public void testRevealForDayOne() {
        String expectedRevealForDayOne = "This is the house that Jack built.\n";
        assertEquals(expectedRevealForDayOne, poetry.revealForDay("1"));
    }

    ////@Ignore("Remove to run test")
    @Test
    public void testRevealForDayTwo() {
        String expectedRevealForDayTwo = "This is the malth that lay in\n" +
                "    the house that Jack built.\n";
        assertEquals(expectedRevealForDayTwo, poetry.revealForDay("2"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testRevealForDayThree() {
        String expectedRevealForDayThree = "This is the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n";
        assertEquals(expectedRevealForDayThree, poetry.revealForDay("3"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testRevealForDayFour() {
        String expectedRevealForDayFour = "This is the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n";
        assertEquals(expectedRevealForDayFour, poetry.revealForDay("4"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testRevealForDayFive() {
        String expectedRevealForDayFive = "This is the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n";
        assertEquals(expectedRevealForDayFive, poetry.revealForDay("5"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testRevealForDaySix() {
        String expectedRevealForDaySix = "This is that cow with the crumpled horn that tossed\n" +
                "    the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n";
        assertEquals(expectedRevealForDaySix, poetry.revealForDay("6"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testRevealForDaySeven() {
        String expectedRevealForDaySeven = "This is the maiden all forlorn that milked\n" +
                "    that cow with the crumpled horn that tossed\n" +
                "    the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n";
        assertEquals(expectedRevealForDaySeven, poetry.revealForDay("7"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testRevealForDayEight() {
        String expectedRevealForDayEight = "This is the man all tattered and torn that kissed\n" +
                "    the maiden all forlorn that milked\n" +
                "    that cow with the crumpled horn that tossed\n" +
                "    the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n";
        assertEquals(expectedRevealForDayEight, poetry.revealForDay("8"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testRevealForDayNine() {
        String expectedRevealForDayNine = "This is the priest all shaven and shorn that married\n" +
                "    the man all tattered and torn that kissed\n" +
                "    the maiden all forlorn that milked\n" +
                "    that cow with the crumpled horn that tossed\n" +
                "    the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n";
        assertEquals(expectedRevealForDayNine, poetry.revealForDay("9"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testRevealForDayTen() {
        String expectedRevealForDayTen = "This is the rooster that crowed in the morn that woke\n" +
                "    the priest all shaven and shorn that married\n" +
                "    the man all tattered and torn that kissed\n" +
                "    the maiden all forlorn that milked\n" +
                "    that cow with the crumpled horn that tossed\n" +
                "    the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n";
        assertEquals(expectedRevealForDayTen, poetry.revealForDay("10"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testRevealForDayEleven() {
        String expectedRevealForDayEleven = "This is the farmer sowing his corn that kept\n" +
                "    the rooster that crowed in the morn that woke\n" +
                "    the priest all shaven and shorn that married\n" +
                "    the man all tattered and torn that kissed\n" +
                "    the maiden all forlorn that milked\n" +
                "    that cow with the crumpled horn that tossed\n" +
                "    the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n";
        assertEquals(expectedRevealForDayEleven, poetry.revealForDay("11"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testRevealForDayTwelve() {
        String expectedRevealForDayTwelve = "This is the horse and the hound and the horn that belonged to\n" +
                "    the farmer sowing his corn that kept\n" +
                "    the rooster that crowed in the morn that woke\n" +
                "    the priest all shaven and shorn that married\n" +
                "    the man all tattered and torn that kissed\n" +
                "    the maiden all forlorn that milked\n" +
                "    that cow with the crumpled horn that tossed\n" +
                "    the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n"+
                "    the malth that lay in\n" +
                "    the house that Jack built.\n";
        assertEquals(expectedRevealForDayTwelve, poetry.revealForDay("12"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testRecite() {
        String expectedSong = "Day 1 -\n" +
                "This is the house that Jack built.\n" +
                "\n" +
                "Day 2 -\n" +
                "This is the malth that lay in\n" +
                "    the house that Jack built.\n" +
                "\n" +
                "Day 3 -\n" +
                "This is the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n" +
                "\n" +
                "Day 4 -\n" +
                "This is the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n" +
                "\n" +
                "Day 5 -\n" +
                "This is the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n" +
                "\n" +
                "Day 6 -\n" +
                "This is that cow with the crumpled horn that tossed\n" +
                "    the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n" +
                "\n" +
                "Day 7 -\n" +
                "This is the maiden all forlorn that milked\n" +
                "    that cow with the crumpled horn that tossed\n" +
                "    the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n" +
                "\n" +
                "Day 8 -\n" +
                "This is the man all tattered and torn that kissed\n" +
                "    the maiden all forlorn that milked\n" +
                "    that cow with the crumpled horn that tossed\n" +
                "    the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n" +
                "\n" +
                "Day 9 -\n" +
                "This is the priest all shaven and shorn that married\n" +
                "    the man all tattered and torn that kissed\n" +
                "    the maiden all forlorn that milked\n" +
                "    that cow with the crumpled horn that tossed\n" +
                "    the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n" +
                "\n" +
                "Day 10 -\n" +
                "This is the rooster that crowed in the morn that woke\n" +
                "    the priest all shaven and shorn that married\n" +
                "    the man all tattered and torn that kissed\n" +
                "    the maiden all forlorn that milked\n" +
                "    that cow with the crumpled horn that tossed\n" +
                "    the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n" +
                "\n" +
                "Day 11 -\n" +
                "This is the farmer sowing his corn that kept\n" +
                "    the rooster that crowed in the morn that woke\n" +
                "    the priest all shaven and shorn that married\n" +
                "    the man all tattered and torn that kissed\n" +
                "    the maiden all forlorn that milked\n" +
                "    that cow with the crumpled horn that tossed\n" +
                "    the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n" +
                "\n" +
                "Day 12 -\n" +
                "This is the horse and the hound and the horn that belonged to\n" +
                "    the farmer sowing his corn that kept\n" +
                "    the rooster that crowed in the morn that woke\n" +
                "    the priest all shaven and shorn that married\n" +
                "    the man all tattered and torn that kissed\n" +
                "    the maiden all forlorn that milked\n" +
                "    that cow with the crumpled horn that tossed\n" +
                "    the dog that worried\n" +
                "    the cat that killed\n" +
                "    the rat that ate\n" +
                "    the malth that lay in\n" +
                "    the house that Jack built.\n"+"\n";
        assertEquals(expectedSong, poetry.recite());
    }




}