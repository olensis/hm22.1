public class Main {
    public static void main(String[] args) {
        ProductList apple = new ProductList("Яблоко", 50, 2);
        ProductList cola = new ProductList("Кола", 150, 3);
        ProductList meat = new ProductList("Мясо", 200, 1);
        ProductList banan = new ProductList("Банан", 100, 5);
        Product product = new Product();
        product.addList(apple);
        product.addList(cola);
        product.addList(meat);
        product.addList(banan);

        System.out.println(product.getLists());




    }
}