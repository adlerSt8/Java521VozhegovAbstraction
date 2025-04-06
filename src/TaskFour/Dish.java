package TaskFour;

public abstract class Dish {
    protected String name;
    protected double price;
    protected String[] ingredients;

    public Dish(String name, double price, String[] ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public abstract void prepare();
}
