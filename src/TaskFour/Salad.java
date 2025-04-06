package TaskFour;

public class Salad extends Dish{
    public Salad(String name, double price, String[] ingredients) {
        super(name, price, ingredients);
    }

    @Override
    public void prepare() {
        System.out.print("Готовим салат \"" + name + "\". Нарезаем ингредиенты: ");
        for (int i = 0; i < ingredients.length; i++) {
            System.out.print(ingredients[i]);
            if (i < ingredients.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}
