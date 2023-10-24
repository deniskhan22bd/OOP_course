package problem3;

import java.util.Objects;

public abstract class Piece {
    protected Position a;

    public Piece(){

    }

    public Piece(Position position){
        a = position;
    }

    public boolean isLegelMove(Position b){
        return a.equals(b);
    };

    public String toString(){
        return "Figure - " + this.getClass();
    }

    public int hashCode(){
        return Objects.hash(a.getX(), a.getY());
    }

    public boolean equals(Object o){
        if(o == null) return false;
        if(o == this) return true;
        if(o.getClass() != this.getClass()) return false;

        Piece p = (Piece)o;
        return a.equals(p.a);
    }
    
}
