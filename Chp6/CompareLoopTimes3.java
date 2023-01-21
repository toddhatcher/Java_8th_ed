
// Chp6 CompareLoopTimes

import java.time.*;

public class CompareLoopTimes3
{
    public static void main(String[] args)
    {
        int startTime, endTime;
        // added for testing
        int startTimeSecond, endTimeSecond;
        //
        final int REPEAT = 100_000;
        final int FACTOR = 1_000_000;
        LocalDateTime now;

        now = LocalDateTime.now();
        startTime = now.getNano();

        // added for testing
        startTimeSecond = now.getSecond();
        //
        for(int x = 0; x <= REPEAT; ++x)
        {
            for(int y = 0; y <= REPEAT; ++y);
        }

        now = LocalDateTime.now();
        endTime = now.getNano();

        // added for testing
        endTimeSecond = now.getSecond();
        //
        // Test nano
        System.out.println("endTime in nano is: " + endTime);

        // if test
        if(startTimeSecond != endTimeSecond)
        {
            // Add a billion to end time. then calculate
            endTime += 1_000_000_000;
            System.out.println("Time for loops starting from 0: " + 
            ((endTime - startTime) / FACTOR) + " milliseconds");
            System.out.println("If statement used. 1 second added.");
        }
        else
        {
            System.out.println("Time for loops starting from 0: " + 
            ((endTime - startTime) / FACTOR) + " milliseconds");
        }

        

        // test
        System.out.println("startTimeSecond is: " + startTimeSecond);
        System.out.println("endTimeSecond is: " + endTimeSecond);

        now = LocalDateTime.now();
        startTime = now.getNano();
         // added for testing
         startTimeSecond = now.getSecond();
         //

        for(int x = REPEAT; x >= 0; --x)
        {
            for(int y = REPEAT; y >= 0; --y);
        }

        now = LocalDateTime.now();
        endTime = now.getNano();

        // added for testing
        endTimeSecond = now.getSecond();
        //
        System.out.println("Time for loops ending with 0: " +
            ((endTime - startTime) / FACTOR) + " milliseconds");
        
        // test
        System.out.println("startTimeSecond is: " + startTimeSecond);
        System.out.println("endTimeSecond is: " + endTimeSecond);
    }
}