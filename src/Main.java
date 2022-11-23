import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ProductList apple = new ProductList("Яблоко", 50, 2);
        ProductList cola = new ProductList("Кола", 150, 3);
        ProductList meat = new ProductList("Мясо", 200, 1);
        ProductList banan = new ProductList("Банан", 100, 5);
        ProductList cucumber = new ProductList("Огурец", 25, 5);
        ProductList potato = new ProductList("Картошка", 10, 10);
        Product product = new Product();
        product.addList(apple);
        product.addList(cola);
        product.addList(meat);
        product.addList(banan);
        product.addList(cucumber);

        System.out.println(product.getLists());

        HashMap<ProductList, Integer> products = new HashMap<>();
        ProductList recipe = new ProductList();
        products.put(banan, 2);
        products.put(apple,3);


// 1 вариант решения
        Recipes salat = new Recipes("Салат",recipe.getProducts());
        salat.addProducts(banan, 2);
        salat.addProducts(apple,3);
        recipe.addReception(salat);
        System.out.println(salat.getProducts().keySet());



// 2 вариант решения
        Set<Recipes>meaty = new HashSet<>();
        meaty.add(meat);
        meaty.add(cucumber);
        meaty.add(potato);
        System.out.println("Рецепт" + meaty);


// какой лучше и правильнее??








    }
}