public class GameCharacter {


    String name;
    int hp;
    int maxHp;
    int attackPower;
    boolean block;
    int gold;
    int experience;
    int elexir;

    public GameCharacter(String name, int maxHp, int attackPower, int gold, int experience, int elexir) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = this.maxHp;
        this.attackPower = attackPower;
        this.block = false;
        this.gold = gold;
        this.experience = experience;
        this.elexir=elexir;
    }

    public void attack(GameCharacter target) {
        int damage = this.attackPower;
        if (target.block) {
            if (Math.random() < 0.7) {
                System.out.println(target.name + "   attack blocked completely");
                return;
            } else {
                damage *= 3;
            }
        }
        target.hp -= damage;
        System.out.println(this.name + "   inflicted on the   " + target.name + "  damage" + " " + damage);
        System.out.println(target.name + "  has  " + target.hp + "/" + target.maxHp + "   health remaining");
    }

    public void blockAction() {
        hp++;
        if (hp > maxHp) {
            hp = maxHp;
        }
        block = true;
        System.out.println(this.name + "   tries to block the next attack. Gains 1 health");
    }

    public void reset() {
        block = false;
    }

    public void getsGold() {
        gold++;

    }
    public void getExperience(){
        experience++;
    }

}



