package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private double health;
    private double physDef;
    private double magicDef;
    private double physAtt;
    private double magicAtt;

    public Magician(){
        this.health = MAXHEALTH;
        this.physDef = 1;
        this.magicDef = 0.8;
        this.physAtt = 5;
        this.magicAtt = 20;
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
        hero.setHealth(hero.getHealth() - hero.getPhysDef() * this.physAtt);
        if(hero.getHealth() < MINHEALTH) hero.setHealth(MINHEALTH);
    }
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - hero.getMagicDef() * this.magicAtt);
        if(hero.getHealth() < MINHEALTH) hero.setHealth(MINHEALTH);
    }
    public String toString(){
        return "Magician{health=" + this.health + "}";
    }
}
