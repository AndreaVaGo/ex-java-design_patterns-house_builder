package dev.andrea.housebuilder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class HouseDirectorTest {

    @Test
    void buildBasicHouse() {
        HouseBuilder builder = new ConcreteHouseBuilder();
        HouseDirector director = new HouseDirector(builder);
        House house = director.buildBasicHouse();

        assertThat(house.isGarage(), is(false));
        assertThat(house.isSwimmingPool(), is(false));
        assertThat(house.isFancyStatues(), is(false));
        assertThat(house.isGarden(), is(false));
    }

    @Test
    void shouldBuildHouseWithGarageAndGarden() {
        HouseBuilder builder = new ConcreteHouseBuilder();
        HouseDirector director = new HouseDirector(builder);
        House house = director.buildHouseWithGarageAndGarden();

        assertThat(house.isGarage(), is(true));
        assertThat(house.isSwimmingPool(), is(false));
        assertThat(house.isFancyStatues(), is(false));
        assertThat(house.isGarden(), is(true));
    }

    @Test
    void shouldBuildLuxuryHouse() {
        HouseBuilder builder = new ConcreteHouseBuilder();
        HouseDirector director = new HouseDirector(builder);
        House house = director.buildLuxuryHouse();

        assertThat(house.isGarage(), is(true));
        assertThat(house.isSwimmingPool(), is(true));
        assertThat(house.isFancyStatues(), is(true));
        assertThat(house.isGarden(), is(true));
    }
}
