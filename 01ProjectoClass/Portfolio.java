import java.util.ArrayList;

public class Portfolio {
    // creates a new arraylist of project objects
    ArrayList<Project> projects = new ArrayList<>();
    // add a project object to the projects arraylist
    public void addProject(Project project) {
        this.projects.add(project);
    }
    // sums up and return the initialcost of all the project objects in the portfolio arraylist of project objects
    public double getPortfolioCost() {
        double cost = 0;
        for(Project project: this.projects){
            cost += project.getInitialCost();
        }
        return cost;
    }
    // prints the elevatorpitch for all project objects in the portfolio arraylist then prints the cost of the entire portfolio
    public void showPortfolio(){
        System.out.println("Portfolio Projects:");
        for (Project project: this.projects){
            project.elevatorPitch();
        }
        System.out.println("Portfolio Cost: $"+getPortfolioCost());
    }
}