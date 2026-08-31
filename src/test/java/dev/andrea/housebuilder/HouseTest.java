package dev.andrea.housebuilder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class HouseTest {

    @Test
    void shouldHaveGarage() {
        House house = new House();
        house.setGarage(true);
        assertThat(house.isGarage(), is(true));
    }

    @Test
    void shouldHaveSwimmingPool() {
        House house = new House();
        house.setSwimmingPool(true);
        assertThat(house.isSwimmingPool(), is(true));
    }

    @Test
    void shouldHaveFancyStatues() {
        House house = new House();
        house.setFancyStatues(true);
        assertThat(house.isFancyStatues(), is(true));
    }

    @Test
    void shouldHaveGarden() {
        House house = new House();
        house.setGarden(true);
        assertThat(house.isGarden(), is(true));
    }

}
