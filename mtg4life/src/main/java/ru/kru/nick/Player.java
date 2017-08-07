package ru.kru.nick;

import ru.kru.nick.deck.Deck;

import javax.persistence.*;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.MatchResult;

/**
 * Created by Kru on 18.07.2017.
 */
@Entity
@Table(name = "PLAYERS")
public class Player {
    Long id;
    String firstName;
    String lastName;
    String nickName;
    Date registerDate;
    List<Player> friends;
    List<Deck> decks;
    HashMap<Player, Statistics> statistics;
    List<MatchResult> matchHistory;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLAYER_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Column(name = "NICKNAME")
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    @Column(name = "JOIN_DATE")
    @Temporal(TemporalType.DATE)
    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
    @ManyToMany
    @JoinTable(name = "PLAYERS",
            joinColumns = @JoinColumn(name = "PLAYER_ID"),
            inverseJoinColumns = @JoinColumn(name = "PLAYER_ID"))
    public List<Player> getFriends() {
        return friends;
    }

    public void setFriends(List<Player> friends) {
        this.friends = friends;
    }

    @OneToMany(mappedBy = "PLAYERS", cascade = CascadeType.ALL,
        orphanRemoval = true)
    public List<Deck> getDecks() {
        return decks;
    }

    public void setDecks(List<Deck> decks) {
        this.decks = decks;
    }

    public HashMap<Player, Statistics> getStatistics() {
        return statistics;
    }

    public void setStatistics(HashMap<Player, Statistics> statistics) {
        this.statistics = statistics;
    }

    @ManyToMany
    @JoinTable(name = "MATCH_DETAIL",
        joinColumns = @JoinColumn(name = "PLAYER_ID"),
        inverseJoinColumns = @JoinColumn(name = "MATCH_ID"))
    public List<MatchResult> getMatchHistory() {
        return matchHistory;
    }

    public void setMatchHistory(List<MatchResult> matchHistory) {
        this.matchHistory = matchHistory;
    }
}
