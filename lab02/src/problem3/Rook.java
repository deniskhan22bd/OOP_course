package problem3;

public class Rook extends Piece{
    public Rook(){
        super();
    }

    public Rook(Position position){
        super(position);
    }

    public boolean isLegelMove(Position b){
        if(super.isLegelMove(b)) return false;
        int x1 = (int)a.getX();
        int y1 = a.getY();
        int x2 = (int)b.getX();
        int y2 = b.getY();

        if(x1 == x2 || y1 == y2) return true;
        else return false;
        
    }
}
