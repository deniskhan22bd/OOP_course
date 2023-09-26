package problem2;

public class Player{
    private final static int MAX_LEVEL = 100;
    private final int id;
    private static int numOfPlayers;
    private String userName;
    private Rank rank;
    private int level;
    
    {
        id = ++numOfPlayers;
        rank = Rank.Newbie;
        level = 0;
    }

    // public Player(){
    //     rank = Rank.Newbie;
    //     level = 0;
    // }

    public Player(String userName){
        //this();
        this.userName = userName;
    }

    public Player(String userName, int level){
        this(userName);
        this.level = level;
        this.rank = setRank();
    }

    private Rank setRank(){
        if(level <= 10) return Rank.Newbie;
        else if(level <= 30) return Rank.Student;
        else if(level <= 50) return Rank.Specialist;
        else if(level <= 70) return Rank.Expert;
        else if(level < 100) return Rank.Master;
        else return Rank.Grandmaster; 
    }

    public void KillEnemy(int n){
        if(level + n > MAX_LEVEL){
            level = 100;
            System.out.println("You reach max level. Congratulation!!!!!!!\nWait for future updates");
            return;
        }
        level += n;
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

    public int level(){
        return level;
    }

    public String toString(){
        return "Id: " + id + ", username: " + userName + ", rank: " + rank + ", level: " + level + ",\nTotal num of players: " + numOfPlayers;
    }





}
