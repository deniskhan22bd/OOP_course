package problem3;

public class Pawn extends Piece{
    public Pawn(){
        super();
    }

    public Pawn(Position position){
        super(position);
    }

    public boolean isLegelMove(Position b){
        if(super.isLegelMove(b)) return false;
        int x1 = (int)a.getX();
        int y1 = a.getY();
        int x2 = (int)b.getX();
        int y2 = b.getY();

        if(y1 == 2 && x1 == x2 && y2 > y1 && diff(y2, y1) <= 2) return true;
        else if(x1 == x2 && diff(y2, y1) == 1) return true;
        else return false;
    }

    private int diff(int x, int y){
        return x - y;
    }
}
