package jiraya.javacore.lambda.domain;

public class Artist {
    private String name;
    private int age;

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
