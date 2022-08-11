package ArrayList.ArrayListChallange;

public class Product {
    protected String name;

    public Product(String name) {
        this.setName(name);
    }

    public Product() {
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}

