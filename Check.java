//Megan Shapiro, mes628@lehigh.edu
//CSE7 Lab03

//This program determines the original cost of the check, the tip, and how much each person wishes to pay

import java.util.Scanner;       //import java scanner

class Check     //class called Check made 
{
    public static void main(String[] args)      //main method required
    {
        Scanner myScanner = new Scanner( System.in );       //declare scanner object and call Scanner constructor

        System.out.print("Enter the original cost of the check in the form xx.xx: ");       //asks user for cost of check
        double checkCost = myScanner.nextDouble();      //accepts user input

        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");    //asks user for tip
        double tipPercent = myScanner.nextDouble();
        tipPercent /= 100;                          //convert percent into decimal value

        System.out.print("Enter the number of people who went out to dinner: ");    //asks user for number of people
        int numPeople = myScanner.nextInt();

        double totalCost;       //varibale declarations
        double costPerPerson;  
        int dollar, dime, penny;   //whole dollar amount of cost  //for storing digits
                //to the right of the decimal point 
                //for the cost$ 
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        //get the whole amount, dropping decimal fraction
        dollar=(int)costPerPerson;
        //get dimes amount, e.g., 
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2 
        dime =(int)(costPerPerson * 10) % 10;
        penny =(int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollar + '.' + dime + penny);





    }
}

