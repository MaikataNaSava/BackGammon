package backgammon;

public class SetGet {

    private int StoneCount;//колко останали имаш на полето
    private int moves;//движение
    private int homeW = 0;//изхвърляне на пул бял
    private int homeB = 0;//изхвърляне на пул черен

    public int getHomeW() {
        return homeW;
    }

    public void setHomeW(int homeW) {
        if (homeW <= 15 && homeW >= 0) {
            this.homeW = homeW;
        }
    }

    public int getHomeB() {
        return homeB;
    }

    public void setHomeB(int homeB) {
        if (homeB <= 15 && homeB >= 0) {
            this.homeB = homeB;
        }
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        if (moves <= 0 && moves >= 24) {
            this.moves = moves;
        }
    }

    public int getStoneCount() {
        return StoneCount;
    }

    public void setStoneCount(int stoneCount) {
        if (StoneCount <= 0 && StoneCount >= 30) {
            StoneCount = stoneCount;
        }
    }

    @Override
    public String toString() {
        return "SetGet{"
                + "StoneCount=" + StoneCount
                + ", moves=" + moves
                + ", homeW=" + homeW
                + ", homeB=" + homeB
                + '}';
    }
}
