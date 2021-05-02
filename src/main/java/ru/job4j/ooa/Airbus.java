package ru.job4j.ooa;

public final class Airbus extends Aircraft{

    private static final int COUNT_ENGINE = 2;
    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCountEngine() {
        int ENGINE_FOR_A380;
        if (name.equals("A380")) {
           ENGINE_FOR_A380 = 4;
        } else {
            ENGINE_FOR_A380 = COUNT_ENGINE;
        }
            System.out.println("Количество двигателей равно: " + ENGINE_FOR_A380);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
