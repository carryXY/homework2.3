import java.util.ArrayList;
import java.util.List;

public class Product {

    List<Ingredient> ingredientList = new ArrayList<>();
    private String name;

    public Product (String name,Ingredient... ingredients) {
        this.name = name;
        for(Ingredient i : ingredients) {
            ingredientList.add(i);
        }
    }

    @Override
    public String toString() {
        return "Product [ name = " + name + " ," +
                "ingredientList=" + ingredientList + "]" ;
    }

    public String getName() {
        return this.name;
    }

}
