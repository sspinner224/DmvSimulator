import java.util.Random;
//import java.util.Scanner;

public class dmvSimulator {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        Random randNum = new Random();
        
        int myRandNum = randNum.nextInt(200);
        myRandNum = myRandNum+1;

        int nextNum = myRandNum;

        System.out.println("Welcome to the DMV! Here is your number: " + myRandNum + "\nPlease wait until your number has been called :)");
        
        while(nextNum >= myRandNum || nextNum <= myRandNum) {
            
            nextNum++;
            if(nextNum == 201) {
                nextNum = 0;
                nextNum++;
            }

            System.out.println("Calling number: " + nextNum);

            if(nextNum == myRandNum) {
                System.out.println("Your number has been called!");
                System.out.println("We're sorry, we cannot accept this paperwork, please come back again tomorrow.");
                break;
            }

        }




    }   


}

