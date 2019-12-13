package dx.builder;

import org.junit.jupiter.api.Test;

import java.util.Currency;

import static org.junit.jupiter.api.Assertions.*;

class PricingBuilderTest {

    @Test
    void build() {
        Pricing pricing = new PricingBuilder(1.2).withCurrency(Currency.getInstance("USD")).build();

        System.out.println(pricing);
    }
}
