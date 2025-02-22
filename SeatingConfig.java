import java.util.HashMap;
import java.util.Map;

public class SeatingConfig {
    private static Map<String, Integer> predefinedConfigs = new HashMap<>();
    private int seatingConfigID;
    private int venueID;
    private String eventType;

    // Predefine seating configurations
    static {
        predefinedConfigs.put("1_LivePerformance", 101);
    }

    // Retrieve SeatingConfigID based on venueID + eventType
    public static int getSeatingConfigID(int venueID, String eventType) {
        String key = venueID + "_" + eventType;
        return predefinedConfigs.getOrDefault(key, -1);
    }

    // Constructor
    public SeatingConfig(int venueID, String eventType) {
        this.venueID = venueID;
        this.eventType = eventType;
        this.seatingConfigID = getSeatingConfigID(venueID, eventType); // returns -1 if key doesn't exist
    }

    public int getSeatingConfigID() {
        return seatingConfigID;
    }
}
