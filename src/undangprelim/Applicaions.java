

package undangprelim;


public class Applicaions {
    
    int id;
    String name;
    double gpa;
    double familyIncome;
    int serviceHours;
    
    public void addApplication(int id, String name, double gpa, double familyIncome, int serviceHours){
        
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.familyIncome = familyIncome;
        this.serviceHours = serviceHours;
    }
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getGPA(){
        return gpa;
    }
    public double getFamilyIncome(){
        return familyIncome;
    }
    public int getServiceHours(){
      return serviceHours;  
    }
}

