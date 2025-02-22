package jiraya.javacore.collection.domain;

import java.util.Objects;


public class Artists implements Comparable<Artists>{
    private Long id;
    private String name;
    private Double streams;
    private int yearBirth;

    public Artists(Long id, String name, Double streams) {
        Objects.requireNonNull(id);
        this.id = id;
        this.name = name;
        this.streams = streams;
    }

    public Artists(Long id, String name, Double streams, int yearBirth) {
        this(id, name, streams);
        this.yearBirth = yearBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getStreams() {
        return streams;
    }

    public void setStreams(Double streams) {
        this.streams = streams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artists artists = (Artists) o;
        return Objects.equals(id, artists.id) && Objects.equals(name, artists.name) && Objects.equals(streams, artists.streams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Artists{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", streams=" + streams +
                ", yearBirth=" + yearBirth +
                '}';
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    @Override
    public int compareTo(Artists otherArtists) {
        //negativo se o this < outroArtista
        // se this == outroArtista, return 0
        // positivo se this> OutroArtista
        if (this.id < otherArtists.getId()){
            return -1;
        }else if (this.id == otherArtists.getId()){
            return 0;
        } else if (this.getId() > otherArtists.getId()){
            return 1;
        }
        return 0;


       // return this.name.compareTo(otherArtists.getName());
        // return thid.id




    }
}
