package dev.andrea.housebuilder;

/**
 * Builder interface for constructing {@link House} instances step by step.
 * Declares chainable methods for each optional attribute and a
 * final {@code build()} method that returns the constructed product.
 */
public interface HouseBuilder {

    Object swimmingPool = null;
    public HouseBuilder garage(boolean garage);
    public HouseBuilder swimmingPool(boolean swimmingPool);
    public HouseBuilder fancyStatues(boolean fancyStatues);
    public HouseBuilder garden(boolean garden);
    public House build();
    
}
