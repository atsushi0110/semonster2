package semonster2;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test public void playerdrawshowdeck(){
        Player classUnderTest=new Player();
        assertNotNull("player should have deck",classUnderTest.toString());
    }

    @Test public void HowManyDecks(){
        Player classUnderTest=new Player();
        int expected=8;
        classUnderTest.drawMonsters();
        assertEquals(expected,classUnderTest.deck.size());
    }
    
}
