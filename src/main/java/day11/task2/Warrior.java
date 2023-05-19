package day11.task2;

public class Warrior extends Hero {

    public Warrior(){
        this.setPhysDef(0.2);
        this.setMagicDef(1);
        this.setPhysAtt(30);
    }
    @Override
    public String toString(){
        return "Warrior{health=" + this.getHealth() + "}";
    }
}
