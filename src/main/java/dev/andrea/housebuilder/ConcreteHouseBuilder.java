package dev.andrea.housebuilder;

/**
 * Concrete implementation of {@link HouseBuilder}.
 * Assembles a {@link House} instance internally, applying each
 * configuration step and returning the finished product via
 * {@code build()}.
 */
public class ConcreteHouseBuilder implements HouseBuilder {

    private final House house;

    public ConcreteHouseBuilder() {
        house = new House();
    }

    @Override
    public ConcreteHouseBuilder garage(boolean garage) {
        house.setGarage(garage);
        return this;
    }

    @Override

    public ConcreteHouseBuilder swimmingPool(boolean swimmingPool) {
        house.setSwimmingPool(swimmingPool);
        return this;
    }

    @Override

    public ConcreteHouseBuilder fancyStatues(boolean fancyStatues) {
        house.setFancyStatues(fancyStatues);
        return this;
    }

    @Override

    public ConcreteHouseBuilder garden(boolean garden) {
        house.setGarden(garden);
        return this;
    }

    @Override
    public House build() {
        return house;
    }

}
