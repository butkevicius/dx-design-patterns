package dx.builder;

import java.time.LocalDateTime;
import java.util.Currency;

public class Pricing {
    private double pricePerMinute;
    private double pricePerHour;
    private double pricePerDay;
    private double pricePerWeek;
    private double discount;
    private Currency currency;
    private LocalDateTime validUntil;

    public Pricing(double pricePerMinute, double pricePerHour, double pricePerDay, double pricePerWeek, double discount, Currency currency, LocalDateTime validUntil) {
        this.pricePerMinute = pricePerMinute;
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.pricePerWeek = pricePerWeek;
        this.discount = discount;
        this.currency = currency;
        this.validUntil = validUntil;
    }

    public double getPricePerMinute() {
        return pricePerMinute;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public double getPricePerWeek() {
        return pricePerWeek;
    }

    public double getDiscount() {
        return discount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public LocalDateTime getValidUntil() {
        return validUntil;
    }

    @Override
    public String toString() {
        return "Pricing{" +
                "pricePerMinute=" + pricePerMinute +
                ", pricePerHour=" + pricePerHour +
                ", pricePerDay=" + pricePerDay +
                ", pricePerWeek=" + pricePerWeek +
                ", discount=" + discount +
                ", currency=" + currency +
                ", validUntil=" + validUntil +
                '}';
    }
}
