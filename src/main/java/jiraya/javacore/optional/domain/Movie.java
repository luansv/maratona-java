package jiraya.javacore.optional.domain;

public class Movie {
    private Integer id;
    private String title;
    private int yearReleased;

    public Movie(Integer id, String title, int yearReleased) {
        this.id = id;
        this.title = title;
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", yearReleased=" + yearReleased +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }
}
