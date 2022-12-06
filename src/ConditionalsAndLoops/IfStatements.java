package ConditionalsAndLoops;

public class IfStatements {
    public static void main(String[] args) {
//        int salary = 20004;
//        if (salary>10000){
//            salary += 2000;
//        }else{
//            salary += 1000;
//        }
//        System.out.println(salary);


        //multiple if else statements
        int salary = 20004;
        if (salary>10000){
            salary += 2000;
        }else if(salary>20000){
            salary += 1000;
        }else{
            salary += 500;
        }
        System.out.println(salary);



    }
}
