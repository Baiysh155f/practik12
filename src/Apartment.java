public class Apartment {
    private String title;
    private int price;
    private String address;

    void setTitle(String title) {
        this.title = title;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getTitle() {
        return title;
    }

    int getPrice() {
            return price;
        }

    String getAddress() {
        return address;
    }

    public void getInfo() {
        System.out.printf("""
                %s
                %d
                %s\n""", title, price, address);

    }

     int peypermonth(int maxGet) {
        int pay = (int) price / maxGet;
        System.out.println("bul apartmentte " + maxGet + " student bar ");
        System.out.println("ar biri " + pay + "somdon berishet");
        return pay;
    }

}