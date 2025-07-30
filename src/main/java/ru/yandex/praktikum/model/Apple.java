package ru.yandex.praktikum.model;

import java.util.Objects;

import static ru.yandex.praktikum.model.constants.Colour.COLOUR_RED;
import static ru.yandex.praktikum.model.constants.Discount.DISCOUNT_FOR_ALL;
import static ru.yandex.praktikum.model.constants.Discount.DISCOUNT_FOR_RED_APPLE;

public class Apple extends ru.yandex.praktikum.model.Food {
    private final String colour;

    public Apple(Integer amount, Double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public Double getDiscount() {
        return Objects.equals(colour, COLOUR_RED) ?
                DISCOUNT_FOR_RED_APPLE : DISCOUNT_FOR_ALL;
    }
}