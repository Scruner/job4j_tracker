package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Item missing");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"1", "2", "3", "4", "5"};
        try {
            indexOf(value, "3");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
