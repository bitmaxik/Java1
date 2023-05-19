package day11.task2;

public class Magician extends Hero implements MagicAttack {
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
    public  double getHealth() {
        return health;
    }
    @Override
    public void setHealth(double health) {
        this.health = health;
    }
    @Override
    public double getPhysDef() {
        return physDef;
    }
    @Override
    public double getMagicDef() {
        return magicDef;
    }
    @Override
    public void physicalAttack(Hero hero) {
        if(hero.getHealth() <= hero.getPhysDef() * this.physAtt) hero.setHealth(MINHEALTH);
        else{
            hero.setHealth(hero.getHealth() - hero.getPhysDef() * this.physAtt);
        }
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
        return "Magician{health=" + this.health + "}";
    }
}
