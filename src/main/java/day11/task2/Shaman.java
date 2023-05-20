package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack{

    private double magicAtt;
    public static final double HEALHIMSELFSHAMAN = 50;
    public static final double HEALTEAMMAITSHAMAN = 30;

    public Shaman(){
        this.setPhysDef(0.8);
        this.setMagicDef(0.8);
        this.setPhysAtt(10);
        this.magicAtt = 15;
    }

    @Override
    public void healHimself() {
        if((this.getHealth() + HEALHIMSELFSHAMAN) >= MAXHEALTH) this.setHealth(MAXHEALTH);
        else{
            this.setHealth(this.getHealth() + HEALHIMSELFSHAMAN);
        }
    }
    @Override
    public void healTeammate(Hero hero) {
        if(hero.getHealth() + HEALTEAMMAITSHAMAN >= MAXHEALTH ) hero.setHealth(MAXHEALTH);
        else{
            hero.setHealth(hero.getHealth() + HEALTEAMMAITSHAMAN);
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
        return "Shaman{health=" + this.getHealth() + "}";
    }
}
