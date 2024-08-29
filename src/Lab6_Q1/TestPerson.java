/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_Q1;

import java.util.Date;

/**
 *
 * @author SIOW HAN BIN
 */
public class TestPerson {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "1234 Street", "123-456-7890", "john@example.com", Student.Status.SENIOR);
        Faculty faculty = new Faculty("Jane Smith", "5678 Avenue", "098-765-4321", "jane@example.com", "Room 101", 50000, new Date(), "9am-5pm", "Professor");
        FullTime fullTime = new FullTime("Alice Johnson", "9101 Drive", "321-654-9870", "alice@example.com", "Room 102", 70000, new Date(), "Manager");
        partTime partTime = new partTime("Bob Brown", "1213 Lane", "654-321-0987", "bob@example.com", "Room 103", 20, new Date(), "Assistant", 25);

        System.out.println(student);
        System.out.println(faculty);
        System.out.println(fullTime);
        System.out.println(partTime);
        System.out.println("Part-time earnings: RM" + partTime.calcEarn());
    }
}