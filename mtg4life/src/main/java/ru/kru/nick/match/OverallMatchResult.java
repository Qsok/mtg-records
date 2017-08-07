package ru.kru.nick.match;

import ru.kru.nick.Player;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Kru on 12.07.2017.
 */
public class OverallMatchResult {
    Long id;
    HashMap<Player, PlayersMatchResult> playerMatchResults;
    MatchType matchType;
    Date matchDate;

    @ManyToMany
    @JoinTable(name = "PLAYERS",
            joinColumns = @JoinColumn(name = "MATCH_ID"),
            inverseJoinColumns = @JoinColumn(name = "PLAYER_ID"))
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HashMap<Player, PlayersMatchResult> getPlayerMatchResults() {
        return playerMatchResults;
    }

    public void setPlayerMatchResults(HashMap<Player, PlayersMatchResult> playerMatchResults) {
        this.playerMatchResults = playerMatchResults;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }
}
