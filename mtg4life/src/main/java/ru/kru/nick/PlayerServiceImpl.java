package ru.kru.nick;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.kru.nick.deck.Deck;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Kru on 01.08.2017.
 */
@Repository
@Transactional
@Service("contactService")
public class PlayerServiceImpl implements PlayerService{
    @Override
    public Player getFriend(String nickName) {
        return null;
    }

    @Override
    public List<Player> getAllFriends() {
        return null;
    }

    @Override
    public Deck getDeck(Long id) {
        return null;
    }

    @Override
    public List<Deck> getAllDecks(Player player) {
        return null;
    }
}
