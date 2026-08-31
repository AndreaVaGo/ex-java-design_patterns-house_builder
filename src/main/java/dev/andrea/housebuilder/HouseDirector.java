package dev.andrea.housebuilder;

public class HouseDirector {
    

    private HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public House buildBasicHouse(){
        return builder.build();
    }
    
}
