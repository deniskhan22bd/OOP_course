package problem2;

public class TestPlayer {
    public static void main(String[] args){
        Player p1 = new Player("12345");
        System.out.println(p1);  
        p1.KillEnemy(100);
        System.out.println(p1);
        p1.KillEnemy(100);

    }
}
