package day11.task2;

public abstract class Hero {
    private double health;
    private double physDef;
    private double magicDef;
    private double physAtt;
    private double magicAtt;
    public static final double MAXHEALTH = 100.0;
    public static final double MINHEALTH = 0;

    public abstract void setHealth(double health);
    public abstract double getHealth();
    public abstract double getPhysDef();
    public abstract double getMagicDef();
}