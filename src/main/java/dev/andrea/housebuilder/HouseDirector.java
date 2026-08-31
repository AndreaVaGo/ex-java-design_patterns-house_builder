package dev.andrea.housebuilder;

public class HouseDirector {

    private HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public House buildBasicHouse() {
        return builder.build();
    }

    public House buildLuxuryHouse() {
        return builder.garage(true).swimmingPool(true).fancyStatues(true).garden(true).build();
    }

    public House buildHouseWithGarageAndGarden() {
        return builder.garage(true).garden(true).build();
    }
}
