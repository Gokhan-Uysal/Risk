package app.domain.models.player;

import java.util.List;

import app.domain.models.army.ArmyUnitType;
import app.domain.models.card.MainDecks;

public class Player {
    private int _id;
    private String _username;
    private MainDecks _playerDecks;

    public Player(int id, String username) {
        this._username = username;
        this._id = id;
        this._playerDecks = new MainDecks();
    }

    public Integer getId() {
        return _id;
    }

    public String getUsername() {
        return _username;
    }

    public MainDecks getPlayerDecks() {
        return this._playerDecks;
    }

    public int getArmyCardCount(ArmyUnitType type) {
        return this._playerDecks.armyUnitCardNumbers(type);
    }

    public List<Integer> getTerritoryCardIds() {
        return this._playerDecks.territoryIds();
    }
}
