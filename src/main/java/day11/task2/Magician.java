package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private double magicAtt;

    public Magician(){
        this.setPhysDef(1);
        this.setMagicDef(0.8);
        this.setPhysAtt(5);
        this.magicAtt = 20;
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
        return "Magician{health=" + this.getHealth() + "}";
    }
}
