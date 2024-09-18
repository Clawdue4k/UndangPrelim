
import java.util.ArrayList;
import java.util.Scanner;


public class UndangPrelim {

    
    public class ApplicationsManagementSystem {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    ArrayList<Applicants> applicationList = new ArrayList<>();


    System.out.print("Enter number of Applications: ");
    int numberOfApplications = scanner.nextInt();


    for (int i = 1; i <= numberOfApplications; i++) {
    System.out.println("\nEnter details of Application: " + i);

    System.out.print("Id: ");
    int id = scanner.nextInt();
    scanner.nextLine(); 
       System.out.print("Name: ");
    String name = scanner.nextLine();

    System.out.print("GPA: ");
    double gpa = scanner.nextDouble();

    System.out.print("Annual Family income: ");
    double familyIncome = scanner.nextDouble();

    System.out.print("Community Service Hours: ");
    int serviceHours = scanner.nextInt();


    Applications application = new Applications(id, name, gpa, familyIncome, serviceHours);
    applicationList.add(application);
    }


    System.out.println("\nID\tName\t\tGPA\tAnnual Family income\tCommunity Service Hours");
    for (Applications application : applicationList) {
    System.out.printf("%d\t%-10s\t%.1f\t%.0f\t\t\t%d\n",
    application.getId(), application.getName(), application.getGpa(), application.getFamilyIncome(), application.getServiceHours());
        }
        }
    }