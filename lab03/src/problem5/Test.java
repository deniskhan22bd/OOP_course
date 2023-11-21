package problem5;
import Time.Time;
import problem4.Employee;

public class Test {
    public static void main(String args[]){
        Chocolate[] ch = new Chocolate[4];
        ch[0] = new Chocolate(100, "Baunti");
        ch[1] = new Chocolate(150, "Twix");
        ch[2] = new Chocolate(50, "Mars");
        ch[3] = new Chocolate(200, "Snickers");
        for(Chocolate cho : ch){
            System.out.println(cho);
        }
        System.out.println();
        Sort.selectionSort(ch);
        for(Chocolate cho : ch){
            System.out.println(cho);
        }

        Employee[] e = new Employee[4];
        e[0] = new Employee("denis1", 100, "123");
        e[1] = new Employee("denis2", 150, "1234");
        e[2] = new Employee("denis3", 300, "12345");
        e[3] = new Employee("denis4", 200, "123456");
        for(Employee em : e){
            System.out.println(em);
        }
        System.out.println();
        Sort.selectionSort(e);
        for(Employee em : e){
            System.out.println(em);
        }

        Time[] t = new Time[4];
        t[0] = new Time(10, 30, 00);
        t[1] = new Time(15, 30, 00);
        t[2] = new Time(10, 30, 50);
        t[3] = new Time(10, 25, 30);
        for(Time tm : t){
            System.out.println(tm);
        }
        System.out.println();
        Sort.insertionSort(t);
        for(Time tm : t){
            System.out.println(tm);
        }
    }
}
