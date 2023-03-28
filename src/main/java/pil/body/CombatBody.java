package pil.body;

import pil.body.basic_task.BasicTask;
import pil.Head;

public abstract class CombatBody extends Head implements BasicTask {

    public void fight(){
        System.out.println("I'm fighting.");
    }

    public void retire(){
        System.out.println("Retiring.");
    }

    @Override
    public void walk() {
        System.out.println("I'm walking");
    }

    @Override
    public void jump() {
        System.out.println("I'm jumping");
    }
}
