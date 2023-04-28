import java.util.Scanner;
class Main {   
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_GALLON = 4;
      int quartsNeeded = 18;
      int gallonsNeeded;
      int extraQuartsNeeded;
      Scanner input = new Scanner(System.in);
      boolean check=true;
while(check){
           System.out.print("Enter quarts needed >> ");
  
     try{
                quartsNeeded = input.nextInt();
         gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
         extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
         System.out.println("A job that needs " + quartsNeeded +
            " quarts requires " + gallonsNeeded + " gallons plus " +
            extraQuartsNeeded + " quarts.");
         check=false;
       }

    catch(Exception error){
          System.out.println("Please try again, I couldn't quite make out the number you entered");
      input.nextLine();

    }

  

       

     }
   }
}
