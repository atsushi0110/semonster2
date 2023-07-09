package semonster2;
//import java.util.Random;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare

  Monster(String name,int rare) {
    this.rare=rare;
    if(rare>=3){
      this.name=this.evolutionMonster(name);
    }else{
      this.name=name;
    }
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント","ゴブリン","死神","ドラキュラ" };
    return monsters[mnumber];
  }

  String evolutionMonster(String mname){
    return "キング"+mname;
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }
}
