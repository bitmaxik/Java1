package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack{

    private double magicAtt;

    public Shaman(){
        this.setPhysDef(0.8);
        this.setMagicDef(0.8);
        this.setPhysAtt(10);
        this.magicAtt = 15;
    }

    @Override
    public void healHimself() {
        if((this.getHealth() + 50) >= 100) this.setHealth(MAXHEALTH);
        else{
            this.setHealth(this.getHealth() + 50);
        }
    }
    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
        if(hero.getHealth() > MAXHEALTH) hero.setHealth(MAXHEALTH);
    }
    @Override
    public void magicalAttack(Hero hero) {
        if(hero.getHealth() <= hero.getMagicDef() * this.magicAtt) hero.setHealth(MINHEALTH);
        else {
            hero.setHealth(hero.getHealth() - hero.getMagicDef() * this.magicAtt);
        }
    }
    @Override
    public String toString(){
        return "Shaman{health=" + this.getHealth() + "}";
    }
}
