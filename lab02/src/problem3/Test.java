package problem3;

import java.util.Vector;

public class Test {
    public static void main(String args[]){
        King k = new King(new Position('d', 4));
        if(k.isLegelMove(new Position('d', 4))) System.out.println("Yes");
        else System.out.println("No");

        Pawn p = new Pawn(new Position('d', 4));
        if(p.isLegelMove(new Position('d', 5))) System.out.println("Yes");
        else System.out.println("No");

        Bishop b = new Bishop(new Position('d', 4));
        if(b.isLegelMove(new Position('g', 7))) System.out.println("Yes");
        else System.out.println("No");

        Knight n = new Knight(new Position('d', 4));
        if(n.isLegelMove(new Position('c', 6))) System.out.println("Yes");
        else System.out.println("No");

        Queen q = new Queen(new Position('d', 4));
        if(q.isLegelMove(new Position('a', 1))) System.out.println("Yes");
        else System.out.println("No");
        
        Rook r = new Rook(new Position('d', 4));
        if(r.isLegelMove(new Position('d', 1))) System.out.println("Yes");
        else System.out.println("No");


        Vector<Piece> v = new Vector<Piece>();
        v.add(k);
        v.add(p);
        v.add(b);
        v.add(n);
        v.add(q);
        v.add(r);
        for(Piece piece : v){
            System.out.println(piece);
        }
    }
}
