package ru.kru.nick.deck;

/**
 * Created by Kru on 18.07.2017.
 */
public enum CardType {
    BASIC_LAND(),
    LAND(),
    CREATURE(),
    INSTANT(),
    SORCERY(),
    ENCHANTMENT(),
    ARTIFACT();

    CardType(){};
}
