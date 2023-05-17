package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private double health;
    private double physDef;
    private double magicDef;
    private double physAtt;
    private double magicAtt;

    public Warrior(){
        this.health = MAXHEALTH;
        this.physDef = 0.2;
        this.magicDef = 1;
        this.physAtt = 30;
        this.magicAtt = 0;
    }

    @Override
    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public double getHealth() {
        return this.health;
    }

    @Override
    public double getPhysDef() {
        return this.physDef;
    }

    @Override
    public double getMagicDef() {
        return this.magicDef;
    }


    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (hero.getPhysDef() * this.physAtt));
        if(hero.getHealth() < MINHEALTH) hero.setHealth(MINHEALTH);
    }
    public String toString(){
        return "Warrior{health=" + this.health + "}";
    }
}
