package pil.body;

import pil.body.basic_task.BasicTask;
import pil.Head;

public class DomesticBody extends Head implements BasicTask {
    private Head head;

    public DomesticBody(Head head) {
        this.head = head;
    }

    public void cook(){
        System.out.println("I'm cooking!");
    }

    public void clean(){
        System.out.println("I'm cleaning!");
    }

    @Override
    public void walk() {
        System.out.println("I'm walking!");
    }

    @Override
    public void jump() {
        System.out.println("I'm jumping");
    }

    @Override
    public void awaitingOrders() {
        System.out.println("Awaiting domestic orders!");
    }

    @Override
    public void presentation() {
        System.out.println("I'm an domestic robot!");
    }
}
