package jiraya.javacore.streams.domain;

public class LightNovel {
    private String title;
    private Double price;

    public LightNovel(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }
}
