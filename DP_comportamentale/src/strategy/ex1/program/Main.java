package strategy.ex1.program;

import strategy.ex1.implementare.MeniuRestaurant;
import strategy.ex1.implementare.ProdusDinMeniu;
import strategy.ex1.implementare.StrategieCaloriiMin;
import strategy.ex1.implementare.StrategieCarbohidratiMin;

public class Main {

    public static void main(String[] args) {
        ProdusDinMeniu prod1 = new ProdusDinMeniu("prod1", 750, 70);
        ProdusDinMeniu prod2 = new ProdusDinMeniu("prod2", 80, 50);
        ProdusDinMeniu prod3 = new ProdusDinMeniu("prod3", 100, 20);
        ProdusDinMeniu prod4 = new ProdusDinMeniu("prod4", 600, 100);

        MeniuRestaurant meniuRestaurant = new MeniuRestaurant();
        meniuRestaurant.addProdusDinMeniu(prod1);
        meniuRestaurant.addProdusDinMeniu(prod2);
        meniuRestaurant.addProdusDinMeniu(prod3);
        meniuRestaurant.addProdusDinMeniu(prod4);

        meniuRestaurant.setStrategieAlegere(new StrategieCaloriiMin());
        System.out.println("Produs cu calorii min: " + meniuRestaurant.alegereProdus() + "\n" );

        meniuRestaurant.setStrategieAlegere(new StrategieCarbohidratiMin());
        System.out.println("Produs cu carbohidrati min: " + meniuRestaurant.alegereProdus() + "\n" );

    }
}
