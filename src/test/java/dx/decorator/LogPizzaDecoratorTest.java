package dx.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogPizzaDecoratorTest {

    @Test
    void makePizza() {
        PizzaMaker pizzaMaker = new LogPizzaDecorator(new JuniorPizzaMaker());

        pizzaMaker.makePizza();
    }
}
