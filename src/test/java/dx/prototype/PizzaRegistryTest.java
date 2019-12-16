package dx.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaRegistryTest {

    @Test
    void makePizza() {
        PizzaRegistry pizzaRegistry = new PizzaRegistry();

        Pizza pizza = pizzaRegistry.makePizza(PizzaRegistry.Type.THIN);

        assertTrue(pizza instanceof ThinCrestPizza);
    }
}
