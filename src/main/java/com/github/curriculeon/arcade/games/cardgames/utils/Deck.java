package com.github.curriculeon.arcade.games.cardgames.utils;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class Deck {
    private Stack<Card> cardStack;

    public Deck() {
        this.cardStack = new Stack<>();
        for(Suit suit : Suit.values()) {
            for(Rank rank : Rank.values()) {
                cardStack.push(new Card(suit, rank));
            }
        }
    }

    public Deck(Stack<Card> cardStack) {
        this.cardStack = cardStack;
    }

    public void push(Card card) {
        this.cardStack.push(card);
    }

    public Card peek() {
        return cardStack.peek();
    }

    public Card pop() {
        return cardStack.pop();
    }

    public Boolean isEmpty() {
        return cardStack.isEmpty();
    }

    public void shuffle() {
        Collections.shuffle(cardStack);
    }

    @Override
    public Deck clone() {
        Stack<Card> newStack = new Stack<>();
        cardStack.forEach(newStack::push);
        return new Deck(newStack);
    }


    public Iterator<Card> iterator() {
        return cardStack.iterator();
    }

    public int size() {
        return cardStack.size();
    }

    public Stack<Card> getStack() {
        return cardStack;
    }
}
