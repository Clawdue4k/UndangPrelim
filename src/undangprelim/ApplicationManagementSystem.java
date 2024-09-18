package undangprelim;



import java.util.ArrayList;
import java.util.Scanner;

class Application {
private int id;
private String name;
private double gpa;
private double familyIncome;
private int serviceHours;


public Application(int id, String name, double gpa, double familyIncome, int serviceHours) {
this.id = id;
this.name = name;
this.gpa = gpa;
this.familyIncome = familyIncome;
this.serviceHours = serviceHours;
}


public int getId() {
return id;
}

public String getName() {
return name;
}

public double getGpa() {
return gpa;
}

public double getFamilyIncome() {
return familyIncome;
}

public int getServiceHours() {
return serviceHours;
}
}

public class ApplicationManagementSystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
ArrayList<Application> applicationList = new ArrayList<>();


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


Application application = new Application(id, name, gpa, familyIncome, serviceHours);
applicationList.add(application);
}


System.out.println("\nID\tName\t\tGPA\tAnnual Family income\tCommunity Service Hours");
for (Application application : applicationList) {
System.out.printf("%d\t%-10s\t%.1f\t%.0f\t\t\t%d\n",
application.getId(), application.getName(), application.getGpa(), application.getFamilyIncome(), application.getServiceHours());
}
}
}