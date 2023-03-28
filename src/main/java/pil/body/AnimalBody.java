package pil.body;

import pil.Head;
import pil.body.basic_task.BasicTask;

public class AnimalBody extends Head implements BasicTask {
    private Head head;

    public AnimalBody(Head head) {
        this.head = head;
    }

    public void pursueBall(){
        System.out.println("I'm pursuing the ball");
    }


    @Override
    public void walk() {
        System.out.println("I'm walking with four legs!");
    }

    @Override
    public void jump() {
        System.out.println("I'm jumping much higher!");
    }

    @Override
    public void awaitingOrders() {
        System.out.println("Awaiting new orders!");
    }

    @Override
    public void presentation() {
        System.out.println("I'm an animal robot");
    }
}
