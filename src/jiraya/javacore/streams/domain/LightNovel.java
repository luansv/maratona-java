package jiraya.javacore.streams.domain;

import java.util.Objects;

public class LightNovel {
    private String title;
    private Double price;
    private Category category;

    public LightNovel(String title, Double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public LightNovel(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
