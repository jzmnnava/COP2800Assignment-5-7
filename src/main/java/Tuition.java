//This program computes the tuition in 10 years
//This program computes the total cost of 4 years' woth of tuition after the 10th year

public class Tuition {
  public static void main(String[] args) {

//Accumulation total cost of 4 years
    double totalCost = 0;
    double tuition = 10000; 
    double tuitionTenthYear = 0;

//for loop
    for (int year = 1; year <= 14; year++) {
      // tuition increase 5% every year
      tuition += (tuition * 0.05);

    //after 10 years
      if (year>10)
      totalCost += tuition;

    //tuition cost for 10 years
      if (year == 10)
      tuitionTenthYear = tuition;
    }

//print the cost of tuition in 10 years
    System.out.printf("Tuition in ten years: $%.2f%n", tuitionTenthYear);

//print the cost of 4 years' worth after the tenth year 
    System.out.printf("Total cost for four years' worth of tuition after the tenth year: $%.2f%n", totalCost);
  }  
}