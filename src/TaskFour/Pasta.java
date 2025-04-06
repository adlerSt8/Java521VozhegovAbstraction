package TaskFour;

public class Pasta extends Dish{
    public Pasta(String name, double price, String[] ingredients) {
        super(name, price, ingredients);
    }

    @Override
    public void prepare() {
        System.out.print("Готовим пасту \"" + name + "\". Варим макароны и добавляем: ");
        for (int i = 0; i < ingredients.length; i++) {
            System.out.print(ingredients[i]);
            if (i < ingredients.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}
