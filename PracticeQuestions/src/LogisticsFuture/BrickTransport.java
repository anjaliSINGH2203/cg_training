// ======================= BrickTransport.java =======================
package LogisticsFuture;

/*
 * Brick transport implementation.
 */
public class BrickTransport extends GoodsTransport {
    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    public BrickTransport(String transportId, String transportDate, int transportRating,
                          float brickSize, int brickQuantity, float brickPrice) {
        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    public float getBrickSize() {
        return brickSize;
    }

    public void setBrickSize(float brickSize) {
        this.brickSize = brickSize;
    }

    public int getBrickQuantity() {
        return brickQuantity;
    }

    public void setBrickQuantity(int brickQuantity) {
        this.brickQuantity = brickQuantity;
    }

    public float getBrickPrice() {
        return brickPrice;
    }

    public void setBrickPrice(float brickPrice) {
        this.brickPrice = brickPrice;
    }

    @Override
    public String vehicleSelection() {
        if (brickQuantity < 300) return "Truck";
        else if (brickQuantity <= 500) return "Lorry";
        return "MonsterLorry";
    }

    @Override
    public float calculateTotalCharge() {
        float price = brickPrice * brickQuantity;

        // tax is 30%
        float tax = price * 0.30f;

        // discount based on rating (FIXED)
        float discountRate = 0.0f;
        if (getTransportRating() == 5) discountRate = 0.20f;          // 20%
        else if (getTransportRating() == 3 || getTransportRating() == 4) discountRate = 0.10f; // 10%

        float discount = price * discountRate;

        // vehicle cost
        String vType = vehicleSelection();
        float vPrice;
        if (vType.equalsIgnoreCase("Truck")) vPrice = 1000.0f;
        else if (vType.equalsIgnoreCase("Lorry")) vPrice = 1700.0f;
        else vPrice = 3000.0f;

        return (price + vPrice + tax) - discount;
    }
}
