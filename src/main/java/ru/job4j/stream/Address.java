package ru.job4j.stream;

import java.util.Objects;

public class Address {

    private String city;

    private int home;

    private int apartment;

    public Address(String city, int home, int apartment) {
        this.city = city;
        this.home = home;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return home == address.home && apartment == address.apartment
                && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, home, apartment);
    }

    @Override
    public String toString() {
        return "Address{"
                + "city='" + city + '\''
                + ", home=" + home
                + ", apartment=" + apartment
                + '}';
    }
}
