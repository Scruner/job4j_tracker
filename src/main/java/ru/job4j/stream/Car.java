package ru.job4j.stream;

public class Car {

    private String brand;
    private String series;
    private int yearIssue;
    private String color;
    private String fuel;
    private byte numberDoors;
    private boolean sndHandOrNew;

    @Override
    public String toString() {
        return "Car{"
                + "brand='"
                + brand
                + '\''
                + ", series='"
                + series
                + '\''
                + ", yearIssue="
                + yearIssue
                + ", color='"
                + color
                + '\''
                + ", fuel='"
                + fuel
                + '\''
                + ", numberDoors="
                + numberDoors
                + ", sndHandOrNew="
                + sndHandOrNew
                + '}';
    }

    static class Builder {

        private String brand;
        private String series;
        private int yearIssue;
        private String color;
        private String fuel;
        private byte numberDoors;
        private boolean sndHandOrNew;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildSeries(String series) {
            this.series = series;
            return this;
        }

        Builder buildYearIssue(int yearIssue) {
            this.yearIssue = yearIssue;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Builder buildFuel(String fuel) {
            this.fuel = fuel;
            return this;
        }

        Builder buildNumberDoors(byte numberDoors) {
            this.numberDoors = numberDoors;
            return this;
        }

        Builder buildSndHandOrNew(boolean sndHandOrNew) {
            this.sndHandOrNew = sndHandOrNew;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.brand = brand;
            car.series = series;
            car.yearIssue = yearIssue;
            car.color = color;
            car.fuel = fuel;
            car.numberDoors = numberDoors;
            car.sndHandOrNew = sndHandOrNew;
            return car;
        }
    }

    public static void main(String[] args) {
        Car car = new Builder().buildBrand("Toyota")
                .buildSeries("Land Cruiser")
                .buildYearIssue(2021)
                .buildColor("black")
                .buildFuel("disel")
                .buildNumberDoors((byte) 5)
                .buildSndHandOrNew(true)
                .build();
        System.out.println(car);
    }
}
