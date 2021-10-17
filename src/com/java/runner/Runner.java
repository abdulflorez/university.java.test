package com.java.runner;

import com.java.data.*;

import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class Runner<menu, isMenuOn> {
    public static void main(String[] args) {

        University unal = new University();

        unal.setAddFullTimeProfessor("Carlos Sanchez", 1500, 5);
        unal.setAddFullTimeProfessor("Alejandro Jimenez", 1500, 8);
        unal.setAddFullTimeProfessor("Juan Perez", 1300, 2);
        unal.setAddPartTimeProfessor("Nestor Delgado", 1300, 24);
        unal.setAddPartTimeProfessor("David Pinzon", 1300, 12);
        unal.setAddPartTimeProfessor("Juan Carlos Serna", 1300, 18);

        unal.setAddStudent("Rosio Linares", 21);
        unal.setAddStudent("Juan Perez", 17);
        unal.setAddStudent("Pablo Osorio", 18);
        unal.setAddStudent("Luis Lopez", 25);
        unal.setAddStudent("Juan Lopez", 23);
        unal.setAddStudent("Carlos Delgadillo", 20);
        unal.setAddStudent("Pedro Cardenas", 17);
        unal.setAddStudent("Maria Jimenez", 18);
        unal.setAddStudent("Luz Echeverry", 19);
        unal.setAddStudent("Luisa Quesada", 19);

        unal.setAddCourse("Algebra", unal.getProfessorsList().get(0),1010);
        unal.setAddCourse("Algebra 2", unal.getProfessorsList().get(2),1020);
        unal.setAddCourse("Calculo", unal.getProfessorsList().get(1),1030);
        unal.setAddCourse("Fisica", unal.getProfessorsList().get(5),1040);
        unal.setAddCourse("Ingles", unal.getProfessorsList().get(3),1050);
        unal.setAddCourse("Algebra", unal.getProfessorsList().get(4),1060);

        unal.setAddStudentToCourse(1,1);
        unal.setAddStudentToCourse(1,2);

        unal.setAddStudentToCourse(2,3);
        unal.setAddStudentToCourse(2,4);

        unal.setAddStudentToCourse(3,5);
        unal.setAddStudentToCourse(3,6);

        unal.setAddStudentToCourse(4,7);
        unal.setAddStudentToCourse(4,8);

        unal.setAddStudentToCourse(5,9);
        unal.setAddStudentToCourse(5,10);

        unal.setAddStudentToCourse(6,5);
        unal.setAddStudentToCourse(6,7);

        boolean isMenuOn = true;

        while(isMenuOn) {
            System.out.println("Type one of the following option:" +
                    "\n1.Professors List" +
                    "\n2.Hire Professor" +
                    "\n3.Courses Data" +
                    "\n4.Create Courses" +
                    "\n5.Students List" +
                    "\n6.Student data" +
                    "\n7.Enroll Student" +
                    "\n0.Exit");

            Scanner scan = new Scanner(System.in);
            int menuOption = scan.nextInt();
            switch (menuOption){
                case 1:
                    for (Professor element: unal.getProfessorsList()) {
                        System.out.println(element.toString());
                    }
                    break;
                case 2:
                    boolean subMenu1 = true;
                    while (subMenu1){
                        System.out.println(
                                "Select the type of Professor:" +
                                "\n1.Full Time" +
                                "\n2.Part Time" +
                                "\n0.Return"
                        );
                        Scanner subMenuScan1 = new Scanner(System.in);
                        int subMenuOptions1 = subMenuScan1.nextInt();
                        switch (subMenuOptions1){
                            case 1:
                                Scanner subMenuScan1__FullTime = new Scanner(System.in);
                                System.out.println("Type the first name and last name of new Professor:");
                                String nameFullTime = subMenuScan1__FullTime.nextLine();
                                System.out.println("Type the base Salary:");
                                float baseSalaryFullTime = subMenuScan1__FullTime.nextFloat();
                                System.out.println("Type the years of experience");
                                int yearOfExperienceFullTime = subMenuScan1__FullTime.nextInt();

                                unal.setAddFullTimeProfessor(nameFullTime,baseSalaryFullTime,yearOfExperienceFullTime);

                                System.out.println(
                                        "Professor" +
                                        unal.getProfessorsList().get(unal.getProfessorsList().size()-1).getName() +
                                        "successfully added"
                                );
                                break;
                            case 2:
                                Scanner subMenuScan1__PartTime = new Scanner(System.in);
                                System.out.println("Type the first name and last name of new Professor:");
                                String namePartTime= subMenuScan1__PartTime.nextLine();
                                System.out.println("Type the base Salary:");
                                float baseSalaryPartTime = subMenuScan1__PartTime.nextFloat();
                                System.out.println("Type the hours to work per week");
                                int activeHoursPerWeekPartTime = subMenuScan1__PartTime.nextInt();

                                unal.setAddPartTimeProfessor(namePartTime, baseSalaryPartTime, activeHoursPerWeekPartTime);

                                System.out.println(
                                        "Professor" +
                                        unal.getProfessorsList().get(unal.getProfessorsList().size()-1).getName() +
                                        "successfully added"
                                );
                            break;
                            case 0:
                                subMenu1 = false;
                                break;
                        }
                    }
                    break;
                case 3:
                    boolean subMenu2 = true;

                    while (subMenu2){
                        System.out.println("Select the course to show:");
                        for (int i=1; i <=unal.getCoursesList().size(); i++) {
                            System.out.println(i + "." + unal.getCoursesList().get(i-1).getName());
                        }
                        System.out.println("0.Return");

                        Scanner subMenuScan2 = new Scanner(System.in);
                        int subMenuOption2 = subMenuScan2.nextInt();

                        if(subMenuOption2 > 0 && subMenuOption2 <= unal.getCoursesList().size()){
                            unal.getCoursesList().get(subMenuOption2 - 1).toString();
                            for (Student element: unal.getCoursesList().get(subMenuOption2-1).getStudentList()) {
                                System.out.println(element.toString());
                            }
                        } else if(subMenuOption2 == 0){
                            subMenu2 = false;
                        } else {
                            System.out.println("Type a valid option");
                        }
                    }
                    break;
                case 4:
                    boolean subMenu3 = true;
                    while (subMenu3){
                        Scanner subMenuScan3 = new Scanner(System.in);
                        System.out.println(
                                "Select the option:" +
                                "\n1.Create Course" +
                                "\n2.Add Student to Course" +
                                "\n0.Return"
                        );
                        int subMenuOption3 = subMenuScan3.nextInt();
                        switch (subMenuOption3){
                            case 1:
                                Scanner subMenuScan3__createCurse = new Scanner(System.in);
                                System.out.println("Type the name of the new course");
                                String nameOfCourse = subMenuScan3__createCurse.nextLine();
                                System.out.println("Type the id of Professor to assign");
                                int professorId = subMenuScan3__createCurse.nextInt();
                                System.out.println("Type the ClassRoom to assign");
                                int classRoom = subMenuScan3__createCurse.nextInt();
                                unal.setAddCourse(
                                        nameOfCourse,
                                        unal.getProfessorsList().get(professorId-1),
                                        classRoom
                                );
                                break;
                            case 2:
                                Scanner subMenuScan3__addStudent = new Scanner(System.in);
                                System.out.println("Type the id of Student to add");
                                int studentId = subMenuScan3__addStudent.nextInt();
                                System.out.println("Insert ID of the course for the student to be added");
                                int courseId = subMenuScan3__addStudent.nextInt();
                                if (studentId > 0 && courseId > 0 && studentId <= unal.getStudentsList().size() && courseId <= unal.getCoursesList().size()) {
                                    unal.setAddStudentToCourse(courseId, studentId);
                                    System.out.println(
                                            "Student\n" +
                                            unal.getCoursesList().get(courseId).getStudentList().get(studentId).toString() +
                                            "\nsuccessfully added"
                                    );
                                } else{
                                    System.out.println("Type a valid option");
                                }
                                break;
                            case 0:
                                subMenu3 = false;
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }

                    }
                    break;
                case 5:
                    for (Student element: unal.getStudentsList()) {
                        System.out.println(element.toString());
                    }
                    break;
                case 6:
                    Scanner subMenu4 = new Scanner(System.in);
                    System.out.println("Type the Student ID to find, (data and enrolled courses)");
                    int studentId = subMenu4.nextInt();
                    if(studentId > 0 && studentId <= unal.getStudentsList().size()){
                        System.out.println(unal.getStudentsList().get(studentId - 1).toString());
                        System.out.println("The Student: " + unal.getStudentsList().get(studentId - 1).getName() + "is enrolled in the follow courses");
                        for (Course element: unal.getCoursesList()){
                            for (Student subElement: element.getStudentList()){
                                if(studentId == subElement.getId()){
                                    System.out.println(element.toString());
                                }
                            }
                        }
                    } else{
                        System.out.println("Type a valid ID or check it the menu option 5 in \"Students List\" ");
                    }
                    break;
                case 7:
                    Scanner subMenu5 = new Scanner(System.in);
                    System.out.println("Type the name of new Student");
                    String nameStudent = subMenu5.nextLine();
                    System.out.println("Type the age of new Student");
                    int ageStudent = subMenu5.nextInt();
                    unal.setAddStudent(nameStudent, ageStudent);
                    System.out.println(
                            "NEW STUDENT\n" +
                            unal.getStudentsList().get(unal.getStudentsList().size()).getName() +
                            "\nsuccessfully added"
                    );
                    break;
                case 0:
                    System.out.println(
                            "____________"+
                            "\nGood Bye"+
                            "____________"
                    );
                    isMenuOn = false;
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}