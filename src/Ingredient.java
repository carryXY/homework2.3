
public abstract class Ingredient {
    protected String name;
    protected Double price;
    protected String category;

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}

