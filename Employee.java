class Company{
    int emp_id;
    String emp_name;
    int emp_salary;
    Company(int emp_id,String emp_name,int emp_salary){
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.emp_salary=emp_salary;
    }
    void emp_detail(){
        System.out.println("EMPLOYEEID:"+emp_id);
        System.out.println("EMPLOYEENAME:"+emp_name);
        System.out.println("EMPLOYEESALARY:"+emp_salary);
    }
}
class Employee{
    public static void main(String[] args) {
       Company c1=new Company(101,"sri",50000);
       Company c2=new Company(102,"nithi",60000);
       c1.emp_detail();
       c2.emp_detail();


    }
}
