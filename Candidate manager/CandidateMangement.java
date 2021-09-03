
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NA
 */
public class CandidateMangement {
   List<Candidate> list = new ArrayList<>();
   public CandidateMangement(List<Candidate> list){
       this.list=list;
   }
   Validation v = new Validation();
    public static void menu(){
        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1.	Experience");
        System.out.println("2.	Fresher");
        System.out.println("3.	Internship");
        System.out.println("4.	Searching");
        System.out.println("5.	Exit");
    }
    
    public void displayAll() {
        Collections.sort(list, new Comparator<Candidate>() {
            @Override
            public int compare(Candidate o1, Candidate o2) {
                return o1.getType() - o2.getType();
            }
        });
        int check = 0;
        System.out.println("==========Experinence==========");
        for (Candidate o : list) {
            if (o.getType() == 0 && check == 0) {
                check = 1;
            }

            if (o.getType() == 1 && check == 1) {
                System.out.println("==========Fresher==========");
                check = 2;
            }

            if (o.getType() == 2 && check == 2) {
                System.out.println("==========Intern==========");
            }
            System.out.println(o.getFirsName() + " " + o.getLastName());
        }
    }
public void addCandidate(int type) {

        switch (type) {
            case 0:
                Experience E = new Experience();
                E.create(list);
                list.add(E);
                break;
            case 1:
                Fresher f = new Fresher();
                f.create(list);
                list.add(f);
                break;
            case 2:
                Intern I = new Intern();
                I.create(list);
                list.add(I);
                break;
        }
    }

    public void search() {
        String inputSearch = v.getString("Input Candidate name (First name or Last name):", "[a-zA-Z ]+");
        int type = v.getInt("Input type of candidate: ", "Type [0-2]", 0, 2);
        boolean check = true;
        for (Candidate o : list) {
            if (o.getType() == type) {
                String fullName = o.getFirsName().toLowerCase() + " " + o.getLastName().toLowerCase();
                if (fullName.contains(inputSearch.toLowerCase())) {
                    System.out.println(o);
                    check = false;
                }
            }
        }
        if (check) {
            System.out.println("Not Found");
        }
        //do something
    }


    public static void main(String[] args) {
        List<Candidate> list = new ArrayList<>();
         CandidateMangement cm = new  CandidateMangement(list);
        list.add(new Fresher(2, "Le", "Nhat Minh", 2001,
                "Thanh Hoa", "0385739160", "minhln@gmail.com", 1, 2019, "Good", "FPT"));
        list.add(new Intern(3, "Le", "Minh Nghia", 2001,
                "Thanh Hoa", "123456789", "nghia@gmail.com", 2, "KTPM", 3, "FPT"));
        list.add(new Experience(1, "Le", "Hong Quan", 1999,
                "Thanh Hoa", "0866823499", "quanlhhe130736@fpt.edu.vn", 0, 10, "Dev"));
        list.add(new Experience(4, "Le", "Van Quan", 1999,
                "Thanh Hoa", "0866823499", "quanlhhe130736@fpt.edu.vn", 0, 10, "Dev"));
        cm.displayAll();
         Validation v = new Validation();
        while (true) {
            menu();
            int option = v.getInt("Enter your option[1-5]: ", "Option[1-5]", 1, 5);
            switch (option) {
                case 1:
                    cm.addCandidate(0);
                    v.checkYesNo(cm, 0);
                    break;
                case 2:
                    cm.addCandidate(1);
                    v.checkYesNo(cm, 1);
                    break;
                case 3:
                    cm.addCandidate(2);
                    v.checkYesNo(cm, 1);
                    break;
                case 4:
                    cm.displayAll();
                    cm.search();
                    break;
                case 5:
                    System.exit(0);

            }
        }
    }

}
