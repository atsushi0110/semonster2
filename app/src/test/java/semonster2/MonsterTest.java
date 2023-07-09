package semonster2;
import org.junit.Test;
import static org.junit.Assert.*;


public class MonsterTest {
    @Test public void monsterHaveMonsterNames(){
        Monster classUnderTest=new Monster("スライム",1);
        assertNotNull("monsters should have names",classUnderTest.toString());
    }
    @Test public void testMonsterReturnNameAndRarity(){
        Monster classUnderTest=new Monster("スライム",2);
        assertEquals(classUnderTest.name+":レア度["+classUnderTest.rare+"]",classUnderTest.toString());
    }
    @Test public void summonMonsterTest(){
        Monster classUnderTest=new Monster("スライム",4);
        String expected[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
        for(int i=0;i<5;i++){
            assertEquals(expected[i],classUnderTest.summonMonster(i));
        }
    }
    @Test public void evolutionMonsterTest(){
        Monster classUnderTest = new Monster("スライム",0);
        String expected="キングスライム";
        assertEquals(expected,classUnderTest.evolutionMonster("スライム"));
    }

    @Test public void commonMonsterTest(){
        Monster classUnderTest = new Monster("スライム",0);
        String expected="そこら辺にいるスライム";
        assertEquals(expected,classUnderTest.commonMonster("スライム"));
    }
}
