import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static List<Product> menuItems = new ArrayList<>();

    public static void main(String[] args) {
        Menu myMenu = new Menu();
        myMenu.addProduct(new Product("Prod1",new Zahar(10d, "food"),
                new Cola(5d, "drink")));

        myMenu.display();
    }

    public void addProduct(Product p) {
        menuItems.add(p);
    }

    public void display() {
        for(Product p : menuItems) {
            System.out.println(p);
        }
    }
}