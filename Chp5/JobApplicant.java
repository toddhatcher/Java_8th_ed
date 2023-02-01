//import com.sun.org.apache.xpath.internal.operations.Bool;

// Job Applicant.java

public class JobApplicant {
    // name
    private String name = "";
    // phone number
    private String phoneNumber = "3086606165";
    // bool word processing
    private boolean yesWordProcessing = false;
    // bool spreadsheets
    private boolean yesSpreadsheets = false;
    // bool databases
    private boolean yesDatabases = false;
    // bool graphics
    private boolean yesGraphics = false;


    // constructor that accepts all four bools and name and number
    JobApplicant(String aname, String phNumber, Boolean wordProcessing, Boolean spreadsheets, Boolean databases, Boolean graphics)
    {
        // assign incoming parameters to objects class fields
        name = aname;
        phoneNumber = phNumber;
        yesWordProcessing = wordProcessing;
        yesSpreadsheets = spreadsheets;
        yesDatabases = databases;
        yesGraphics = graphics;
    }

    // Get Methods for each field.
	public String getName()
	{
		return name;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public Boolean getYesWordProcessing()
    {
        return yesWordProcessing;
    }

    public Boolean getYesSpreadsheets()
    {
        return yesSpreadsheets;
    }

    public Boolean getYesDatabases()
    {
        return yesDatabases;
    }

    public Boolean getYesGraphics()
    {
        return yesGraphics;
    }
}