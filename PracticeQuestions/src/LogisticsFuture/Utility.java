// ======================= Utility.java =======================
package LogisticsFuture;

/*
 * Utility class to parse input, validate ID and find object type.
 *
 * Expected input formats (example):
 * Brick:
 *   <id>:<date>:<rating>:BrickTransport:<brickSize>:<brickQuantity>:<brickPrice>
 *
 * Timber:
 *   <id>:<date>:<rating>:TimberTransport:<timberLength>:<timberRadius>:<timberType>:<timberPrice>
 */
public class Utility {

    public GoodsTransport parseDetails(String input) {
        if (input == null) return null;

        String[] data = input.split(":");
        if (data.length < 4) return null; // must have at least id, date, rating, type

        String transportId = data[0];
        String transportDate = data[1];

        int transportRating;
        try {
            transportRating = Integer.parseInt(data[2]);
        } catch (NumberFormatException e) {
            return null;
        }

        String transportType = data[3];

        if (transportType.equalsIgnoreCase("BrickTransport")) {
            // needs 7 fields total
            if (data.length != 7) return null;

            try {
                float brickSize = Float.parseFloat(data[4]);
                int brickQuantity = Integer.parseInt(data[5]);
                float brickPrice = Float.parseFloat(data[6]);

                return new BrickTransport(
                        transportId,
                        transportDate,
                        transportRating,
                        brickSize,
                        brickQuantity,
                        brickPrice
                );
            } catch (NumberFormatException e) {
                return null;
            }

        } else if (transportType.equalsIgnoreCase("TimberTransport")) {
            // needs 8 fields total
            if (data.length != 8) return null;

            try {
                float timberLength = Float.parseFloat(data[4]);
                float timberRadius = Float.parseFloat(data[5]);
                String timberType = data[6];
                float timberPrice = Float.parseFloat(data[7]);

                return new TimberTransport(
                        transportId,
                        transportDate,
                        transportRating,
                        timberLength,
                        timberRadius,
                        timberType,
                        timberPrice
                );
            } catch (NumberFormatException e) {
                return null;
            }

        } else {
            // invalid type
            return null;
        }
    }

    // FIXED: return true when valid, false when invalid
    public boolean validateTransportId(String transportId) {
        if (transportId == null) return false;
        return transportId.matches("^[RTS][0-9]{3}[A-Z]$");
    }

    public String findObjectType(GoodsTransport goodsTransport) {
        if (goodsTransport instanceof TimberTransport) return "TimberTransport";
        return "BrickTransport";
    }
}
