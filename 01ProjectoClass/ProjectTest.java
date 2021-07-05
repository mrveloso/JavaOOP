public class ProjectTest{
    public static void main (String[] args){
        // create four projects in four different ways
        Project project = new Project();
        Project project2 = new Project("Second Project");
        Project project3 = new Project("Third Project", "This is the project's description.");
        Project project4 = new Project("Fourth Project", 25000, "Expensive project!"); 
        
        //creates a new portf.
        Portfolio portfolio = new Portfolio();

        //set the name, desc, and initialcost of the first project
        project.setName("My First project");
        project.setDescription("This is an awesome description.");
        project.setInitialCost(400);
        
        //add all four projects to the portfolio
        portfolio.addProject(project);
        portfolio.addProject(project2);
        portfolio.addProject(project3);
        portfolio.addProject(project4);
        
        //shows info of all projects in portfolio and the porfolios total cost
        portfolio.showPortfolio();
    }
}    