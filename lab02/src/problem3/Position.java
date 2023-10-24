package problem3;

import java.util.Objects;

public class Position {
    private char x;
    private int y;

    public Position(){

    }

    public Position(char x, int y){
        this.x = x;
        this.y = y;
    }

    public char getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public String toString(){
        return "" + x + y;
    }

    public int hashCode(){
        return Objects.hash(x, y);
    }

    public boolean equals(Object o){
        if(o == null) return false;
        if(o == this) return true;
        if(o.getClass() != this.getClass()) return false;

        Position p = (Position)o;
        return x == p.x && y == p.y;
    }
}
