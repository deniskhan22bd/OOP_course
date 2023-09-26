package StarTriangle;

public class StarTriangle {
    int width;

    StarTriangle(int width){
        this.width = width;
    }

    public String toString(){
        String s = "";
        for(int i = 0; i < width; i++){
            for(int j = 0; j < width * 2; j++){
                if(width - i <= j & width + i >= j) s += "*";
                else s += " ";
            }
            s = s + "\n";
        }
        return s;
    }
}

