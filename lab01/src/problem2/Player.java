package problem2;

public class Player{
    private final static int MAX_LEVEL = 100;
    private final static int MIN_LEVEL = 0;
    private final int id;
    private static int numOfPlayers;
    private String userName;
    private Rank rank;
    private int level;

    {
        id = ++numOfPlayers;
        rank = Rank.F;
        level = MIN_LEVEL;
    }

    public Player(){
    
    }

    public Player(String userName){
        this.userName = userName;
    }

    public Player(String userName, int level){
        this(userName);
        this.level = level;
        this.rank = setRank();
    }

    private Rank setRank(){
        if(level <= 10) return Rank.F;
        else if(level <= 30) return Rank.E;
        else if(level <= 50) return Rank.D;
        else if(level <= 70) return Rank.C;
        else if(level < 100) return Rank.B;
        else return Rank.A; 
    }

    public void KillEnemy(int numOfKilledEnemy){
        if(level + numOfKilledEnemy > MAX_LEVEL){
            level = 100;
            System.out.println("You reach max level. Congratulation!!!!!!!\nWait for future updates");
            return;
        }
        level += numOfKilledEnemy;
        rank = setRank();
    }

    public int getId(){
        return id;
    }

    public int getNumOfPlayers(){
        return numOfPlayers;
    }

    public String getUserName(){
        return userName;
    }

    public Rank getRank(){
        return rank;
    }

    public int getLevel(){
        return level;
    }

    public String toString(){
        return "Id: " + id + ", username: " + userName + ", rank: " + rank + ", level: " + level + ",\nTotal num of players: " + numOfPlayers;
    }

}
