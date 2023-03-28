package pil;

import pil.body.AnimalBody;
import pil.body.ArtistBody;
import pil.body.DomesticBody;
import pil.body.combat_type_body.AirCombatBody;
import pil.body.combat_type_body.AquaticCombatBody;
import pil.body.combat_type_body.TerrestrialCombatBody;

public class Main {
    public static void main(String[] args) {

        Head head = new Head();
        head.setHeadSize("20cm");
        head.setHeadAge("5 years");

        AirCombatBody airCombatBody = new AirCombatBody(head);
        airCombatBody.presentation();
        airCombatBody.awaitingOrders();
        airCombatBody.jump();
        airCombatBody.fly();

        System.out.println("\n");

        AquaticCombatBody aquaticCombatBody = new AquaticCombatBody(head);
        aquaticCombatBody.presentation();
        aquaticCombatBody.awaitingOrders();
        aquaticCombatBody.fight();
        aquaticCombatBody.swim();
        aquaticCombatBody.retire();

        System.out.println("\n");

        DomesticBody domesticBody = new DomesticBody(head);
        domesticBody.presentation();
        domesticBody.walk();
        domesticBody.clean();
        domesticBody.cook();

        System.out.println("\n");

        AnimalBody animalBody = new AnimalBody(head);
        animalBody.presentation();
        animalBody.jump();
        animalBody.pursueBall();

        System.out.println("\n");

        TerrestrialCombatBody terrestrialCombatBody = new TerrestrialCombatBody(head);
        terrestrialCombatBody.presentation();
        terrestrialCombatBody.jump();
        terrestrialCombatBody.dig();
        terrestrialCombatBody.retire();

        System.out.println("\n");

        ArtistBody artistBody = new ArtistBody(head);
        artistBody.presentation();
        artistBody.draw();
        artistBody.walk();
        artistBody.paint();
    }
}
