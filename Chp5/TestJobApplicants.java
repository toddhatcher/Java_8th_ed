
// TestJobApplicants.java

public class TestJobApplicants {
    public static void main(String[] args)
    {
        // instantiate several job applicant objects.
        JobApplicant applicant1 = new JobApplicant("Todd Hatcher", "3086606165", true, true, true, true);
        JobApplicant applicant2 = new JobApplicant("Bob Boberson", "3085555555", true, true, false, false);
        
        // pass job applicant object to method
       //Boolean approval1 = isApproved(applicant1);
       //Boolean approval2 = isApproved(applicant2);

        // Display appropriate message for each applicant. Approved or Denied.
        if(isApproved(applicant1))
        {
            // Applicant is approved!
            System.out.println("Applicant1 is approved. ");
        }
        else
        {
            // Applicant is denied.
            System.out.println("Applicant1 is denied.");
        }

        if(isApproved(applicant2))
        {
             // Applicant is approved!
             System.out.println("Applicant2 is approved. ");
        }
        else
        {
            // Applicant is denied.
            System.out.println("Applicant2 is denied.");
        }

    }

    // Method determines if they are qualified for an interview.
    public static Boolean isApproved(JobApplicant applicant) 
    {
        int countCorrect = 0;

       if(applicant.getYesWordProcessing() == true)
       {
           // Increment number correct
           countCorrect++;
       }
       
       if(applicant.getYesSpreadsheets() == true)
       {
           // Increment number correct
           countCorrect++;
       }

       if(applicant.getYesDatabases() == true)
       {
           // Increment number correct
           countCorrect++;
       }

       if(applicant.getYesGraphics() == true)
       {
           // Increment number correct
           countCorrect++;
       }

       // 3 out of 4 skills must match. 
       if(countCorrect >= 3)
       {
            // Applicant is qualified for an interview.
            return true;
       }
       else
       {   
           // Applicant is not qualified for an interview. 
           return false;
       }
    }
    

    
}