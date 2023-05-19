package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack{
    private double health;
    private double physDef;
    private double magicDef;
    private double physAtt;
    private double magicAtt;

    public Shaman(){
        this.health = MAXHEALTH;
        this.physDef = 0.8;
        this.magicDef = 0.8;
        this.physAtt = 10;
        this.magicAtt = 15;
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
    public void healHimself() {
        if((this.health + 50) >= 100) this.health = MAXHEALTH;
        else{
            this.health += 50;
        }
    }
    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
        if(hero.getHealth() > MAXHEALTH) hero.setHealth(MAXHEALTH);
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
        return "Shaman{health=" + this.health + "}";
    }
}
