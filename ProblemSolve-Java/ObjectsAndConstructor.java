/* 
Problem -1

    Create a class called ClassRoom which stores student name, age and address.

    Create a method printCategory with the below conditions
        if the age is between 5 and 12 (both included) then print Primary School.
        if the age is between 13 and 15(both included) then print High School
    Create a method printDetails that will print Student name and address.

Now create 2 objects of ClassRoom with a parameterized constructor that accepts student name, age and address and call printCategory() and printDetails() methods.

*/       
public class Classroom {
    String name;
    int age;
    String add;
    public Classroom(String name, int age, String address) {
        this.name = name;
        this.age = age;
        add = address;
    }
    public void printCategory(int age) {
        if(age>=5 && age<=12) {
            System.out.println("Primary School");
        }
        if(age>=13 && age<=15) {
            System.out.println("High School");
        }
    }
    public void printDetails() {
        System.out.println(name);
        System.out.println(add);
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

    }
    public static void main(String[] args) {
        Classroom abhimanyu = new Classroom("abhimanyu",12,"Mumbai");
        Classroom mausam = new Classroom("mausam", 15, "Mumbai");
        abhimanyu.printCategory(abhimanyu.age);
        abhimanyu.printDetails();
        mausam.printCategory(mausam.age);
        mausam.printDetails();

    }
}

/*          
Problem -2 
          
    Create a class called Square which has the below details

    there is one member variable side which represents a side of the square
    constructor that will accept side of a square.
    there is a method calculateArea() which calculates the area of square
    there is a method calculatePerimeter() which calculates the perimeter of square.

Create an object of the class Square and find the area and perimeter of the square.
*/

package AbstractClass;

public class Square {
    int side;
    public Square(int side) {
        this.side = side;
    }
    public void calculateArea(int side) {
        int Area = side * side;
        System.out.println(Area);
    }
    public void calculatePerimeter(int side) {
        int perimeter = 4 * side;
        System.out.println(perimeter);
    }
    public static void main(String[] args) {
        Square a = new Square(12);
        a.calculateArea(a.side);
        a.calculatePerimeter(a.side);
    }
    
}

 /* 
   Problem -3 

    Create a class called CovidVaccinationCenter which has the following things
        3 member variables slot_date(String) , center_name , age_group
        Create a parameterized constructor which will accept the above 3 parameters.
        Create a method getVaccine() which prints the below
            if the age_group is between 18-44 and the slot_date is between 01-06-2021 to 05-06-2021, print Vaccine Available for 18-44 Age Group
            if the age_group is between 45 -75 and the slot_date is between 21-05-2021 to 30-05-2021 , print Vaccine Available for 45-75 Age Group
            for all other inputs print Vaccine not available
*/

public class CovidVaccinationCenter {
    String slot_date;
    String center_name;
    int age;
    public CovidVaccinationCenter(String slot_date, String center_name, int age){
        this.slot_date = slot_date;
        this.center_name = center_name;
        this.age = age;
    }
    public void getVaccine(String Slot_date, int age) {
//        String regex = "[-/]";
//        String[] date = slot_date.split(regex);
        String[] date = slot_date.split("[-/]");
        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);
        System.out.println("_____________________________________");
        if(age>=18 && age<=44 && day>=1 && day<=5 && month==6 && year==2021) {
            System.out.println("Vaccine Available for 18-44 Age Group");
        }
        else if(age>=45 && age<=75 && day>=21 && day<=30 && month==5 && year==2021) {
            System.out.println("Vaccine Available for 45-75 Age Group");
        }
        else {
            System.out.println("Vaccine not available");
        }
    }
    public static void main(String[] args) {
        CovidVaccinationCenter abhi = new CovidVaccinationCenter("03-06-2021", "palghar", 20);
        abhi.getVaccine(abhi.slot_date,abhi.age);
        CovidVaccinationCenter ashu = new CovidVaccinationCenter("24/05/2021", "palghar", 60);
        ashu.getVaccine(ashu.slot_date,ashu.age);
        CovidVaccinationCenter ram = new CovidVaccinationCenter("25/06/2021", "palghar", 30);
        ram.getVaccine(ram.slot_date, ram.age);
    }
}




/*
Problems -4

    Create a class called Car which has the below details
    four member variables name, color, maxSpeed and noOfGears
    parameterized constructor that will accept the name, color, maxSpeed and noOfGears.
    create a method called getVehicleDetails() that will print all the details of the car.
    Create two objects of the class and call the getVehicleDetails()
*/

package AbstractClass;

public class Car {
    String name;
    String colour;
    float maxSpeed;
    int noOfGears;
    public Car(String name, String colour, float maxSpeed, int noOfGears) {
        this.name = name;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.noOfGears = noOfGears;
    }
    public void getVehicleDetails() {
        System.out.println("_________________________________________");
        System.out.println(name);
        System.out.println(colour);
        System.out.println(maxSpeed);
        System.out.println(noOfGears);
        System.out.println("-----------------------------------------");
    }
    public static void main(String[] args) {
        Car bmw = new Car("X_50", "Matte Black", 250, 7);
        Car lamborghini = new Car("Venon", "Red", 300, 9);
        bmw.getVehicleDetails();
        lamborghini.getVehicleDetails();
    }

}

/*
Problem -5
      
    Create a class called Student which has the below details
        3 member variables name, DOB and Blood Group
        constructor with the above mentioned parameters
        create a method calculateAge(String dob) which calculates the age of the student and returns it.
        create a method printDetails which prints the student name and Blood Group.

Create an Object of Student and print their details by calling the respective methods.

Sample Input

Ayush
19-05-1995
O+ve

Output

Student name is Ayush 
Student  age is 25
Student blood group is O+ve
*/
