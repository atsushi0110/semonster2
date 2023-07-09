package semonster2;

import java.util.ArrayList;
import java.util.Random;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  ArrayList<Monster> deck = new ArrayList<>();

  public void drawMonsters() {
    Monster monster = new Monster("スライム", 1);
    Random rand = new Random(0);
    for (int i = 0; i < 8; i++) {
      this.deck.add(new Monster(monster.summonMonster(rand.nextInt(8)), rand.nextInt(5)));
    }
  }

  @Override
  public String toString() {
    String showDeck = "";
    for (Monster m : this.deck) {
      showDeck = showDeck + m.name + ":レア度[" + m.rare + "]\n";
    }
    return showDeck;
  }
}
