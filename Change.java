
/**
 * Converts cents to quarters, dimes, and nickels, where the number of cents is between 0 and 75.
 * 
 * @author Terence
 * @version 9/7/2024
 */
public class Change {

    public String cashInCoins(int cents) {

        int q = cents/25; //quarters
        int d = (cents%25)/10; //dimes
        int n = (cents%10)/5; //nickels
        return q + " quarters, " + d + " dimes, and " + n + " nickels";
    }

}
