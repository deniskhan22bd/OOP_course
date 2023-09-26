package practise3;

public class Triangle{
    private int height;
    private Condition condition;
    private String figure;
    Triangle(){

    }

    Triangle(int height, Condition condition){
        this.height = height;
        this.condition = condition;
        this.figure = checkCondition();
    }


    private String checkCondition(){
        if(condition == Condition.RIGHT) return rightCondition();
        else if(condition == Condition.LEFT) return leftCondition();
        else return MiddleCondition();
    }

    public String MiddleCondition(){
        String s = "";
        for(int i = 0; i < height; i++){
            for(int j = 0; j < height * 2; j++){
                if(height - i <= j & height + i >= j) s += "*";
                else s += " ";
            }
            s = s + "\n";
        }
        return s;
    }

    public String leftCondition(){
        String s = "";
        for(int i = 0; i < height; i++){
            for(int j = 0; j < i + 1; j++){
                s = s + "*";
            }
            s = s + "\n";
        }
        return s;
    }

    public String rightCondition(){ 
        String s = "";
        for(int i = 0; i < height; i++){
            for(int j = 0; j < height; j++){
                if(j >= height - 1 - i) s += "*";
                else s += " ";
            }
            s = s + "\n";
        }
        return s;
    }

    public void setCondition(Condition condition){
        this.condition = condition;
        this.figure = checkCondition();
    }
    
    public void setHeight(int height){
        this.height = height;
    }

    public String toString(){
        return figure;
    }
}

