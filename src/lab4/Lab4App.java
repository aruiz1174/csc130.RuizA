package lab4;

import Stacks.StackFullException;

/**
 * <p>
 * Title: The Application Class
 * </p>
 * <p>
 * Description: Tests the ArrayStack class and its' subclasses
 * <p>
 * @author Scott Altman and Anibal Ruiz
 */
public class Lab4App {

	public static void main(String [] args) {
		DiscardPile discardPile = new DiscardPile();
		
		System.out.println("Display the cards in the pile");
		populate(discardPile);
		System.out.println(discardPile);
		
		Card[] removedCards;
		removedCards = discardPile.removeTopCards(new Card (20));
		
		System.out.println("Display the pile after Calling the removeCards");
		for (int i = 0; i < removedCards.length; i++) {
			System.out.println(removedCards[i]);
		}
		System.out.println();
		System.out.println("Display the contents of the discard pile to ensure that the appropriate cards have been removed");
		System.out.println(discardPile);
		
		discardPile.makeEmpty();
		populate(discardPile);
		removedCards = discardPile.removeTopCards(new Card (50));
		System.out.println("Display the cards whose references have been stored in the array");
		for (int i = 0; i < removedCards.length; i++) {
			System.out.println(removedCards[i]);
		}
		System.out.println();
		System.out.println("Display the contents of the discard pile to ensure that the appropriate cards have been removed");
		System.out.println(discardPile);
	}
	
	/**
	 * Populates the discardPile with given cards
	 */
	public static void populate(DiscardPile discardPile) throws StackFullException {
		discardPile.push(new Card(8));
		discardPile.push(new Card(32));
		discardPile.push(new Card(48));
		discardPile.push(new Card(2));
		discardPile.push(new Card(17));
		discardPile.push(new Card(20));
		discardPile.push(new Card(25));
		discardPile.push(new Card(50));
		discardPile.push(new Card(19));
		discardPile.push(new Card(41)); 
	}

}
