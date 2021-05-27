Problem-1
    Create a base class Shape which has 2 methods calculateArea() , calculatePerimeter() , create the following classes

    Rectangle , which has 2 member variables length and breadth
    Square , which has a one member variable side

Inherit the methods from Base class Shape. Print the area of Square and Rectangle.

Sample Input

length = 3
breadth = 4
side of a square = 3

Sample Output

Area of Square is 9
Perimeter of Square is 12
Area of Rectangle is 12
Perimeter of Rectangle is 14

  
  Problem -2 
  
    Create a class Mother which has a method called hairStyle() which displays a message saying I have an Fringed Top style. Create a class Daughter which inherits the method of parent class Mother and the daughter has the same hairstyle. Create an object Mother obj = new Daughter() and call the method hairStyle() such that the daughter and mothers hairstyle is printed. ( Hint : Use super( ) )

Sample Output

I have an Fringed Top style
I have  fringed top hair style like my mom


Problem -3
      Design a ATM machine functionality where there will be following classes

    Bank class with 2 member variables account holder name and bank balance.
    ATM class which will inherit Bank class and has a method withdraw(double withDrawAmt, double totalBalance) and printBalance().
    ATMDemo class should display a message as the user inserts his ATM card and also he/she should be able to withdraw the money and get his remaining bank balance.

Sample Input

name = Ram Das Ghokale
bank balance = 10000
amount to withdraw = 1000

Sample Output

Welcome Ram Das Ghokale to HDFC Bank ATM
Remaining balance is 9000


   Problem -4
      
    Create a class Person with the following properties
        Name
        Age
        Gender

and generate a parameterised constructor with all the 3 properties and print the name , age and gender using getter methods. Achieve encapsulation

Sample Input

Ajay
26
M

Output

Name of the person is Ajay
Age of Ajay is 26
Gender of Ajay is M



Problem -5
    Create a class Animal with a function called speak(). Create the below classes
        Dog class and override the speak() with sound Bow Bow
        Cat class and override the speak() with sound Meow Meow.

Print the sound of Cat and Dog.

Output

Dog makes Bow Bow
Cat makes Meow Meow

Probelm -6
          
    Create a class called Commercial that contains code for calculating bill for a commercial user. There are setter and getter methods in this class that stores the name of the customer. Create a class Domestic for calculating the bill of a domestic user, setter and getter methods of Commercial class are also needed by Domestic class. Commercial class contains a method called CalculateBill() which calculates bill amount at the rate of Rs. 5 per unit. This method has to be overridden by the Domestic class as the price varies for a domestic customer at Rs. 2.5 per unit. Calculate the bill amount for a domestic and a commercial customer if the number of units used by both of them is 100 units.

Sample Output

Customer: Raj Kumar 
Bill amount = 500 Rs

Customer: Lalith Raj
Bill amount = 250Rs


Problem -7
  
    Create a class called Commercial that contains code for calculating bill for a commercial user. There are setter and getter methods in this class that stores the name of the customer. Create a class Domestic for calculating the bill of a domestic user, setter and getter methods of Commercial class are also needed by Domestic class. Commercial class contains a method called CalculateBill() which calculates bill amount at the rate of Rs. 5 per unit. This method has to be overridden by the Domestic class as the price varies for a domestic customer at Rs. 2.5 per unit. Calculate the bill amount for a domestic and a commercial customer if the number of units used by both of them is 100 units.

Sample Output

Customer: Raj Kumar 
Bill amount = 500 Rs

Customer: Lalith Raj
Bill amount = 250Rs


Problem -8
  
    Create a class KFC and which has a method friedChickenRecipe( ) which prints the recipe of fried chicken and display( ) which displays the token number whose order has to be delivered next. Create a class FiveStarChicken which inherits the method display() from KFC but doesn't allow the FiveStarChicken class to override friedChickenRecipe().

Sample Output

Fried Chicken recipe: Take 200gms boneless chicken  and marinate it with lemon, salt and flour
KFC token number is 102

FiveStarChicken token number is 345

  Problem -9
  
    Create a class Student with parameterised constructor which contains the below details ,

    List of StudentDetails class which has the following member variables
        name
        DOB
        blood group

Print the details of all the student and also calculate the age from DOB.

Sample Input

Aman
19-05-1995
O+ve

Rahul Vats
18-05-1998
AB -ve

Output

Student 1 name is Aman 
Student 1 age is 25
Student 1 blood group is O+ve

Student 2 name is Rahul Vats
Student 2 age is 22
Student 2 blood group is AB -ve

Problem -10
    Create a class Student with the following member variables

    name
    age
    address

Create a list of n Students where n is the number of students in a batch and enter all the above mentioned details. Print the details of all the students. (Take all the inputs from keyboard).

Input Format

    First line takes a value n i.e the number of students
    Second line takes name of the student
    Third line takes age of the student
    Fourth line takes address of the student

Sample Input

2
Ajith
21
#34, Shwethal, Jayanagar
Shashank
28
#22, second floor, Bangalore

Sample Output

Ajith
21
#34, Shwethal, Jayanagar

Shashank
28
#22, second floor, Bangalore


  
  
