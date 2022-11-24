import java.lang.reflect.Array;
import java.util.*;

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

        // задание 3
        Set <Integer> numbers = new HashSet<Integer>(20);
        numbers.add(999);
        numbers.add(100);
        numbers.add(3);
        numbers.add(555);
        numbers.add(6);
        numbers.add(777);
        numbers.add(8);
        numbers.add(996);
        numbers.add(10);
        numbers.add(11);
        numbers.add(27);
        numbers.add(12);
        numbers.add(13);
        numbers.add(144);
        numbers.add(15);
        numbers.add(168);
        numbers.add(17);
        numbers.add(189);
        numbers.add(19);
        Integer[] arrayNumbers = numbers.toArray(new Integer[numbers.size()]);
        Random rndm = new Random();
        int rndmNumber = rndm.nextInt(numbers.size());
        numbers.removeIf(integer -> integer%2!=0);
        System.out.println(numbers.toString());











    }
}