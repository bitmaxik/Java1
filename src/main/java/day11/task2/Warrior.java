package day11.task2;

public class Warrior extends Hero {
    private double health;
    private double physDef;
    private double magicDef;
    private double physAtt;


    public Warrior(){
        this.health = MAXHEALTH;
        this.physDef = 0.2;
        this.magicDef = 1;
        this.physAtt = 30;
    }
    @Override
    public void setHealth(double health) {
        this.health = health;
    }
    @Override
    public  double getHealth() {
        return health;
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
        if(hero.getHealth() <= hero.getPhysDef() * this.physAtt) hero.setHealth(MINHEALTH);
        else{
            hero.setHealth(hero.getHealth() - hero.getPhysDef() * this.physAtt);
        }
    }
    @Override
    public String toString(){
        return "Warrior{health=" + this.health + "}";
    }
}
