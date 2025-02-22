package jiraya.javacore.jdbc.domain;

import java.util.Objects;

public class Author {
    private Integer id;
    private String name;


    public static final class authorBuilder {
        private Integer id;
        private String name;

        private authorBuilder() {
        }

        public static authorBuilder builder() {
            return new authorBuilder();
        }

        public authorBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public authorBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Author build() {
            Author author = new Author();
            author.id = this.id;
            author.name = this.name;
            return author;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id) && Objects.equals(name, author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
