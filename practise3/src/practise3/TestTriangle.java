package practise3;

public class TestTriangle {
    public static void main(String[] args){
        Triangle t = new Triangle(5, Condition.LEFT);
        System.out.println(t);
        t.setCondition(Condition.MIDDLE);
        System.out.println(t);
        t.setCondition(Condition.RIGHT);
        System.out.println(t);
    }
}
