import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SeatingConfig implements ISeatingConfig {
    private static Map<String, Integer> predefinedConfigs = new HashMap<>();
    private int seatingConfigID;
    private int venueID;
    private String eventType;
    private ArrayList<Section> sections;

    // Predefine seating configurations
    static {
        predefinedConfigs.put("1_LivePerformance", 101);
        predefinedConfigs.put("1_Film", 102);
        predefinedConfigs.put("2_Conference", 201);
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
        this.sections = generateSeatingLayout(seatingConfigID);
    }

    // Generate Sections for an Event
    private ArrayList<Section> generateSeatingLayout(int seatingConfigID) {
        ArrayList<Section> sections = new ArrayList<>();

        if (seatingConfigID == 101) { // Live Performance
            sections.add(new Section("Stalls", 10, 20, 50.0f));
            sections.add(new Section("Balcony", 5, 15, 75.0f));
        }
        else if (seatingConfigID == 102) { // Film in Main Hall
            sections.add(new Section("Stalls", 12, 18, 30.0f));
        }
        else if (seatingConfigID == 201) { // Conference in Small Hall
            sections.add(new Section("Conference Room", 5, 10, 20.0f));
        }

        return sections;
    }

    // Get sections for given seatingConfigID
    @Override
    public ArrayList<Section> getSections(int seatingConfigID) {
        return sections;
    }

    // Get the SeatingConfig Object
    @Override
    public SeatingConfig getSeatingConfiguration(int seatingConfigID) {
        return this;
    }

}
