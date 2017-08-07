package ru.kru.nick.match;

import ru.kru.nick.Player;
import ru.kru.nick.Statistics;
import ru.kru.nick.deck.Deck;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Kru on 18.07.2017.
 */
public class PlayersMatchResult {
    List<Deck> usedDecks;
    HashMap<Player, Statistics> matchStatistics;
    boolean winner;

}
