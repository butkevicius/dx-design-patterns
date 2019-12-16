package dx.decorator;

public class JuniorPizzaMaker implements PizzaMaker {
    @Override
    public Pizza makePizza() {
        return new Pizza("cheese");
    }
}
