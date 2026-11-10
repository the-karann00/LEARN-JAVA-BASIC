import java.util.*;
//------------------------------
// VARIABLE & DATA STRUCTURE
//------------------------------

//public class Main {
//public static void main(String[] args) {

    // NOTICE DONT REMOVE // , REMOVE ONLY /* */

//SUM OF A & B :
/*int a = 10; 
int b = 8;
int sum = a + b;
System.out.println(sum);*/

// IF YOU TAKE INPUT TRY SCANNER OBJECT

/*Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int sum = a + b;
System.out.println(sum);    
*/

//------------------------------
// TYPE CASTING
//------------------------------

/*Scanner sc = new Scanner(System.in);
float a = 25.88899f;
//int b = a; //this is error 
int b = (int) a;
System.out.println(b);
sc.close();// sc.next is a scanner class closer */

//------------------------------
// ### OPERATORS IN JAVA 
//------------------------------

//------------------------------
 // 1 - ARITHMETIC OPERATORS ( + , - , * , / , % )
//------------------------------

 /*int a = 18 ;
 int b = 7;
 System.out.println("add = " + (a+b));*/ 


//------------------------------
// ### CONDITIONAL STATEMENT 
//------------------------------

//------------------------------
// 1 - IF-ELSE STATEMENTS
//------------------------------

/*int age = 22;
if (age >= 18){
    System.out.println("adult , drive , vote");
}
else{
    System.out.println("not adult");
}*/

//Q: PRINT THE LARGEST OF 2?
/*int a = 1
int b = 3
if(a >= b ){
System.out.println("a");
}
else{
    System.out.println("b");
}*/

//Q: PRINT IF A NUMBER IS A EVEN OR ODD?
/*Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
if (number % 2 == 0 ){
    System.out.println("EVEN");
}
else{
    System.out.println("ODD");
}*/

//------------------------------
// 2 - ELSE IF STATEMENTS
//------------------------------

//if condition 1 is true than condition 2 is not excute and if condition 1 is false than use else if

//Q: INCOME TAX CALCULATOR
//Condition income < 5lakh - tax = 0%
//Condition income < 5-10lakh - tax = 20%
//Condition income >10 lakh - tax = 30%
/*Scanner sc = new Scanner(System.in);
int income = sc.nextInt();
int tax;

if(income < 500000){
    tax  = 0;
}
else if(income >= 500000 && income < 1000000){
    tax = (int) (income * 0.2);
}
else{
    tax = (int) (income * 0.3);
}
System.out.println("your tax is : " + tax);
sc.close();*/

//------------------------------
//3 - TERNARY OPERATOR 
//------------------------------

// VARIABLE = CONDITION ? STATEMENT 1 (TRUE) : STATEMENT 2(FALSE) ;

//Q: CHECK IF A STUDENT WILL PASS OR FAIL?
//Marks >= 33: pass : Marks < 33: fail
/*int marks = 67;
String reportCard = ((marks>=33)) ? "pass" : "fail";
System.out.println(reportCard);*/

//------------------------------
//4 - SWITCH STATEMENT 
//------------------------------
//Switch variable {
//case 1: system.out.print("anything like samosa")
           // break; -> its use to breake the statement of case 1
//case 2: system.out.println("like burger")
        // break;
//default: system.out.println("dont like anything")  
//}   

//Q: MAKE A CALCULATOR
/*Scanner sc = new Scanner(System.in);
System.out.println("ENTER YOUR FIRST NUMBER");
int a = sc.nextInt();
System.out.println("ENTER YOUR SECOND NUMBER");
int b = sc.nextInt();
System.out.println("ENTER  OPERATOR");
char operator = sc.next().charAt(0);

switch(operator){
case '+': System.out.println(a+b);
            break;
case '-': System.out.println(a-b);
            break;
case '*': System.out.println(a*b);
            break;
case '/': System.out.println(a/b);
            break;
}
sc.close();*/

//### LOOPS IN JAVA
// 1- WHILE LOOP
//-> While (condition){
       //do something
  //     }

//Q: print karann 100 times?
/*int counter = 0;
while(counter < 100 ){
    System.out.println("karann");
    counter++;
}*/

//Q: PRINT NUMBER FORM 1 TO 10?
/*int counter = 1;
while(counter<=10){
    System.out.println(counter);
    counter++;
}*/

//Q: PRINT SUM OF FIRST N NATURAL NUMBER?
/*int n = 18;
int sum = 0;
int i =1;   //-> i means counter
while(i<=n){
    sum+= i;  //-> sum+= means sum = sum+i
    i++;
}
System.out.println("sum is: "+ sum);*/

//------------------------------
//2 - FOR LOOP
//------------------------------

// for(initialistion ;  |  condition ;         |   updation)    {
    //counter, iterator | i<=10, i=100 , i>150 |  i++ , i=i+2
// do something
  //}

//Q: PRINT SUM OF FIRST N NATURAL NUMBER IN FOR LOOP? 
/*int n = 11;
int sum = 0;

for(int i = 1 ; i<=n ; i= i+2){
     sum += i;
}
System.out.println("sum is: "+ sum);*/

//Q: PRINT SQUARE PATTERN 
// IN WHILE LOOP

/*int line = 4;
while(line<=4){
    System.out.println("****");
    line++;
}*/

// IN FOR LOOP
/*for(int line = 1 ; line <=4 ; line++){
    System.out.println("****");
}*/

//Q: PRINT REVERSE OF A NUMBER 
//NUMBER = 10899

/*int number = 10899;
while(number > 0){
int lastDigit = number % 10;                            // find lastdigit -> number % 10
System.out.print(lastDigit + " ");               // remove lastdigit -> number / 10
number = number / 10;
}
System.out.println();*/

//------------------------------
//3 - DO - WHILE LOOP
//------------------------------

// in do while loop first work done than condition check
//DO{
//   do something 
// while(condition);
//}

//Q: PRINT HELLO WORLD 10 TIMES 
/*int counter = 1;
do{
    System.out.println("Hello World");
    counter++;
} while (counter <= 10 );*/

//:: BREAK STATEMENT    -> to exit the loop
//EXAMPLE
/*for ( int i = 1; i<= 5 ; i++){
    if ( i == 4){
        break;
    }
    System.out.println(i);
}
System.out.println(" i am out of the loops");*/

//Q : KEEP ENTERING NUMBER TILL USER ENTER A MULTIPLE OF 10
 /*Scanner sc = new Scanner(System.in);
 do {
      System.out.println("Enter your number : ");
      int n = sc.nextInt();
      if( n % 10 == 0 ) {
        break;
      }
      System.out.println(n);
 } while (true);*/

//:: COUNTINUE STATEMENT   -> to skip an iteration
//EXAMPLE 
/*for (int i = 1; i<= 5 ; i++){
    if ( i==3){
        continue;
    }System.out.println(i);
}*/

//Q: DISPLAY ALL NUMBER ENTERED BY USER EXCEPT MULTIPLE OF 10
/*Scanner sc = new Scanner(System.in);
do{
    System.out.println("Enter Your Num :");
    int n  = sc.nextInt();
    if( n  % 10 == 0 ){
        continue;
    }System.out.println("Number is : "+ n );
} while(true);*/


//-----------------------------------------------------------------------------------
//### FUNCTION & METHODS  ->  is a block of codes thats perform a perticular 
//                              task that we can repeat over and over again
//-----------------------------------------------------------------------------------
// .SYNTAX
//retrunType name (){
// body 
// retrun statement;
//}

//Q: CODE FOR PRINT PRINTHELLOWORLD 
public class Main{
    public static void printhelloworld() {
        System.out.println("Hello World");
    }  //printhelloworld();

    //Q: CALCULATE SUM
    public static void calculatesum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.println("Sum is :" + sum);
    }  //calculatesum()

    public static int multiply(int a , int b ){
    int product = a*b;
    return product;
} 
/*public static void main(String[] args) {
    int a = 3;
    int b = 18;
    int product = multiply(a, b);
    System.out.println("a * b = " + product);
}*/

//Q: FACTORIAL OF A NUMBER N ?
public static int factorial(int n){
    int f = 1;
    for(int i = 1 ; i <= n ; i++){
        f = f * i;
    }
    return f; 
} //System.out.println(factorial(5))

//Q: BINOMIAL COEFFICIANT?
public static int bionomialcoff(int n , int r) {
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);

    int binomialcoff = fact_n / (fact_r * fact_nmr);
    return binomialcoff;
}   //System.out.println(bionomialcoff(4 , 6));

//--------------------------------------------------------------------------------------
//:: FUNCTION OVERLOADING  -> multiply function with same name but diff parameter
//--------------------------------------------------------------------------------------

//------------------------------
//USING PARAMETER
//------------------------------

// Like - function 1: sum of 2 number
//          int sum = (int a , int b ){
//       return a + b; }

// Like - function 2: sum of 3 number 
//         int sum = (int a , int b , int c){
//        return a + b + c; }

//IN code -----
/*public static int sum (int a , int b){
    return a + b;
}
public static int sum (int a , int b, int c) {
    return a + b + c;
}  //System.out.println(sum(3 , 5));
   // System.out.println(sum(5 , 6 ,7));*/

   //------------------------------
//USING DATA TYPE
//------------------------------

/*public static int sum(int a , int b ){
    return a + b;
}
public static float sum(float a,  float b ){
    return a + b;
}
public static void main(String[] args) {
    System.out.println(sum(7 ,8));
    System.out.println(sum(3.14f , 45.7f));*/

//Q: PRINT ALL PRIME IN RANGE?
/*public static void primeInRange(int n){
    for (int i = 2 ; i <= n ; i++){
        if(isPrime(i)) {
            System.out.println(i+" ");
        }
    }
    System.out.println();
}
    public static void main(String args[]){
      primeInRange(10);*/
      
//Q:CONVERT BINARY NUMBER INTO DECIMAL ?
public static void binToDec(int binNum){
    int myNum = binNum;
    int pow = 0;
    int decNum = 0;

    while(binNum > 0){
        int lastDigit = binNum % 10;
        decNum = decNum + (lastDigit *(int)Math.pow(2, pow));
        pow++;
        binNum = binNum/10;
    }
    System.out.println("Decimal of "+ myNum + " = "  + decNum);
}    //binToDec(enter num);

//Q: CONVERT DECIMAL INTO BINARY ?
public static void decToBin(int n ){
    int myNum = n;
    int pow = 0;
    int binNum = 0;

    while ( n > 0){
        int rem = n%2;
        binNum = binNum +(rem * (int)Math.pow(10,pow));
        pow++;
        n = n/2;
    }
    System.out.println("binary form of : " + myNum + " = " + binNum);
}  //decToBin(enter your number);

//-----------------------------------------------------
//### NESTED LOOP  -> loop have inside a loop
//-----------------------------------------------------

//Q: PRINT STAR PATTERN 
// *                   step1: outer loop means how many line  = 4;
// * *                 step2: number of time
// * * *               step3: what to print like star "*"
// * * * *

public static void star_pattern(int n){
    for (int i = 1 ; i<=n ; i++){
        for(int star = 1; star <= i; star++){
            System.out.print("*");
        }
        System.out.println();
    }
}
 
//Q: PRINT INVERTED STAR PATTERN
public static void invertedstar_pattern(int n){
    for (int i = 1 ; i<=n ; i++){
        for(int star = 1; star<=n-i+1; star++){
            System.out.print("*");
        }
        System.out.println();
    }
}

//Q: PRINT HALF PYRAMID PATTERN
public static void half_pyramid(int n ){
    for (int i = 1; i <= n; i++) {
            for (int number = 1; number <= i; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

//Q: PRINT CHARACTER PATTERN 
public static void char_pattern(int n , char ch){
    for(int i =1 ; i <= n ; i++){
        for(int character = 1 ; character <= i ; character++){
            System.out.print(ch + " ");
            ch++;
        }
        System.out.println();
    }
}  
    
//Q: PRINT HOLLOW RECTANGLE PATTERN 
public static void hallow_recpattern(int row , int colm) {
    for (int i = 1; i <= row ; i++){
        for(int j =1 ; j <= colm ; j++){
            if( i== 1 || i == row || j == 1 || j == colm) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
         }
        System.out.println();
    }
}

//Q: PRINT INEVERTED & ROTATED HALF PYRAMID
public static void roatedhalf_pyramid(int n ){
    for( int i = 1 ; i<=n ; i++){
        //spaces
        for(int j = 1; j<= n-i ; j++){
            System.out.print(" ");
        }
        // code for to print star
        for(int j =1; j<= i ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

//Q: INVERTED HALF PYRAMID WITH NUMBER
public static void halfpyramid_number(int n ){
    for(int i =1 ; i<= n ; i++){
        for(int j = 1; j<= n-i+1; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}

//Q: PRINT FLOYDS TRIANGLE PATTERN 
public static void floydtri_pattern(int n ){
    int counter = 1;
    for ( int i = 1; i<= n ; i++){
        for ( int j = 1; j <= i ; j++){
            System.out.print(counter +" ");
            counter++;       
        }
        System.out.println();
    }
}

//Q: PRINT 0-1 TRIANGLE PATEERN
public static void zeronetri_pattern(int n ){
    for( int i = 1; i <= n ; i++ ){
        for ( int j =1 ; j <= i ; j++){
            if( (i+j) % 2 == 0){
               System.out.print("1" +" ");
            } else {
                System.out.print("0" +" ");
            }
        }
        System.out.println();
    }
}

//Q: PRINT BUTTERFLY PATTERN 
public static void buteerfly_pat(int n){
    for (int i = 1 ; i<= n ; i++){
        //star
        for( int j = 1 ; j <=i ; j++){
            System.out.print("*");
        }
        //spaces - 2*(n-1)
        for (int j = 1 ; j<=2*(n-1) ; j++){
            System.out.print(" ");
        }
        //star - i
        for (int j = 1; j<=i ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
        for (int i = n ; i >= 1 ; i--) {

           for( int j = 1 ; j <=i ; j++){
            System.out.print("*");
        }
        //spaces - 2*(n-1)
        for (int j = 1 ; j<=2*(n-1) ; j++){
            System.out.print(" ");
        }
        //star - i
        for (int j = 1; j<=i ; j++){
            System.out.print("*");
        } 
        System.out.println();
    }   
}   

//PRINT RHOMBUS PATTER
public static void rhombus_pattern(int n ){
    for(int i = 1; i<=n ; i++){
        //spaces
        for(int j = 1; j<=(n-i); j++){
            System.out.print(" ");
        }
        //star
        for(int j =1 ; j<=n ; j++){
            System.out.print("*");
        } 
        System.out.println();
    }
} 

//PRINT HOLLOW RHOMBUS PATTERN
public static void hollow_rhombus(int n){
    for( int i = 1; i<= n ; i++){
        for(int j =1 ; j<=(n-i) ; j++){
            System.out.print(" ");
        }
        for(int j = 1; j<=n ;j++){
            if(i ==1||i ==  n || j ==1 || j == n){
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
         }
         System.out.println(); 
    }
}
//PRINT DAIMOND PATTERN 
public static void daimond_pat(int n){
    //1st half
    for (int i = 1 ;i<= n ; i++){
        for(int j = 1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j = 1; j<= (2*i)-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }   
//2nd half
    for (int i = n ; i>= 1 ; i--){
        for(int j = 1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j = 1; j<= (2*i)-1; j++){
            System.out.print("*");
        }
        System.out.println();
    } 
}

public static void main(String[] args) {
    // hallow_recpattern(10,, 7);
    // roatedhalf_pyramid(7);
    // halfpyramid_number(5);
    // floydtri_pattern(5);
    // zeronetri_pattern(5);
    // buteerfly_pat(5);
    // rhombus_pattern()
    // hollow_rhombus(7);
    // invertedstar_pattern(4);
    //daimond_pat(5);
    
    }
}




     
      