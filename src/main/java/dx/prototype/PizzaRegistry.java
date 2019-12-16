package dx.prototype;

import java.util.HashMap;

public class PizzaRegistry {
    private HashMap<Type, Pizza> prototypes = new HashMap<>();

    public PizzaRegistry() {
        prototypes.put(Type.THIN, new ThinCrestPizza());
        prototypes.put(Type.THICK, new ThickCrestPizza());
    }

    Pizza makePizza(Type type) {
        return prototypes.get(type).clone();
    }

    enum Type {
        THIN, THICK
    }
}
