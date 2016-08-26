package ssa;

import java.util.ArrayList;
import java.util.Collections;

public class ClassRoster {
    String[] people = {"Evan", "Jarrett", "Karen", "Shaq", "Aisha", "Dan","Kevin", "Joe", "Li", "Steve", "Stephen", "Pete","MikeC","Groovin","Dax","Arun", "Bart","Josh", "Cartman", "Gab","Kyle","Jon"};
    
    ArrayList<String> classmates;
        int count;
        ClassRoster(){
            classmates = new ArrayList<String>();
            this.count = 0;
        }
        private void classRosterReport() {
            for (int i=0; i<people.length-1;i++){
                classmates.add(people[i]);
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
        
            // TODO Auto-generated method stub
            
        }

//List<Country> l = new ArrayList<Country>();
//l.add(Country.USA); // That one's for you Code Monkey :)