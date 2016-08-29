package ssa0829;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Student implements Comparable {
    public String id;
    String firstName;
    String lastName;
    String eyeColor;
    public Integer monthsEmployed;
    private final static String MYID = "009999";
    static ArrayList<Student> classmates=null;//= new ArrayList<Student>(); 
    int count;
    //Student student1; //this causes null pointer exception when call toSTring because I guess this becomes null after going through the list and exiting fillArr
    public Student(){
        if(classmates ==null){
            classmates = new ArrayList<Student>(); 
            fillArr();
        }
        //classmates = new ArrayList<Student>();//this will just make 1 instance EVERY time you call Student. You will have only 1 last value in arraylist
        this.count = 0;
      //  fillArr();
    }
    void fillArr(){
        String[][] students = {
            {"474143", "Jonathan", "Stafford", "Brown", "13" }, 
            {"005295", "Kyle", "Deen", "Blue", "2" },   
            {"132617", "Reuben", "Turner", "Blue", "12" },  
            {"306700", "Li", "Lui", "Brown", "12" },
            {"215296", "Joshua", "Franey", "Other", "27" },
            {"523420", "Gabriel", "Hamilton", "Other", "10" },
            {"555420", "Danny", "Boy", "Other", "2" },
            {"004014", "Aisha", "Covington", "Brown", "10" },
            {"006789", "Arun", "Soma", "Brown", "2" },
            {"009999", "Steve", "Ellwood", "Other", "2" },
            {"343769", "Shaquil", "Timmons", "Brown", "11" },
            {"001449", "Karen", "Reiter", "Blue", "10" },
            {"267252", "Dax", "Richards", "Brown", "12" },
            {"229949", "Michael", "Sykes", "Brown", "13" },
            {"772223", "Daniel", "Kiros", "Brown", "3" },
            {"001122", "Michael", "C", "Other", "12" },
            {"001212", "Stephen", "Rook", "Brown", "11" },
            {"004444", "Peter", "Choi", "Brown", "2" },
            {"008888", "Evan", "Tizard", "Brown", "12" }
        };
      
        for(String[] aStudent : students) {
            Student student1 = new Student();
            student1.id = aStudent[0];
            student1.firstName = aStudent[1];
            student1.lastName = aStudent[2];
            student1.eyeColor = aStudent[3];
            String mon = aStudent[4];
            if(!(retInteger(mon)==-1)){
                student1.monthsEmployed = retInteger(mon);
            classmates.add(student1);
            count++;
            }}
    }
    //@Override
    public String toString() {
        //String str= "Student =" + this.firstName + " "+ this.lastName+ " "+this.id+ " "+ this.monthsEmployed+ " "+ this.eyeColor+"";
        String str2 =
                String.format("%6s  %12s   %13s  %-8s   %-3d", this.id, this.firstName, this.lastName,this.eyeColor,this.monthsEmployed);
        return str2;
    }//format(%-6s   %-16s %-16s   %-9s   %6d\n,)student.id, studelnt.first, studentlast, student..getClass().getName()..
    //
    private  void rosterByFirstName() {
        Collections.sort(classmates);
        this.printTop("Class Roster by First Name");
        for(Student str: classmates){
            System.out.println(str.toString());  //.toString()
        }
    }
    @Override
    public int compareTo(Object objectst){
        Student student = (Student) objectst;
        return this.firstName.compareTo(student.firstName);
        }    
    void printNearestIds() {
        HashMap<String, Student> database = new HashMap<String, Student>();
        for(Student student : classmates) {
            database.put(student.id, student);//put each student in the db with the id as the uniqid
            //in hashmaps, id's need to be all unique while the values can repeat
        }
        Set<String> ids = database.keySet();//create a new list of all the id's in the hashmap. Only sets can do this easily  http://stackoverflow.com/questions/12960265/retrieve-all-values-from-hashmap-keys-in-an-arraylist-java
        ArrayList<String> sortedlist = new ArrayList<String>(ids); //add the keys to an arraylist
        //sortedIds.sort(null);///use arraylist sort method   Collections.sort(classmates);
        Collections.sort(sortedlist);//sort all the id's
        String goalId = MYID; // 267252, 306700, 343769
        String myId= null; String prevId= null; String nextId = null;
        for(int matchx = 0; matchx < sortedlist.size(); matchx++) { //do a filter for loop and break out when you find the match
            if(sortedlist.get(matchx) == goalId) {//if the value Object of that key ==mine
                myId = sortedlist.get(matchx);//then assign the list value to myID  this is an arraylist get not map get
                prevId = sortedlist.get(matchx-1);//get the value before my id
                nextId = sortedlist.get(matchx+1);//get the value after my id
                break;
            }
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^Get the Nearest ID's^^^^^^^^^^^^^^^^^^^^^^^^^");
        this.printTop("Class Roster by Map Id");
        System.out.println(database.get(myId.toString())+"     my ID");//get the entire object associated with the keyvalue we just got from the arraylist
        System.out.println(database.get(prevId.toString())+"     previous ID");
        System.out.println(database.get(nextId.toString())+"     following ID");
    }     
    void printTop(String head){
       
       String topline = head + " \n"
                   + "EmplID  First Name     Last Name   Eye Color   Months Employed \n"
                   + "=====   ==========     =========   =========   ===============";
       System.out.println(topline);
    }    
    public Integer retInteger(String s){
        
        if (s.matches("\\d+")){//optional minus and at least one digit"^\\d+$"
            return Integer.parseInt(s);
        } else {System.out.println("Bad input try again");
            return -1; 
        }
    }
    void printClassRoster(){
        rosterByFirstName();
        printNearestIds();
    }
    public static void main(String[] args) {
        Student st = new Student();
        
       st.printClassRoster();
    }
   
}
//In part1 of the assignment, you'll create a Student class. The class has the following data items which should be named as spelled as highlighted:
//
//id (this is the student's employee id at the SSA)
//firstName
//lastName
//eyeColor ("blue", "brown", or "other")
//monthsEmployed (number of MONTHS at the SSA)
//I know you'll want to create getters and setters for these, but for this assignment, since the class is not the focus on this assignment, you have my permission to make the access modifier for these data times public.

