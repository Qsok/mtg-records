package ru.kru.nick;

import ru.kru.nick.deck.Deck;

import java.util.List;

/**
 * Created by Kru on 01.08.2017.
 */
public interface PlayerService {
    Player getFriend(String nickName);
    List<Player> getAllFriends();
    Deck getDeck(Long id);
    List<Deck>getAllDecks(Player player);

}
