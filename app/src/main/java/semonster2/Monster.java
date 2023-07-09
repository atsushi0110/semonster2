package semonster2;
//import java.util.Random;

public class Monster {
  String name;
  int rare;// 1:common,2:uncommon,3:rare,4:ultra rare

  Monster(String name,int rare) {
    this.rare=rare;
    if(rare>=3){
      this.name=this.evolutionMonster(name);
    }else if(rare<2){
      this.name=this.commonMonster(name);
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

  String commonMonster(String mname){
    return "そこら辺にいる"+mname;
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }
}
