/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main {
    
    public static int GetEffectiveMonths( int numDays, int type) { 
        int months = numDays / 30;; 
        int extraDays = numDays % 3 ; 
        if ( (extraDays > 15) || ( extraDays > 9 && type != 2 ) ) 
        { 
            months = months + 1; 
        } 
        return months; 
    }
    
    public static void main( String[] args) 
    {
        int tokens; 
        Scanner scan = new Scanner( System.in ); 
        System.out.print("How many tokens were distributed today: "); 
        tokens = scan.nextInt(); 
        for( int executionCount = 0; executionCount < tokens; executionCount++ ) { 
            CalculateAndPrintInterest(); 
        }     
    }

    public static void CalculateAndPrintInterest( ) 
    { 
        double amount; 
        double rateofinterest = 0; 
        int days, months; 
        double interest; 
        int borrowerType; 
        Scanner scan = new Scanner( System.in ); 
        System.out.print("How much money are you landing: "); 
        amount = scan.nextDouble(); 
        System.out.print("what type of borrower is this: "); 
        borrowerType = scan.nextInt(); 
        System.out.print("How many days you are landing the money for: "); 
        days = scan.nextInt(); 
        if ( borrowerType == 1 ) 
        { 
            rateofinterest = 1.8; 
        } 
        else if ( borrowerType == 2 ) 
        { 
            rateofinterest = 1.2; 
        } 
        else if ( borrowerType == 3 ) 
        { 
            rateofinterest = 2.5; 
        } 
        else 
        {
            System.out.println("Sorry!! Wrong borrower type, please try again"); 
            System.exit(1); 
        }
        months = GetEffectiveMonths( days, borrowerType);
        interest = amount * rateofinterest * months / 100; 
        System.out.println("*********"); 
        System.out.print("Total interest due: "); 
        System.out.println(interest);
    }
}

