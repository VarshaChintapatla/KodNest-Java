package track.Java.M02.to4;

import java.util.Scanner;

class Student {
    // Declare id, name and javaScore
    int id;
    String name;
    int score;

public class P02 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Create and populate the first Student object
Student s1=new Student();
s1.id=sc.nextInt();
s1.name=sc.next();
s1.score=sc.nextInt();

// Create and populate the second Student object
Student s2=new Student();
s2.id=sc.nextInt();
s2.name=sc.next();
s2.id=sc.nextInt();
s2.name=sc.next();
s2.score=sc.nextInt();

// Display both records
System.out.println(s1.id+" - "+s1.name+" - "+s1.score);
System.out.println(s2.id+" - "+s2.name+" - "+s2.score);

// Compare both scores and print one result
if(s1.score>s2.score){
System.out.println(s1.name+" has the higher Java score.");
} else if(s1.score == s2.score){
System.out.println("Both students have the same Java score.");
}
else {
System.out.println(s2.name+" has the higher Java score.");


}}
}