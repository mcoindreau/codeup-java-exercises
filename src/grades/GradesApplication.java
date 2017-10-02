package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();

        students.put("mcoindreau", new Student("mcoindreau"));
        students.get("mcoindreau").addGrade(100);
        students.get("mcoindreau").addGrade(90);
        students.get("mcoindreau").addGrade(85);

        students.put("tmash", new Student("tmash"));
        students.get("tmash").addGrade(99);
        students.get("tmash").addGrade(89);
        students.get("tmash").addGrade(84);

        students.put("pugman", new Student("pugman"));
        students.get("pugman").addGrade(98);
        students.get("pugman").addGrade(88);
        students.get("pugman").addGrade(83);

        students.put("baller", new Student("baller"));
        students.get("baller").addGrade(97);
        students.get("baller").addGrade(87);
        students.get("baller").addGrade(82);


        System.out.println("Welcome!\n\n" +
                "Here are the github usernames of our students:\n");
//                students.get(students) +

        String proceedCont;

        do {
            for (String userName : students.keySet()) {
                System.out.println("Username " + userName);
            }
            String userInput = input.getString("\n" + "Enter a username: ");
            if (students.containsKey(userInput)) {
                // .get returns the value associated with students
                System.out.println("Student's Name: " + students.get(userInput).getName());
                System.out.println("Student's GPA is " + students.get(userInput).getGradeAverage());
            } else {
                // This prompts when the user inputs an invalid name
                System.out.println("That is not a current student");
            }
            //keepGoing brings the prompt to continue by typing the letter y or yes
            proceedCont = input.getString("Would you like to continue? ");
        } while (proceedCont.equalsIgnoreCase("y")
                || (proceedCont.equalsIgnoreCase("yes")));
        System.out.println("Goodbye !");
    }
}
