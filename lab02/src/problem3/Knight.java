package problem3;

public class Knight extends Piece{
    public Knight(){
        super();
    }

    public Knight(Position position){
        super(position);
    }

    public boolean isLegelMove(Position b){
        if(super.isLegelMove(b)) return false;
        int x1 = (int)a.getX();
        int y1 = a.getY();
        int x2 = (int)b.getX();
        int y2 = b.getY();

        if(diff(x1, x2) == 1 && diff(y1, y2) == 2) return true;
        else if(diff(x1, x2) == 2 && diff(y1, y2) == 1) return true;
        else return false;
    }

    private int diff(int x, int y){
        return Math.abs(x - y);
    }
}
