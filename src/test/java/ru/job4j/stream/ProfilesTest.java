package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    @Test
    public void whenCollectClassA() {
        List<Profile> addresses = List.of(
                new Profile(new Address("Moscow", 23, 14)),
                new Profile(new Address("Tula", 3, 1)),
                new Profile(new Address("Nachodka", 2, 4)),
                new Profile(new Address("Tomsk", 25, 114)),
                new Profile(new Address("Kaluga", 7, 124))
        );
        Profiles prf = new Profiles();
        List<Address> rsl = prf.collect(addresses);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Moscow", 23, 14));
        expected.add(new Address("Tula", 3, 1));
        expected.add(new Address("Nachodka", 2, 4));
        expected.add(new Address("Tomsk", 25, 114));
        expected.add(new Address("Kaluga", 7, 124));
        assertThat(rsl, is(expected));
    }
}