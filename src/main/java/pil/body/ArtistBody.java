package pil.body;

import pil.body.basic_task.BasicTask;
import pil.Head;

public class ArtistBody extends Head implements BasicTask {
    private Head head;

    public ArtistBody(Head head) {
        this.head = head;
    }

    public void draw(){
        System.out.println("I'm drawing");
    }
    public void paint(){
        System.out.println("I'm painting");
    }

    @Override
    public void walk() {
        System.out.println("I'm walking");
    }

    @Override
    public void jump() {
        System.out.println("I'm jumping");
    }

    @Override
    public void awaitingOrders() {
        System.out.println("Awaiting any kind of order.");
    }

    @Override
    public void presentation() {
        System.out.println("I'm an artist robot");
    }
}
