package dx.decorator;

public class LogPizzaDecorator implements PizzaMaker {

    private PizzaMaker pizzaMaker;

    public LogPizzaDecorator(PizzaMaker pizzaMaker) {
        this.pizzaMaker = pizzaMaker;
    }

    @Override
    public Pizza makePizza() {
        Pizza pizza = pizzaMaker.makePizza();

        System.out.println(pizza);

        return pizza;
    }
}
