package dev.andrea.housebuilder;

public interface HouseBuilder {

    public HouseBuilder garage(boolean garage);
    public HouseBuilder swimmingPool(boolean swimmingPool);
    public HouseBuilder fancyStatues(boolean fancyStatues);
    public HouseBuilder garden(boolean garden);
    public House build();
    
}
