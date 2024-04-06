package dev.application;

import java.util.Objects;

public class Place {

    private String name;
    private int distance;

    public Place(String town, int distance){
        this.name = town;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return distance == place.distance && Objects.equals(name, place.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distance);
    }
}
