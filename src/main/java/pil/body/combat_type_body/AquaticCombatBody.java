package pil.body.combat_type_body;

import pil.Head;
import pil.body.CombatBody;

public class AquaticCombatBody extends CombatBody {
    private Head head;

    public AquaticCombatBody(Head head) {
        this.head = head;
    }

    public void swim(){
        System.out.println("I'm swiming");
    }

    @Override
    public void awaitingOrders() {
        System.out.println("Awaiting combat orders.");
    }

    @Override
    public void presentation() {
        System.out.println("I'm an aquatic combat robot.");
    }
}
