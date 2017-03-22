/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electivesubject;

import java.util.LinkedList;

/**
 *
 * @author vinay
 */

public class Subject {
    private String name;
    private byte id;
    private int deptId;
    private Short year;
    private int maxCap, currCap, currPrior;
    public  LinkedList<Student> allocatedStudent;
    public Subject(String name, int deptId, byte id, int maxCap, short year) {
        currCap = 0;
        currPrior = 0;
        this.name = name;
        this.deptId = deptId;
        this.id = id;
        this.year = year;
        this.maxCap = maxCap;
        allocatedStudent = new LinkedList<Student>();
    }
    public void setCurrPrior(int t) {
        currPrior = t;
    }
    public byte getId () {
        return id;
    }
    public String getName () {
        return name;
    }
    public int getDept () {
        return deptId;
    }
    public int getMaxCap () {
        return maxCap;
    }
    public int getCurrPrior(){
        return currPrior;
    }
    public int getCurrCap(){
        return currCap;
    }
    public Short getYear() {
        return year;
    }
}
