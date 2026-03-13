package jiraya.javacore.poo.sobrecarga.domain;

public class Book {
    private String name;
    private int pages;
    private int year;
    private String genre;

    public Book(){

    }
    public void init(String name, int pages, int year, String genre){
        this.name = name;
        this.pages = pages;
        this.year = year;
        this.genre = genre;
    }

    public void printBook(){
        System.out.println("Título: " + this.name);
        System.out.println("Número de páginas: " + this.pages);
        System.out.println("Ano de lançamento: " + this.year);
        System.out.println("Gênero do livro: " + this.genre);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
