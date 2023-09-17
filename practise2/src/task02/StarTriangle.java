package task02;

public class StarTriangle {
    int width;
    StarTriangle(int width){
        this.width = width;
    }

    public String toString(){
        String s = "";
        for(int i = 0; i < width; i++){
            for(int j = 0; j < i + 1; j++){
                s = s + "[*]";
            }
            s = s + "\n";
        }
        return s;
    }
}

