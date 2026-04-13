package composite.ex1.refacut;

public class Program {
    public static void main(String[] args) {
        Structura structura = new Structura("Meniu");

        Meniu meniu = new Meniu(structura, "Pizza Alexandra");

        Structura structuraBauturi = new Structura("Bauturi");
        Structura structuraMancare = new Structura("Mancare");
        structura.adaugaNod(structuraBauturi);
        structura.adaugaNod(structuraMancare);

        structuraBauturi.adaugaNod(new Produs("CocaCola", 10));
        structuraBauturi.adaugaNod(new Produs("Pepsi", 9));

        Structura structuraMancarePizza = new Structura("Pizza");
        Structura structuraMancareSupe = new Structura("Supe");
        structuraMancare.adaugaNod(structuraMancarePizza);
        structuraMancare.adaugaNod(structuraMancareSupe);

        structuraMancarePizza.adaugaNod(new Produs("Pizza Prosciuto", 40));
        structuraMancarePizza.adaugaNod(new Produs("Pizza Quatro Stagioni", 38));

        structuraMancareSupe.adaugaNod(new Produs("Supa crema de linte", 35));
        structuraMancareSupe.adaugaNod(new Produs("Supa crema de ciuperci", 36));

        System.out.println(meniu.getNumeRestaurant());
        System.out.println(structura.getInfo(""));
    }
}