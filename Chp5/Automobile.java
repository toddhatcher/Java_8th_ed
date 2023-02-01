
// Automobile.java

public class Automobile {
    
    // ID number
    private int automobileIDNumber;
    // Make1
    private String automobileMake;
    // Model
    private String automobileModel;
    // Color
    private String automobileColor;
    // year
    private int automobileYear;
    // milesPerGallon
    private int automobileRatedMPG;
    
    // Constructor that accepts arguments for each field value  
    Automobile(int autoID, String autoMake, String autoModel, String autoColor, int autoYear, int autoRMPG)
    {
        // Uses the set methods to assign the values
        setAutomobileIDNumber(autoID);
        setAutomobileMake(autoMake);
        setAutomobileModel(autoModel);
        setAutomobileColor(autoColor);
        setAutomobileYear(autoYear);
        setAutomobileRatedMPG(autoRMPG);
    }

    // Get and Set Methods for each field.
    public int getAutomobileIDNumber() {
        return automobileIDNumber;
    }

    public void setAutomobileIDNumber(int autoID) {
        if(autoID < 0 || autoID > 9999)
        {
            automobileIDNumber = 0;
        }
        else
        {
          automobileIDNumber = autoID;  
        }
    }

    public String getAutomobileMake() {
        return automobileMake;
    }

    public void setAutomobileMake(String autoMake) {
        automobileMake = autoMake;
    }

    public String getAutomobileModel() {
        return automobileModel;
    }

    public void setAutomobileModel(String autoModel) {
        automobileModel = autoModel;
    }

    public String getAutomobileColor() {
        return automobileColor;
    }

    public void setAutomobileColor(String autoColor) {
        automobileColor = autoColor;
    }

    public int getAutomobileYear() {
        return automobileYear;
    }

    public void setAutomobileYear(int autoYear) {
        if(autoYear < 2000 || autoYear > 2019)
        {
            automobileYear = 0;
        }
        else
        {
            automobileYear = autoYear;
        }
    }

    public int getAutomobileRatedMPG() {
        return automobileRatedMPG;
    }

    public void setAutomobileRatedMPG(int autoRMPG) {
        if(autoRMPG < 10 || autoRMPG > 60)
        {
            automobileRatedMPG = 0;
        }
        else
        {
            automobileRatedMPG = autoRMPG;
        }
    }
}