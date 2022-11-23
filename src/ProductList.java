import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ProductList {
   private String name;
   private int cost;
   private int weight;
   private boolean bought = false;

   @Override
   public String toString() {
      return "ProductList{" +
              "name='" + name + '\'' +
              ", cost=" + cost +
              ", weight=" + weight +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      ProductList that = (ProductList) o;
      return cost == that.cost && weight == that.weight && Objects.equals(name, that.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, cost, weight);
   }

   public ProductList(String name, int cost, int weight) {
      this.name = name;
      this.cost = cost;
      this.weight = weight;
   }

   public String getName() {
      return name;
   }

   public int getCost() {
      return cost;
   }

   public int getWeight() {
      return weight;
   }

   public void setBought(boolean bought) {
      this.bought = bought;
   }
   public boolean isBought() {
      return bought;
   }
}
