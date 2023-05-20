package day11.task2;

public class Paladin extends Hero implements Healer {

    public static final double HEALHIMSELFPALADIN = 25;
    public static final double HEALTEAMMAITPALADIN = 10;

    public Paladin(){
        this.setPhysDef(0.5);
        this.setMagicDef(0.8);
        this.setPhysAtt(15);
    }

    @Override
    public void healHimself() {
        if((this.getHealth() + HEALHIMSELFPALADIN) >= MAXHEALTH) this.setHealth(MAXHEALTH);
        else{
            this.setHealth(this.getHealth() + HEALHIMSELFPALADIN);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.getHealth() + HEALTEAMMAITPALADIN >= MAXHEALTH ) hero.setHealth(MAXHEALTH);
        else{
            hero.setHealth(hero.getHealth() + HEALTEAMMAITPALADIN);
        }
    }

    @Override
    public String toString(){
        return "Paladin{health=" + this.getHealth() + "}";
    }
}
