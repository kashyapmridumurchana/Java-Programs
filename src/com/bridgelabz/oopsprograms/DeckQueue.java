/********************************************************************** *********
 *   Compilation:  javac -d bin DeckOfCards.java						        *
 *  Execution:    java -cp bin com.bridgelabz.oopsprograms.DeckOfCards          *
 *                                                                  			*
 *  Purpose: Deck of cards
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   9.1.2018															*
 *  **************************************************************************/
package com.bridgelabz.oopsprograms;

import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.QueueLinkedList;

public class DeckQueue 
{
	    public static void main(String[] args) {
	        String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	        String[] Ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	        int n = Suits.length * Ranks.length;
	        String[] deck = new String[n];
	        for (int i = 0; i < Ranks.length; i++)
	        {
	            for (int j = 0; j < Suits.length; j++)
	            {
	                deck[Suits.length * i + j] = Ranks[i] + " " + Suits[j];
	            }
	        }
	        //distributes randomly to all the 4 persons
	        for (int i = 0; i < n; i++)
	        {
	            int r = i + (int) (Math.random() * (n - i));
	            String temp = deck[r];
	            deck[r] = deck[i];
	            deck[i] = temp;
	        }
	        QueueLinkedList<QueueLinkedList<String>> mainQueue=OopsUtility.deckQueueStore(deck);
	        OopsUtility.displayDeck(mainQueue);
	    }
	}

