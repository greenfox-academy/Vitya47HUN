public class Commands {

  public static void printUsage() {
    System.out.println("Java Todo application\n" +
            "====================\n" +
            "\n" +
            "Command line arguments:\n" +
            " -l   Lists all the tasks\n" +
            " -a   Adds a new task\n" +
            " -r   Removes an task\n" +
            " -c   Completes an task\n");
  }
  public static void noTodos(){
    System.out.println("You have no todos yet.");
  }

}



