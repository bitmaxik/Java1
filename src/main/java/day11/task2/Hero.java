package day11.task2;

public abstract class Hero implements PhysAttack {
    private double health = MAXHEALTH;
    private double physDef;
    private double magicDef;
    private double physAtt;
    public static final double MAXHEALTH = 100.0;
    public static final double MINHEALTH = 0;

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }
    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }
    public double getPhysAtt() {
        return physAtt;
    }
    public void setPhysAtt(double physAtt) {
        this.physAtt = physAtt;
    }
    public  double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health = health;
    }
    public double getPhysDef() {
        return physDef;
    }
    public double getMagicDef() {
        return magicDef;
    }
    public void physicalAttack(Hero hero) {
        if(hero.getHealth() <= hero.getPhysDef() * this.getPhysAtt()) hero.setHealth(MINHEALTH);
        else{
            hero.setHealth(hero.getHealth() - hero.getPhysDef() * this.getPhysAtt());
        }
    }
};

