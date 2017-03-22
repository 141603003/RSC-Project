/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electivesubject;

import static java.lang.Math.abs;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author vinay
 */

public class Global {
    public static LinkedList <LinkedList[]> deptList;
    public static LinkedList <Student>[] notFilledForm;
    public static LinkedList<Subject> subjectArray;
    public static Student studentCandidate;
    public static LinkedList <Subject> subjectConsidered;
    public static LinkedList<Student>[] cgpaList;
   public static int nextCount = 0;
    public static int priority[];
    public static boolean errorFlag = false;
    public static LinkedList<JTextField> jtextfieldArray;
    public Global() {
        subjectConsidered = new LinkedList<Subject>();
        notFilledForm = new LinkedList[3];
        cgpaList = new LinkedList[3];
        deptList = new LinkedList<LinkedList[]>();
        subjectArray = new LinkedList<Subject>();
        priority = new int[20];
        for(int q = 0; q <= 9; q++) {
            
            LinkedList[] array;
            array = new LinkedList[3];
            LinkedList<Student> sy = new LinkedList<Student>();
            LinkedList<Student> ty = new LinkedList<Student>();
            LinkedList<Student> btech = new LinkedList<Student>();
            array[0] = sy;
            array[1] = ty;
            array[2] = btech;
            deptList.addLast(array);
            
        }
        for(int p =0; p <=2; p++)
            cgpaList[p] = new LinkedList<Student>();
    }
    public static void addIntoDeptList(int i, Student studObj, int mis){
        String misStr = Integer.toString(mis);
        int deptId = Integer.parseInt(misStr.substring(4, 6));
        if(deptId > 10) {
            System.out.println("DEpt id prob : "+ deptId);
            return;
        }
        int start = Integer.parseInt(misStr.substring(0, 2));
        if((start != 11) && (start!= 14) ) {
            System.out.println("start id prob : "+ start);
            return;
        }
        int year = Integer.parseInt(misStr.substring(2, 4));
        if(start == 11) {
            if(year != 15 - i) {
               System.out.println("year id prob : "+ year); 
               return;
            }
        }
        if(start == 14) {
            if(year != 16 - i) {
               System.out.println("year id prob : "+ year); 
               return;
            }
        }
        /*Till here valid*/
        LinkedList ll[];
        ll = deptList.get(deptId);
        if(start == 11) {
            ll[Math.abs((year - 15))].addLast(studObj);
           
        }
        if(start == 14) {
            ll[Math.abs((year - 16))].addLast(studObj);
           
        }
        System.out.println("Added at deptId "+ deptId+", "+Math.abs((year - 15))+",or"+((year - 16))+"\n");
    }
    public static void addIntoCGPAList(int year, Student studObj, float cgpa) {
        if(cgpaList[year].isEmpty()) {
            cgpaList[year].addLast(studObj);
            return;
        }
        int i = 0;
        for(Student temp : cgpaList[year]) {
            
           if(temp.getCGPA() < cgpa){
               cgpaList[year].add(i, studObj);
               return;
           }
           i++;
        }
        cgpaList[year].addLast(studObj);
    }
    public static void printList() {
        
    }
}
