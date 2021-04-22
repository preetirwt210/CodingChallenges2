package academy.learnprogramming;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setAge(int age){
        if((age<0) || (age>100)){
            this.age=0;
        }else{
        this.age=age;}
    }
    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        if((age>12) && (age<20)){
            return true;
        }return false;
    }
    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }
        else if(firstName.isEmpty()){
            return lastName;
        }else if(lastName.isEmpty()){
            return firstName;
        }
        return firstName + " " + lastName;
    }
}
