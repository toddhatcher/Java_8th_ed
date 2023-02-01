// Write an interactive Java payroll application that calculates the net pay for a factory
// worker. The program prompts the user for skill level and hours worked, as well as
// appropriate insurance and retirement options for the employee’s skill level category.
// The application displays: (1) the hours worked, (2) the hourly pay rate, (3) the regular
// pay for 40 hours, (4) the overtime pay, (5) the total of regular and overtime pay, and
// (6) the total itemized deductions. If the deductions exceed the gross pay, display an
// error message; otherwise, calculate and display (7) the net pay after all the deductions
// have been subtracted from the gross. Save the file as Pay.java

import java.util.Scanner;

public class Pay {

        public static final double SKILL_LEVEL_1_PAY = 17.00;
        public static final double SKILL_LEVEL_2_PAY = 20.00;
        public static final double SKILL_LEVEL_3_PAY = 22.00;

        public static final double INSURANCE_COST_MEDICAL = 32.50;
        public static final double INSURANCE_COST_DENTAL = 20.00;
        public static final double INSURANCE_COST_LONG_TERM_DISABILITY = 10.00;

        public static double electedWeeklyMedicalInsurance = 0.00;
        public static double electedWeeklyDentalInsurance = 0.00;
        public static double electedWeeklyLongtermDisabilityInsurance = 0.00;

        public static double electedWeeklyRetirementOption = 0.00;

        public static void main(String[] args)
        { 
            Scanner keyboard = new Scanner(System.in);
            
            int skillLevel = 0;
            double hoursWorked = 0.00;
            double hoursOver40 = 0.00;
            double payRate = 0.00;
            double regularPayTo40 = 0.00;
            double overtimePayAbove40 = 0.00;
            double overtimeRate = 0.00;
            double grossPay = 0.00;
            double electedDeductionsTotal = 0.00;
            double electedRetirementCost = 0.00;
            double netPay = 0.00;

            // ********* Program Begins ********

            // Ask user for hours workerd.
            System.out.println("Please enter your hours worked this week. >");
            hoursWorked = keyboard.nextDouble();

            // Ask user for skill level.
            System.out.println("Please enter your Skill Level. 1, 2, or 3. >");
            skillLevel = keyboard.nextInt();

            // close keyboard
            //keyboard.close();

            // Dependong on user skill level of 1, 2, or 3, set the pay rate. 
            if(skillLevel == 1)
            {
                payRate = SKILL_LEVEL_1_PAY;
            }
            else if (skillLevel == 2)
            {
                payRate = SKILL_LEVEL_2_PAY;
                // Show Insurance Options
                showInsuranceOptions();
            }
            else if (skillLevel == 3)
            {
                payRate = SKILL_LEVEL_3_PAY;
                // Show Insurance Options and Retirement Option
                showInsuranceOptions();
                showRetirementOptions();
            }
            else
            {
                System.out.println("Error on skill level. payRate = 0.00");
                payRate = 0.00;
            }

           

            // ******** Calculate ********

                // Hours worked and hourly pay rate set by user.  #1 & #2

                // Regular Pay on hours up to 40.00 #3

                // Check if any overtime.
                if(hoursWorked > 40.00)
                {
                    hoursOver40 = hoursWorked - 40.00;
                    regularPayTo40 = payRate * 40.00;
                }
                else if(hoursWorked <= 40.00)
                {
                    regularPayTo40 = payRate * hoursWorked;
                }

                
                // Set overtime rate @ pay rate plus a half.
                overtimeRate = payRate * 1.50;
                // Overtime Pay on hours over 40.00 #4
                overtimePayAbove40 = overtimeRate * hoursOver40;

                // Total of regular pay and overtime pay - AKA Gross Pay #5
                grossPay = regularPayTo40 + overtimePayAbove40;

                // Calculate retirment option cost
                electedRetirementCost = grossPay * electedWeeklyRetirementOption;

                // Total of itemized deductions  #6
                electedDeductionsTotal = electedWeeklyMedicalInsurance + 
                    electedWeeklyDentalInsurance + electedWeeklyLongtermDisabilityInsurance + 
                    electedRetirementCost;
                    // Error if deductions exceed gross pay.
                if(electedDeductionsTotal > grossPay)
                {
                    System.out.println("Error. Deductions are greater than gross pay.");
                }
                // Net Pay which is gross pay with deductions subtracted. #7
                else if(electedDeductionsTotal < grossPay)
                {
                    netPay = grossPay - electedDeductionsTotal;
                }


            // ***** Display *****
            
                // #1 Hours Worked
                System.out.println("You worked: " + hoursWorked + " hours this week.");
                // #2 Hourly Pay Rate
                System.out.println("Your pay rate is: $" + payRate + " per hour.");
                // #3 Pay amount on 40 hours
                System.out.println("Your standard pay up to 40 hours is $" + regularPayTo40);
                // #4 Pay amount on amount over 40 hours @ 1.5x
                System.out.println("Your overtime pay on hours over 40 is $" + overtimePayAbove40);
                // #5 Total of both regular and overtime pay. AKA Gross Pay.
                System.out.println("Your total of both regular and overtime pay is $" + grossPay);
                // #6 Total of itemized deductions
                System.out.println("The cost of your elected health insurance this week: $" + electedWeeklyMedicalInsurance);
                System.out.println("The cost of your elected dental insurance this week: $" + electedWeeklyDentalInsurance);
                System.out.println("The cost of your elected Long-term disability insurance this week: $" + electedWeeklyLongtermDisabilityInsurance);
                System.out.println("The cost of your elected retirment option this week: $" + electedRetirementCost);
                System.out.println("The total cost of your elected options this week: $" + electedDeductionsTotal);
                // #7 Net pay after deductions have been subtracted from gross.
               System.out.println("Your net pay after all deductions have been taken out is $" + netPay);

        }

        // Show InsuranceOptions method and set elected costs
        public static void showInsuranceOptions()
        {
            Scanner keyboard = new Scanner(System.in);
            // set to No by default.
            char medicalInsuranceYorN = 'n';
            char dentalInsuranceYorN = 'n';
            char longtermDisabilityYorN = 'n';
            
            // Ask user for options and store answer.
            System.out.println("Would you like Medical insurance for a weekly cost of $" +
                 INSURANCE_COST_MEDICAL + " per week? Y or N: ");
                 medicalInsuranceYorN = keyboard.next().charAt(0);
            
            System.out.println("Would you like Dental insurance for a weekly cost of $" +
                INSURANCE_COST_DENTAL + " per week? Y or N: ");
                dentalInsuranceYorN = keyboard.next().charAt(0);

            System.out.println("Would you like Long-term disability insurance for a weekly cost of $" +
                INSURANCE_COST_LONG_TERM_DISABILITY + " per week? Y or N: ");
                longtermDisabilityYorN = keyboard.next().charAt(0);

            // Close YorN
            //YorN.close();

            // Check for Yes and set elected cost if Yes.
            if(medicalInsuranceYorN == 'y' || medicalInsuranceYorN == 'Y' )
            {
                electedWeeklyMedicalInsurance = INSURANCE_COST_MEDICAL;
            }

            if(dentalInsuranceYorN == 'y' || dentalInsuranceYorN == 'Y')
            {
                electedWeeklyDentalInsurance = INSURANCE_COST_DENTAL;
            }

            if(longtermDisabilityYorN == 'y' || longtermDisabilityYorN == 'Y')
            {
                electedWeeklyLongtermDisabilityInsurance = INSURANCE_COST_LONG_TERM_DISABILITY;
            }
        }

        // Show retirement options and set percentage of cost
        public static void showRetirementOptions()
        {
            Scanner keyboard = new Scanner(System.in);
            //int testInt = 0;
            char retirementOptionYorN = 'n';

            // Ask user for option and store answer.
            System.out.println("Would you like to participate in our retirement plan for 3% of your gross pay? Y or N: ");
            retirementOptionYorN = keyboard.next().charAt(0);
            //testInt = keyboard.nextInt();

            // Close YorN
            //keyboard2.close();

            //System.out.println("Test int is: " + testInt);
            //System.out.println("Test Char is: " + retirementOptionYorN);

            // Check for Yes and set elected cost.
            if(retirementOptionYorN == 'y' || retirementOptionYorN == 'Y');
            {
                electedWeeklyRetirementOption = .03;
            }
        }
}