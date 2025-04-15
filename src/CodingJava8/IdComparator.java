package Coding2AdvancedJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getId()==o2.getId()){
           return o1.getName().compareTo(o2.getName());
        } else if(o1.getId()>o2.getId()){
            return 1;
        } else {
            return -1;
        }
    }

    public static class EmployeeDataBase {
        public static List<DeadLock.Employee> getEmployees(){
            Main.Project p1=new Main.Project("P001","Alpha","ABC corp","David1");
            Main.Project p2=new Main.Project("P002","Beta","XYZ Ltd","David2");
            Main.Project p3=new Main.Project("P003","Gamma","ABC corp","David1");
            Main.Project p4=new Main.Project("P004","Delta","TechMahindra","David3");
            Main.Project p5=new Main.Project("P005","Zeta","BridgeStone","David4");
            Main.Project p6=new Main.Project("P006","Theta","Fastrack","David5");
            DeadLock.Employee emp1=new DeadLock.Employee(1,"John Doe","Development", Arrays.asList(p1,p2),8000,"Male");
            DeadLock.Employee emp2=new DeadLock.Employee(2,"Jane Smith","Development", Arrays.asList(p3),6000,"Male");
            DeadLock.Employee emp3=new DeadLock.Employee(3,"Elisa","Sales", Arrays.asList(p1,p2),5500,"Female");
            DeadLock.Employee emp4=new DeadLock.Employee(4,"Robert","HR", Arrays.asList(p4),4000,"Male");
            DeadLock.Employee emp5=new DeadLock.Employee(5,"Juliana","Marketing", Arrays.asList(p5),7000,"Female");
            DeadLock.Employee emp6=new DeadLock.Employee(1,"Rowina","Sales", Arrays.asList(p6),5000,"Female");
            return Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);

            //Employee{id=1, name='John Doe', dept='Development',
            // projects=[Project{projectCode='P001', name='Alpha', client='ABC corp', leadName='David1'},
            // Project{projectCode='P002', name='Beta', client='XYZ Ltd', leadName='David2'}], salary=8000.0, gender='Male'}
        }
    }
};
