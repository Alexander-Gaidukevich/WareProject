package main;

import beans.Jacket;
import beans.Pant;

/*
 1.Создать класс фабрика beans.Factory с полем Name,стоимость (класс фактори абстрактный)
 2. Создать потомки Штаны, Кофта.
 3. Для каждого класса реализовать переменные, для штаны - материал=хлопок, кофта = синтетика.
 4. Создать в классе фактории абстрактный метод для подсчета стоимости со скидками для штаны, скидка 10%, для кофта 20%
*/
public class Runner {

    public static void main(String[] args) {
        Pant pant = new Pant("Шелк", 250);
        System.out.println("Стоимость штанов со кидкой 10% = " + pant.getDoubleCost() + " руб");

        Jacket jacket = new Jacket("Синтетика", 330);
        System.out.println("Стоимость кофты со скидкой 20% = " + jacket.getDoubleCost() + " руб");

    }
}
