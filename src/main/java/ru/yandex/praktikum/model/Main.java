package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.service.ShoppingCart;

import static ru.yandex.praktikum.model.constants.Colour.COLOUR_GREEN;
import static ru.yandex.praktikum.model.constants.Colour.COLOUR_RED;

public class Main {
    public static void main(String[] args) {
        ru.yandex.praktikum.model.Food meat = new Meat(5, 100.0);
        ru.yandex.praktikum.model.Food redApple = new Apple(10, 50.0, COLOUR_RED);
        ru.yandex.praktikum.model.Food greenApple = new Apple(8, 60.0, COLOUR_GREEN);

        ru.yandex.praktikum.model.Food[] foods = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(foods);
        print(String.format("Сумма товаров без скидки: %s", shoppingCart.getTotalWithoutDiscount()));
        print(String.format("Сумма товаров со скидкой: %s", shoppingCart.getTotalWithDiscount()));
        print(String.format("Сумма вегетарианских товаров без скидки: %s",
                shoppingCart.getTotalVegetariansWithoutDiscount()));
    }

    private static void print(String string) {
        System.out.println(string);
    }
}