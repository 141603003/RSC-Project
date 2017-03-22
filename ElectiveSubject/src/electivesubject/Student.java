/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electivesubject;

/**
 *
 * @author vinay
 */
public class Student {
    private int mis;
    private float cgpa;
    private byte pl[];
    public Student(int mis, float cgpa) {
        this.mis = mis;
        this.cgpa = cgpa;
        this.pl = null;
    }
    public int getMis() {
        return mis;
    }
    public float getCGPA() {
        return cgpa;
    }
    public byte[] getPriorityList() {
        return pl;
    }
    public void setPriorityList(byte[] arr) {
        this.pl = arr;
    }
}
