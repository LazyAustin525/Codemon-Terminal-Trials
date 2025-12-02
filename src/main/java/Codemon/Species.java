package Codemon;

import java.util.List;

public class Species extends PKM {
    private int maxHp;
    private List<Move> moves;

    public Species(String name, String type, int level, int hp, int attack, int defense, List<Move> moves) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hp = hp;
        this.maxHp = hp;
        this.attack = attack;
        this.defense = defense;
        this.moves = moves;
    }

    @Override
    public void useMove() {
        // No-op: behavior is driven elsewhere (battle logic uses Move objects).
    }

    public int getMaxHp() { return maxHp; }
    public List<Move> getMoves() { return moves; }
}