import java.util.Locale;

public class App {
    //main menu options
    private static final String MAIN_MENU_OPTION_CREATE_NEW_EMPLOYEE = "Create new employee";
    private static final String MAIN_MENU_OPTION_LOG_HOURS = "Log hours";
    private static final String MAIN_MENU_OPTION_VIEW_GOALS_AND_PROGRESS = "View/set goals and progress";
    private static final String MAIN_MENU_OPTION_QUIT = "Exit application";
    private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_CREATE_NEW_EMPLOYEE, MAIN_MENU_OPTION_LOG_HOURS,
            MAIN_MENU_OPTION_VIEW_GOALS_AND_PROGRESS, MAIN_MENU_OPTION_QUIT};

    //goal menu options
    private static final String GOAL_MENU_OPTION_SHOW_ALL_EMPLOYEES_WITH_GOAL_PROGRESS = "View all tracked employees and their annual goal progress";
    private static final String GOAL_MENU_OPTION_SHOW_GOAL_PROGRESS_FOR_ONE_EMPLOYEE = "View tracked hours/goals for a single employee"
    private static final String GOAL_MENU_OPTION_RESET_EMPLOYEE = "Reset an existing employee's charge hour goals";
    private static final String GOAL_MENU_OPTION_BACK_TO_MAIN = "Back to main menu";
    private static final String[] GOAL_MENU_OPTIONS = { GOAL_MENU_OPTION_SHOW_ALL_EMPLOYEES_WITH_GOAL_PROGRESS, GOAL_MENU_OPTION_SHOW_GOAL_PROGRESS_FOR_ONE_EMPLOYEE, GOAL_MENU_OPTION_RESET_EMPLOYEE};

    //menu for yes or no
    private static final String YES_OR_NO_MENU_YES = "Yes";
    private static final String YES_OR_NO_MENU_NO = "No";
    private static final String[] YES_OR_NO_MENU = {YES_OR_NO_MENU_YES, YES_OR_NO_MENU_NO};

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }


    public void run(){
        //check log and carry balance over from previous month for all employees if
        //a month has passed since the last log
        Logger.logCheck("Logs/Log.txt");
        //write current date to txt file
        Logger.log();
        handleMainMenu();
    }

    public void handleMainMenu() {
        boolean running = true;
        while (running){
            String selection = ui.prompForSelection(MAIN_MENU_OPTIONS);
            if (selection.equals(MAIN_MENU_OPTION_CREATE_NEW_EMPLOYEE)){
                // create employee object
            }
            if (selection.equals(MAIN_MENU_OPTION_LOG_HOURS)){
                //log hours for an employee
            }
            if (selection.equals(MAIN_MENU_OPTION_VIEW_GOALS_AND_PROGRESS)){
                //view all tracked goals and hours for all employees
            }
            if (selection.equals(MAIN_MENU_OPTION_QUIT)){
                running = false;
            }
        }
    }

    public void handleGoalMenu(){
    boolean inGoalMenu = true;
    while (inGoalMenu){
        String selection = ui.prompForSelection(GOAL_MENU_OPTIONS);

        if (selection.equals(GOAL_MENU_OPTION_RESET_EMPLOYEE)){
            //reset an employee's goals or hours or both
        }
        if (selection.equals(GOAL_MENU_OPTION_SHOW_ALL_EMPLOYEES_WITH_GOAL_PROGRESS)){
            //show all the tracked employees
        }
        if (selection.equals(GOAL_MENU_OPTION_SHOW_GOAL_PROGRESS_FOR_ONE_EMPLOYEE)){
            //show info for single employee
        }
        if (selection.equals(GOAL_MENU_OPTION_BACK_TO_MAIN)) {
            inGoalMenu = false;
            handleMainMenu();
        }
    }

    }


}

