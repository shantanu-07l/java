class Employee{
    String name, add, mail;
    float id, mobile,basic;
    void salary()
    {
        float da,hra,pf,cf,gross,net;
        da = basic * 97/100;
        hra = basic * 10/100;
        pf = basic * 12/100;
        cf = basic * 0.1f/100;
        gross = basic + da + hra - pf - cf;
        net=gross - (pf+cf);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
       
    }
}
class Programmer extends Employee{
    Programmer(String name,int sal){
        this.name = name;
        basic = sal;
    }
}
class Team_Lead extends Employee{
    Team_Lead(String name,int sal){
        this.name = name;
        basic = sal;
    }
}
class Assistant_project_manager extends Employee{
    Assistant_project_manager(String name,int sal){
        this.name = name;
        basic = sal;
    }
}
class Project_manager extends Employee{
    Project_manager(String name,int sal){
        this.name = name;
        basic = sal;
    }
}
public class Inheritance{
    public static void main(String args[]){
        Programmer pr = new Programmer("Akash",100000);
        pr.salary();
        Team_Lead  tl = new Team_Lead("Jai",40000);
        tl.salary();
        Assistant_project_manager apm = new Assistant_project_manager("Satyajeet",60000);
        apm.salary();
        Project_manager pm = new Project_manager("Ram",75000);
        pm.salary();
        
    }
}