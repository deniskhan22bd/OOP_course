package problem4;

import java.util.Collections;
import java.util.Vector;

public class Test {
    public static void main(String args[]) throws CloneNotSupportedException{
        // Comparator test
        Vector<Employee> v = new Vector<Employee>();
        v.add(new Employee("a", 1, "1"));
        v.add(new Employee("c", 2, "2"));
        v.add(new Employee("d", 3, "3"));
        v.add(new Employee("b", 4, "4"));
        Collections.sort(v, new NameComparator());
        for(Employee e : v){
            System.out.println(e);
        }
        System.out.println();
        v.elementAt(0).hireDate.setMonth(1);
        v.elementAt(1).hireDate.setMonth(2);
        v.elementAt(2).hireDate.setMonth(3);
        v.elementAt(3).hireDate.setMonth(4);
        Collections.sort(v, new DateComparator());
        for(Employee e : v){
            System.out.println(e);
        }
        System.out.println();
        // Clone test in Employee and Manager
        Employee e = new Employee("Denis", 100, "1");
        Employee e2 = (Employee)e.clone();
        e2.name = "DenisClone";
        e2.hireDate.setTime(100);
        System.out.println(e);
        System.out.println(e2);

        Manager m = new Manager("Denis", 100, "1", 100);
        Manager m2 = (Manager)m.clone();

        m2.setBonus(1000);;
        m2.setName("DenisClone");
        m2.setTeam(v);
        System.out.println(m);
        System.out.println(m2);

        // Manager sort

        Vector<Manager> vm = new Vector<Manager>();
        vm.add(new Manager("1", 100, null, 0));
        vm.add(new Manager("1", 100, null, 15));
        vm.add(new Manager("1", 120, null, 0));
        for(Manager ma : vm) System.out.println(ma);
        Collections.sort(vm);
        System.out.println();
        for(Manager ma : vm) System.out.println(ma);


    }
}
