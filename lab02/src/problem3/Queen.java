package problem3;

public class Queen extends Piece{
    public Queen(){
        super();
    }

    public Queen(Position position){
        super(position);
    }

    public boolean isLegelMove(Position b){
        if(super.isLegelMove(b)) return false;
        int x1 = (int)a.getX();
        int y1 = a.getY();
        int x2 = (int)b.getX();
        int y2 = b.getY();

        if(diff(x1, x2) == diff(y1, y2)) return true;
        else if(x1 == x2) return true;
        else if(y1 == y2) return true;
        else return false;
    }

    private int diff(int x, int y){
        return Math.abs(x - y);
    }
}
