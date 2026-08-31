package dev.andrea.housebuilder;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ConcreteHouseBuilderTest {

    @Test
    void shouldBuildHouseWithGarageAndGarden() {
        HouseBuilder builder = new ConcreteHouseBuilder();
        House house = builder.garage(true).garden(true).build();

        assertThat(house.isGarage(), is(true));
        assertThat(house.isGarden(), is(true));
        assertThat(house.isSwimmingPool(), is(false));
        assertThat(house.isFancyStatues(), is(false));
    }

    @Test
    void shouldBuildEmptyHouseByDefault() {
        HouseBuilder builder = new ConcreteHouseBuilder();
        House house = builder.build();

        assertThat(house.isGarage(), is(false));
        assertThat(house.isGarden(), is(false));
        assertThat(house.isSwimmingPool(), is(false));
        assertThat(house.isFancyStatues(), is(false));
    }

    @Test
    void shouldBuildHouseWithAllAttributes() {
        HouseBuilder builder = new ConcreteHouseBuilder();
        House house = builder.garage(true).swimmingPool(true).fancyStatues(true).garden(true).build();

        assertThat(house.isGarage(), is(true));
        assertThat(house.isSwimmingPool(), is(true));
        assertThat(house.isFancyStatues(), is(true));
        assertThat(house.isGarden(), is(true));
    }

}