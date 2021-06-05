package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .sorted((x, y) -> x.getAddress().compareTo(y.getAddress()))
                .distinct()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }
}
