package cn.ponytech.shop.order.pojo;

public class Item {
    Long id;
    String title;
    String pic;
    String desc;
    Long price;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    String port;

    public Item() {

    }
    public Item(Long id, String title, String pic, String desc, Long price, String port) {
        this.id = id;
        this.title = title;
        this.pic = pic;
        this.desc = desc;
        this.price = price;
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pic='" + pic + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", from port}" + port;
    }
}
