package labs_examples.Bali_InPerson_MarApr2020.Past.Day3_Wed_Mar_4.Enumeration;

public class EnumPractice {

    public static void main(String[] args) {

        Fruit fruit = Fruit.DRAGONFRUIT;
        Fruit fruit2 = Fruit.MANGOSTEEN;
        Fruit fruit3 = Fruit.SNAKEFRUIT;

        for (Fruit f : Fruit.values()){
            System.out.println("Fruit: " + f + ", ");

            if (f.getPrice() >= 1){
                System.out.print("$" + f.getPrice() + ", A little pricey, ");
            }else{
                System.out.print("$" + f.getPrice() + ", Affordable, ");
            }

            switch (f){
                case DRAGONFRUIT:
                    System.out.println("Very tasty");
                    continue;
                case MANGOSTEEN:
                    System.out.println("Extremely delicious");
                    continue;
                case SNAKEFRUIT:
                    System.out.println("Also very tasty");
                    continue;
                default:
                    System.out.println("Still good");
            }
        }
    }


}

enum Fruit {
    DRAGONFRUIT("magenta", "round", 5.50,45.5),
    MANGOSTEEN("dark red", "round", .55, 34.5),
    SNAKEFRUIT("brown", "weird shape",.50,  22.3);

    private String color;
    private String shape;
    private Double price;
    private Double weight;

    Fruit(String color, String shape, Double price, Double weight) {
        this.color = color;
        this.shape = shape;
        this.price = price;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
