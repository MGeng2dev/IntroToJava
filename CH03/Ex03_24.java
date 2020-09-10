/** Game: pick a card
 *  Write a program that stimulates picking a card from a deck 
 *  of 52 cards. Your program should display the rank 
 *  (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and
 *  suit (Clubs, Diamonds, Hearts, Spades) of the card.
 *
 */ 
 
public class Ex03_24 {
   public static void main(String[] args) {
     // Generate random number for rank and suit
      int rank = 1 + (int)(Math.random() * 13);
      int suit = 1 + (int)(Math.random() * 4);
      
      // Start output statement
      System.out.print("The card you picked is ");
      
      // Display rank
      switch (rank) {
         case 1: System.out.print("Ace of "); 
            break;
         case 2: System.out.print("Two of "); 
            break;
         case 3: System.out.print("Three of "); 
            break;
         case 4: System.out.print("Four of "); 
            break;
         case 5: System.out.print("Five of "); 
            break;
         case 6: System.out.print("Six of "); 
            break;
         case 7: System.out.print("Seven of "); 
            break;
         case 8: System.out.print("Eight of "); 
            break;
         case 9: System.out.print("Nine of "); 
            break;
         case 10: System.out.print("Ten of "); 
            break;
         case 11: System.out.print("Jack of "); 
            break;
         case 12: System.out.print("Queen of "); 
            break;
         case 13: System.out.print("King of "); 
            break;
      }
      
      // Display suit
      switch (suit) {
         case 1: System.out.print("Clubs"); 
            break;
         case 2: System.out.print("Diamonds"); 
            break;
         case 3: System.out.print("Hearts"); 
            break;
         case 4: System.out.print("Spades"); 
            break;
      }
      
   }
}       
      
