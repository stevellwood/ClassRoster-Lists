package ssa0829;

import java.util.ArrayList;
import java.util.Collections;

public class ClassRoster {
    String[] people = {"Evan", "Jarrett", "Karen", "Shaq", "Aisha", "Dan","Kevin", "Joe", "Li", "Steve", "Stephen", "Pete","MikeC","Groovin","Dax","Arun", "Bart","Josh", "Cartman", "Gab","Kyle","Jon"};
    
    static ArrayList<Student> classmates; //static is good if instantiate several times
        int count;
        ClassRoster(){
            classmates = new ArrayList<Student>();
            this.count = 0;
        }
        private void classRosterReport() {
            //for (int i=0; i<people.length-1;i++){
                classmates.add(new Student("001122","Michael","Clair","Purple","12"));
               // Contacts.add(new Data(name, address, contact));
                count++;
            }
           Collections.sort(classmates);
           for(String name: classmates){
               System.out.println(name);
               
           }
           System.out.println("Total number of students is "+count);
           System.out.println("============Reverse Sort===============");
           Collections.reverse(classmates);
           for(String name: classmates){
               System.out.println(name);
               
           }
           System.out.println("Total number of students is "+count);
        }     
     // Sorting
       // Collections.sort(fruits, new Comparator<Fruit>() {
        //@Override
//        public int compare(String name1, String name2)
//        {
//
//            return  fruit1.fruitName.compareTo(fruit2.fruitName);
//        }
//        employees.add("Adam Adamson");
//        employees.add("Bart Billingham");
//        employees.add("Carmen Collins");
//        for(String name : employees) {
//            System.out.printf("Name is %s\n", name);
//        }
//        // Output:
//        Name is Adam Adamson
//        Name is Bart Billingham

        public static void main(String[] args) {
            ClassRoster cr = new ClassRoster();
            cr.classRosterReport();
        }
      //Michael C 001122   Michael Clair Purple 12
        //
        //[11:07 AM]  
        //Stephen R 001212; Stephen; Rook; Brown; 11
        //
        //[11:07 AM]  
        //Jonathan Stafford added a Plain Text snippet 
        //eye color: Brown
        //id: 474143
        //months at ssa: 13
        //Add Comment
        //
        //[11:08 AM]  
        //Kyle Deen 005295 Kyle Deen Blue 2
        //this.printSTudentDetail(str);
        //[11:08 AM]  
        //Kevin Tran 004400, Kevin Tran, Red, 12
        //
        //[11:09 AM]  
        //Kyle Deen remember the eye colors can only be blue, brown, or other so there's gonna be a lot of "other"'s so far.. lol
        //
        //[11:09 AM]  
        //Reuben Turner 132617 Reuben Turner Blue 12
        //
        //[11:10 AM]  
        //Li Lui 306700 Li Lui, Brown, 12
        //
        //[11:10 AM]  
        //Joshua Franey 215296 Joshua Franey, other, 27
        //
        //[11:11 AM]  
        //Gabriel H 523420 Gabriel Hamilton Black 10
        //
        //[11:12 AM]  
        //Aisha Covington 004014 ; Aisha Covington;  brown; 10 (edited)
        //
        //[11:17 AM]  
        //Arunkumar Soma 006789 Arun Soma  brown 2
        //
        //[11:17 AM]  
        //Steve Ellwood 009999 Steve Ellwood Green, (no other) 2 months
        //
        //[11:20 AM]  
        //Shaquil Timmons 3943769 Shaquil Timmons brown 11
        //
        //[11:21 AM]  
        //343769
        //
        //[11:22 AM]  
        //Karen R 001449 Karen Reiter blue 10
        //
        //[11:22 AM]  
        //Dax R 267252 Dax Richards brown
        //
        //[11:23 AM]  
        //Dax Richards - 12 months
        //
        //[11:25 AM]  
        //Greg Doud @channel I’ve updated the assignment with a few of the details we talked about.
        //
        //[11:26 AM]  
        //Michael S 229949 Mike Sykes Brown 13 months
        //
        //[11:26 AM]  
        //Daniel K 772223, Daniel Kiros Brown, 3
        //
        //new messages
        //[12:00 PM]  
        //Peter Choi 004444, Peter Choi, Brown, 2
        //
        //[12:12 PM]  
        //Joseph Hill 005255, Joe Hill, Brown, 13
        //
        //[12:33 PM]  
        //Reuben Turner is anyone else getting an error with a few people's ID numbers?
        //
        //[12:33 PM]  
        //Kyle Deen Use a string for the id
        //
        //[12:35 PM]  
        //Greg Doud Yes. The `id` is a string.
        //
        //[12:35 PM]  
        //Reuben Turner thanks
        //
        //[12:49 PM]  
        //Joshua Franey Can the people that haven't posted their info do so please?
        //
        //[12:50 PM]  
        //Stephen R I think that is everyone except Jarrett
        //
        //[12:50 PM]  
        //Reuben Turner Evan hasn't posted
        //
        //[12:50 PM]  
        //Stephen R Oops
        //
        //[12:51 PM]  
        //Evan T 008888 Evan Tizard Brown 12
        
            // TODO Auto-generated method stub
            
        }

//List<Country> l = new ArrayList<Country>();
//l.add(Country.USA); // That one's for you Code Monkey :)