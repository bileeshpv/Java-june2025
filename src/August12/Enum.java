package August12;


enum Laptop{Hp(1000), Dell(1500), Lenova(1200);


    Laptop(int price) {
        this.price = price;
    }

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enum {
    public static void main(String[] args) {

/* Laptop laptop=Laptop.Lenova;
        System.out.println(laptop.getPrice());
        laptop.setPrice(3000);
        System.out.println(laptop.getPrice());*/
        for (Laptop laptop : Laptop.values()) {
            System.out.println(laptop +":" + laptop.getPrice());
        }

    }
}