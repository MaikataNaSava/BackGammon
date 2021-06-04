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
        this.homeW = homeW;
    }

    public int getHomeB() {
        return homeB;
    }

    public void setHomeB(int homeB) {
        this.homeB = homeB;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    public int getStoneCount() {
        return StoneCount;
    }

    public void setStoneCount(int stoneCount) {
        StoneCount = stoneCount;
    }

    @Override
    public String toString() {
        return "SetGet{" +
                "StoneCount=" + StoneCount +
                ", moves=" + moves +
                ", homeW=" + homeW +
                ", homeB=" + homeB +
                '}';
    }
}