package ru.kru.nick.deck;

import ru.kru.nick.Player;
import ru.kru.nick.Statistics;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Kru on 18.07.2017.
 */
public class Deck {
    Long id;
    boolean isPrivate;
    String deckName;
    String comments;
    ArrayList<Card> cards;
    HashMap<Player, Statistics> statistics;
    Player owner;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DECK_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public HashMap<Player, Statistics> getStatistics() {
        return statistics;
    }

    public void setStatistics(HashMap<Player, Statistics> statistics) {
        this.statistics = statistics;
    }

    @ManyToOne
    @JoinColumn(name = "PLAYER_ID")
    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
