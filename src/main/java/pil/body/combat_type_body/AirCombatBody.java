package pil.body.combat_type_body;

import pil.Head;
import pil.body.CombatBody;

public class AirCombatBody extends CombatBody {

    private Head head;

    public void fly(){
        System.out.println("I'm flying");
    }

    @Override
    public void awaitingOrders() {
        System.out.println("Awaiting combat orders.");
    }

    @Override
    public void presentation() {
        System.out.println("I'm an air combat robot.");
    }

    public AirCombatBody(Head head) {
        this.head = head;
    }
}
