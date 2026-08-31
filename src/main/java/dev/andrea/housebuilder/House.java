package dev.andrea.housebuilder;

public class House {

    private boolean garage;
    private boolean swimmingPool;
    private boolean fancyStatues;
    private boolean garden;

    public House() {
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public boolean isFancyStatues() {
        return fancyStatues;
    }

    public void setFancyStatues(boolean fancyStatues) {
        this.fancyStatues = fancyStatues;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

}
