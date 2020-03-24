/**
 * Author:liang;
 * Date:2020/3/24;
 * Time:15:06;
 * Package Name:PACKAGE_NAME;
 * 需求：
 *
 *
 *
 * 封装1_books.xml中对应的book数据
 */
public class Books {
    private String id;
    private String name;
    private double price;

    public Books(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Books() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
