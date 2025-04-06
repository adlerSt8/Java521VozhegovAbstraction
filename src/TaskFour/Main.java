package TaskFour;

public class Main {
    public static void main(String[] args) {
        String[] saladIngredients = {"помидоры", "огурцы", "фета", "маслины", "оливковое масло"};
        String[] pastaIngredients = {"спагетти", "бекон", "сливки", "сыр", "яйцо"};
        String[] cappuccinoIngredients = {"эспрессо", "молоко", "молочная пена"};

        Dish salad = new Salad("Греческий салат", 350.0, saladIngredients);
        Dish pasta = new Pasta("Карбонара", 450.0, pastaIngredients);
        Dish cappuccino = new Drink("Капуччино", 350.0, cappuccinoIngredients);

        salad.prepare();
        pasta.prepare();
        cappuccino.prepare();
    }
}
