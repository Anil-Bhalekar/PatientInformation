package patient_information;

import java.util.Scanner;

public class Patient {

	    int id;
	    String name;
	    int  Age;
	   //String Gender;
	    String address;
	    Double fee;

	 /*  static {

	        String Hospital_name = "Witshaper";
	    }*/

	    Patient() {

	    }

	    Patient Add(int l) {
	    	Patient pt = new Patient();
	        if (l > 1000) {
	            System.out.println(" over flow");
	        } else {
	            try {System.out.println("--------------------------");
	                Scanner sc = new Scanner(System.in);
	                System.out.println(" Enter Id :");
	                pt.id = sc.nextInt();
	                System.out.println(" Enter name :");
	                pt.name = sc.next();
	                System.out.println(" Enter Age :");
	                pt.Age = sc.nextInt();
	               // System.out.println(" Enter Gender :");
	             //  pt.Gender = sc.findInLine(Gender);
	                System.out.println(" Enter Address :");
	                pt.address = sc.next();         
	                System.out.println(" Enter fee :");
	                pt.fee = sc.nextDouble();

	            } catch (Exception e) {
	                System.out.println(e);
	                e.getMessage();

	            }
	        }
	        return (pt);
	    }

	    void search(int id, int l, Patient s[]) {
	        for (int i = 0; i < l; i++) {
	            if (s[i].id == id) {
	                s[i].display(s[i]);
	            }
	        }
	    }

	    boolean delete(int id,Patient pt[], int l) {
	        boolean t = false;
	        for (int i = 0; i < l; i++) {
	            if (id == pt[i].id) {
	                for (int j = i; j < l - 1; j++) {
	                    pt[j] = pt[j + 1];
	                }
	               
	                t = true;
	                return (t);
	            }

	        }

	        return (t);
	    }

	    boolean update(int id,Patient obj[], int l) {
	        boolean t = false;

	        for (int i = 0; i < l; i++) {
	            if (id == obj[i].id) {
	                try {System.out.println("--------------------------");
	                    Scanner sc = new Scanner(System.in);
	                    System.out.println(" Enter name :");
	                    obj[i].name = sc.next();
	                    System.out.println(" Enter Age :");
	                    obj[i].Age = sc.nextInt();
	                   // System.out.println(" Enter Gender :");
	                    //obj[i].Gender = sc.findInLine(Gender);
	                    System.out.println(" Enter Address :");
	                    obj[i].address = sc.next();
	                    System.out.println(" Enter fee:");
	                    obj[i].fee = sc.nextDouble();

	                    t = true;
	                    return (t);
	                } catch (Exception e) {
	                    System.out.println(e);
	                    e.getMessage();

	                }
	            }

	        }

	        return (t);

	    }

	    void display(Patient s) {
	        System.out.println("--------------------------");
	        System.out.println(" rollno. :" + s.id);
	        System.out.println("  name :" + s.name);
	        System.out.println("  name :" + s.Age);
	       // System.out.println("  name :" + s.Gender);
	        System.out.println(" Address :" + s.address);
	        System.out.println(" course :" + s.fee);
	       
	    }

	    void show(int l,Patient s[]) {
	        for(int i=0;i<l;i++){
	         System.out.println("--------------------------");
	         System.out.println(" id.    :" + s[i].id);
	         System.out.println(" Name       :" + s[i].name);
	         System.out.println(" Age       :" + s[i].Age);
	        //System.out.println(" Gender       :" + s[i].Gender);
	         System.out.println(" Address    :" + s[i].address);
	         System.out.println(" Fee     :" + s[i].fee);
	        
	        }
	    }

	    public static void main(String args[]) {
	    	Patient obj[] = new Patient[1000];
	        Scanner sc = new Scanner(System.in);
	        boolean f = true;
	        int choice;
	        int l = 0;
	        int r;
	        Patient pt = new Patient();

	        do {
	            try {System.out.println("+++++++++++++++++++= WELCOME Patient Application ++++++++++++++++++++++++");
	                System.out.println(" Enter your choice ");
	                System.out.println("1) ......Add");
	                System.out.println("2).......Delete");
	                System.out.println("3).......Search");
	                System.out.println("4).......Update");
	                System.out.println("5).......Display");
	                choice = sc.nextInt();
	                try {
	                    switch (choice) {
	                        case 1:
	                            obj[l] = pt.Add(l);

	                            l++;
	                            break;
	                        case 2:
	                            System.out.println(" Enter id. for deletion ");
	                            r = sc.nextInt();
	                            boolean b = pt.delete(r, obj, l);
	                            if (b = true) {l--;
	                                System.out.println("Successfully deleted");
	                            } else {
	                                System.out.println(" id. not found");
	                            }
	                            break;
	                        case 3:
	                            System.out.println(" Enter id. to search patient ");
	                            r = sc.nextInt();
	                            pt.search(r, l, obj);
	                            break;
	                        case 4:
	                            System.out.println(" Enter id. for update");
	                            r = sc.nextInt();
	                            boolean c = pt.update(r, obj, l);
	                            if (c = true) {
	                                System.out.println("Successfully updated");
	                            } else {
	                                System.out.println(" id. not found");
	                            }
	                            break;
	                        case 5:
	                            pt.show(l,obj);
	                        default:
	                            System.out.println(" Enter right choice");

	                    }
	                } catch (Exception m) {
	                    System.out.println(m);
	                }

	            } catch (Exception e) {
	                System.out.println(e);
	            }

	           // System.out.println(" want to do more ... true/false");
	            //f = sc.nextBoolean();

	        } while (f);

	    }
}
