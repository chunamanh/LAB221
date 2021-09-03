package TaskManager_71_150loc;

import java.util.ArrayList;
import java.util.Date;

public class TaskManagement {
    ArrayList<Task> list = new ArrayList<>();
    Validate v = new Validate();
    public void mainMenu() {
        System.out.println("1. Add task");
        System.out.println("2. Delete task");
        System.out.println("3. Show task");
        System.out.println("4. Exit");
        int choice = v.getChoice("Enter your choice: ");
        switch (choice) {
            case 1:
                addTask();
                break;
            case 2:
                deleteTask();
                break;
            case 3:
                display();
                break;
            case 4:
                System.exit(0);
        }
    }

    public void addTask() {
        int id;
        if (list.isEmpty()) {
            id = 1;
        } else {
            id = list.get(list.size() - 1).getId() + 1;
        }
        String name = v.getText("Enter name: ");
        int typeid = v.getChoice("Input type id: ");
        String date = v.getDate();
        double from = v.getFrom();
        double to = v.getTo(from);
        String assign = v.getText("Input assignee: ");
        String reviewer = v.getText("Input reviewer: ");
        Task t = new Task(id, name, typeid, date, from, to, assign, reviewer);
        list.add(t);
    }

    public void deleteTask() {
        boolean check = false;
        int id = v.getID();
        for (Task t : list) {
            if (t.getId() == id) {
                check = true;
                list.remove(t);
                System.out.println("Remove successfully");
                break;
            }
        }
        if (check == false) {
            System.out.println("not found");
        }
    }

    public void display() {
        System.out.println("---------------------------------------------display all---------------------------------------------");
        for(Task t: list){
            System.out.println(t);
        }
    }

}
