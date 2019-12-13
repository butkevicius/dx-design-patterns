package dx.builder;

import java.time.LocalDateTime;
import java.util.Currency;

public class PricingBuilder {
    private double pricePerMinute;
    private double discount;
    private Currency currency;
    private LocalDateTime validUntil;

    public PricingBuilder(double pricePerMinute) {
        this.pricePerMinute = pricePerMinute;
    }

    public PricingBuilder withDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    public PricingBuilder withCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public PricingBuilder withValidUntil(LocalDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public Pricing build() {
        double pricePerHour = pricePerMinute;
        double pricePerDay = pricePerMinute;
        double pricePerWeek = pricePerMinute;
        double discount = 0;
        Currency currency = this.currency != null ? this.currency : Currency.getInstance("EUR");
        LocalDateTime validUntil = LocalDateTime.now();

        return new Pricing(pricePerMinute, pricePerHour, pricePerDay, pricePerWeek, discount, currency, validUntil);
    }
}
