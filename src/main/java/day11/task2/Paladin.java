package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack, MagicAttack {
    private double health;
    private double physDef;
    private double magicDef;
    private double physAtt;
    private double magicAtt;

    public Paladin(){
        this.health = MAXHEALTH;
        this.physDef = 0.5;
        this.magicDef = 0.8;
        this.physAtt = 15;
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
    public void healHimself() {
        this.health += 25;
        if(this.health > MAXHEALTH) this.health = MAXHEALTH;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 10);
        if(hero.getHealth() > MAXHEALTH) hero.setHealth(MAXHEALTH);
    }
    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - hero.getPhysDef() * this.physAtt);
        if(hero.getHealth() < MINHEALTH) hero.setHealth(MINHEALTH);
    }
    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - hero.getMagicDef() * this.magicAtt);
        if(hero.getHealth() < MINHEALTH) hero.setHealth(MINHEALTH);
    }
    public String toString(){
        return "Paladin{health=" + this.health + "}";
    }
}
