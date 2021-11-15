package lab4;

import Stacks.ArrayStack;
import Stacks.StackEmptyException;
import Stacks.StackFullException;

/**
* <b>Title:DiscardPile Class</b> :<br>
* <b>Date Written:</b> October 3, 2019<br>
* <b>Due Date:</b> October 5, 2019<br>
* <p>
* <b>Description:</b><br>
* Object type to develop a Discard Pile of Cards, and allow examination of that pile.
*@author Scott Altman and Anibal Ruiz
*/
public class DiscardPile extends ArrayStack<Card>{

	/*
	* This method will create a DiscardPile object, which is an array stack with 
	* size 52
	*/ 
	public DiscardPile() {
		super(52);
	}
	
	/*
	 * This method will return the location of theCard in the Stack, when 
	 * the top card is at location 0 and the bottom card is at numItems-1, or -1 if 
	 * theCard is not in the Stack. The top Card is at location 0.
	 * @param theCard the Card to search for
	 * @return the location of the Card or -1 if not found
	 */
	public int find(Card theCard) throws StackEmptyException, StackFullException {
		DiscardPile tempPile = new DiscardPile();
		int location = -1;
		while (!isEmpty() && location == -1) {
			tempPile.push(this.pop());
			if(theCard.equals(tempPile.peek()))
				location = 0;
		}
		while (!tempPile.isEmpty()){
			this.push(tempPile.pop());
			location++;
		}
		return location;
	}
	
	/*
	 * This method will permit the user to remove and return all cards from the discard pile, up 
	 * to and including theCard, in an array.
	 * @param theCard the Card to stop removing at
	 * @return all cards in the discard pile up to and including theCard
	 */
	public Card[] removeTopCards(Card theCard) throws StackEmptyException {
		int cardsToRemove;
		Card[] removedCards;
		if (!isEmpty() && !(find(theCard) == -1)) {
			cardsToRemove = find(theCard);
			removedCards = new Card[find(theCard)];
			for (int i = cardsToRemove; i > 0; i--)
				removedCards[i - 1] = this.pop();
		}
		else throw new RuntimeException("The card is not in the discard pile");
		return removedCards;
	}
}
