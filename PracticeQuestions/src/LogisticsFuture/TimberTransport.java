// ======================= TimberTransport.java =======================
package LogisticsFuture;

/*
 * Timber transport implementation.
 */
public class TimberTransport extends GoodsTransport {
    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice; // price per kilo (or per unit as per your spec)

    public TimberTransport(String transportId, String transportDate, int transportRating,
                           float timberLength, float timberRadius, String timberType, float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    public float getTimberLength() {
        return timberLength;
    }

    public void setTimberLength(float timberLength) {
        this.timberLength = timberLength;
    }

    public float getTimberRadius() {
        return timberRadius;
    }

    public void setTimberRadius(float timberRadius) {
        this.timberRadius = timberRadius;
    }

    public String getTimberType() {
        return timberType;
    }

    public void setTimberType(String timberType) {
        this.timberType = timberType;
    }

    // FIXED: correct return type and return value
    public float getTimberPrice() {
        return timberPrice;
    }

    // FIXED: correct param type and assignment
    public void setTimberPrice(float timberPrice) {
        this.timberPrice = timberPrice;
    }

    @Override
    public String vehicleSelection() {
        // You used area = 2*pi*r*L (lateral surface area) — keeping your intent,
        // but fixing pi value slightly. If your question expects 3.147f, replace Math.PI with 3.147f.
        float area = (float) (2 * Math.PI * timberRadius * timberLength);

        if (area < 250) return "Truck";
        else if (area <= 400) return "Lorry";
        return "MonsterLorry";
    }

    @Override
    public float calculateTotalCharge() {
        // FIXED: volume for cylinder = pi * r^2 * L
        float volume = (float) (Math.PI * timberRadius * timberRadius * timberLength);

        // premium/non-premium factor
        float timberTypeFactor = timberType.equalsIgnoreCase("Premium") ? 0.25f : 0.15f;

        float price = volume * timberPrice * timberTypeFactor;

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
