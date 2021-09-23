package Additionals;

public class Additional {
    private String additional;
    private double addPrice;

    protected void setAdditional(String additional) {
        this.additional = additional;
    }

    protected void setAddPrice(double addPrice) {
        this.addPrice = addPrice;
    }

    public String getAdditional() {
        return additional;
    }

    public double getAddPrice() {
        return addPrice;
    }
}
