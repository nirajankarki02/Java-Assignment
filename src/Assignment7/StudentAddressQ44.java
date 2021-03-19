package Assignment7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentAddressQ44 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name to read/write: " );
        String filename = input.nextLine();
        //Write to file
        List<Student> studentList = readInfo(input);
        write(studentList, filename);
        //Read from file
        List<Student> listFrmFile = read(filename);
        for(Student s: listFrmFile) {
            System.out.println(s.getName() + " : " + s.getAddress());
        }
        //Search Name
        System.out.print("Enter name to search: " );
        String name = input.nextLine();
        String add = searchAddress(filename,name);
        if(add!=null) {
            System.out.println("The address of Student " + name + " is " + add + ".");
        }
        else {
            System.out.println("There is no record of Student with name " + name +".");
        }

    }

    //Get Information from User
    private static List<Student> readInfo(Scanner input){
        int numStudent = 10;

        List<Student> studentList = new ArrayList<>();
        for (int i = 1; i < numStudent; i++){
            System.out.println("Enter name of the Student: ");
            String name = input.nextLine();

            System.out.println("Enter Address of  "+ name + " :  ");
            String address = input.nextLine();

            Student info = new Student (name, address);
            studentList.add(info);

        }
        return studentList;
    }

    //Write Information received in a file
    private static void write(List<Student> infoStudent, String filename){
        File file = new File(filename);

        try (FileWriter fw = new FileWriter(file, false)) {
            for (Student s : infoStudent) {
                fw.write(s.getName() + " : " + s.getAddress() + "\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static List<Student> read(String filename){
        List<Student> studentList = new ArrayList<>();

        File file = new File(filename);
        try (
                FileReader reader = new FileReader(file);
                BufferedReader bufferreader = new BufferedReader(reader)
        ) {

            String line;
            while ((line = bufferreader.readLine()) != null) {
                String[] studentRec = line.split(":");
                String name =  studentRec[0].strip();
                String address=  studentRec[1].strip();
                Student info = new Student(name, address);
                studentList.add(info);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return studentList;
    }

    //Search Address of the Student
    public static String searchAddress(String filename, String name){
        List <Student> studentList = read(filename);

        for(Student s: studentList){
            if (name.toLowerCase().equals(s.getName().toLowerCase())){
                return s.getAddress();
            }
        }
        return null;
    }

    static class Student {
        private String name;
        private String address;

        Student(String name, String add) {
            this.name = name;
            this.address = add;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

}
