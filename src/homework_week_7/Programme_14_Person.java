package homework_week_7;

/**
 * Write a class with the name Person. The class needs three fields (instance variables)
 * with the names  firstName, lastName of type String and age of type int.
 * *Method named getFirstName without any parameters, it needs to return the value of the firstName field.
 * *Method named getLastName without any parameters, it needs to return the value of the lastName field.
 * *Method named getAge without any parameters, it needs to return the value of the age field.
 * *Method named setFirstName with one parameter of type String, it needs to set the value of the  firstName field.
 * *Method named setLastName with one parameter of type String, it needs to set the value of the  lastName field.
 * *Method named setAge with one parameter of type int, it needs to set the value of the age field.
 * If  the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
 * *Method named isTeen without any parameters,
 * it needs to return true if the value of the age field is  greater than 12 and less than 20, otherwise, return false.
 * *Method named getFullName without any parameters, it needs to return the full name of the person.
 * *In case both firstName and lastName fields are empty, Strings return an empty String.
 */
public class Programme_14_Person {
    String firstName, lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age<0 || age>100){
            this.age = 0 ;
        }else {
        this.age = age;
    }
}
   public boolean isTeen() {
       return age > 12 && age < 20;
   }
   public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return " ";
        }else if (firstName.isEmpty()){
            return lastName;
        }else if (lastName.isEmpty()){
            return firstName;
        }else {
            return firstName +" " +lastName;
        }
   }

    public static void main(String[] args) {
        Programme_14_Person person = new Programme_14_Person();
        person.setFirstName(""); //firstName is set to empty string
        person.setLastName(""); //lastName is set to empty string
        person.setAge(10);
        System.out.println("FullName = " + person.getFullName());
        System.out.println("teen =" + person.isTeen());
        person.setFirstName("John");// first name set to John
        person.setAge(18);
        System.out.println("FullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("FullName = " + person.getFullName());

    }
}