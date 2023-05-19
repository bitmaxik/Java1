package day11.task2;

public class Paladin extends Hero implements Healer {

    public Paladin(){
        this.setPhysDef(0.5);
        this.setMagicDef(0.8);
        this.setPhysAtt(15);
    }

    @Override
    public void healHimself() {
        if((this.getHealth() + 25) >= 100) this.setHealth(MAXHEALTH);
        else{
            this.setHealth(this.getHealth() + 25);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.getHealth() >= hero.getHealth() + 10) hero.setHealth(MAXHEALTH);
        else{
            hero.setHealth(hero.getHealth() + 10);
        }
    }

    @Override
    public String toString(){
        return "Paladin{health=" + this.getHealth() + "}";
    }
}
