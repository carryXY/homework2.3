import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static List<Product> menuItems = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void addProduct(Product p) {
        menuItems.add(p);
    }
}