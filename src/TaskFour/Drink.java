package TaskFour;

public class Drink extends Dish{
    public Drink(String name, double price, String[] ingredients) {
        super(name, price, ingredients);
    }

    @Override
    public void prepare() {
        System.out.print("Готовим напиток \"" + name + "\". Смешиваем: ");
        for (int i = 0; i < ingredients.length; i++) {
            System.out.print(ingredients[i]);
            if (i < ingredients.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(". Подаём горячим.");
    }
}
