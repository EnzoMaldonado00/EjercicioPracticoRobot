package pil.body.combat_type_body;

import pil.Head;
import pil.body.CombatBody;

public class TerrestrialCombatBody extends CombatBody {
    private Head head;

    public TerrestrialCombatBody(Head head) {
        this.head = head;
    }

    public void dig(){
        System.out.println("I'm digging a hole.");
    }

    @Override
    public void awaitingOrders() {
        System.out.println("Awaiting combat orders.");
    }

    @Override
    public void presentation() {
        System.out.println("I'm an terrestrial combat robot.");
    }
}
