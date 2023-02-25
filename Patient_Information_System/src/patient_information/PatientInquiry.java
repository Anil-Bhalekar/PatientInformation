package patient_information;

import java.util.Scanner;

public class PatientInquiry {

	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);

        int id, usr;
        store ob = new store();

        do {
            System.out.println("=======================MENU==========================");
            System.out.println("ENTER 1 FOR ADDING DETAIL");
            System.out.println("ENTER 2 FOR SEARCHING");
            System.out.println("ENTER 3 FOR DELETION");
            System.out.println("ENTER 4 FOR UPDATION");
            System.out.println("ENTER 5 TO EXIT");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Any Choice");
                    usr = sc.nextInt();
                    ob.add(usr);
                    break;
                case 2:
                    ob.search();
                    break;
                case 3:
                    ob.delete();
                    break;
                case 4:
                    ob.update();
                    break;
                case 5:
                    System.exit(0);
            }

            System.out.println("press any key other than 5 to do more operations else press 5 to exit");
            id = sc.nextInt();
        } while (id != 5);

    }
}

abstract class student {

    protected String name[];
    protected int id[];

    abstract void display();
}

class store extends student {

   int usr;

    Scanner s = new Scanner(System.in);
    int i = 0, c = 0, r = 0;

    store() {
        id = new int[10];
        name = new String[10];
    }

    public void add(int usr) {
        this.usr = usr;
        for (i = 0; i < usr; i++) {
            System.out.println("Enter name and id");
            name[i] = s.next();
            id[i] = s.nextInt();

        }
        display();

    }

    public void search() {

        System.out.println("Enter the roll no you want to search");
        r = s.nextInt();
        for (i = 0; i < id.length; i++) {
            if (id[i] == r) {
                break;
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("---DETAILS OF THE SPECIFIED PATIENT IS---");
        System.out.println("NAME         ID ");
        System.out.print(name[i]+"         ");
        System.out.print(id[i]);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");    
       

    }

    public void delete() {
        System.out.println("Enter the rollno to be deleted");
        r = s.nextInt();

        for (i = 0; i < id.length; i++) {
            if (id[i] == r) {
                id[i] = 0;
                name[i] = " ";
            }
        }
        display();

    }

    public void update() {
        System.out.println("Enter the id to be updated");
        r = s.nextInt();

        for (i = 0; i < id.length; i++) {
            if (id[i] == r) {
                System.out.println("Enter the new name and id");
                name[i] = s.next();
                id[i] = s.nextInt();
            }
        }
        display();
    }

    @Override
    void display() {
        System.out.println("----THE UPDATED RECORDS OF PATIENT ARE----");
        System.out.println("NAME        ID");
        for (i = 0; i < id.length; i++) {
            if(id[i]!=0)
            {              
            System.out.print(name[i]+"         ");
            System.out.print(id[i]);
            System.out.println(" ");
            }
        }

	}

}
