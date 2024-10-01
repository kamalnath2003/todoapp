import java.util.*;

public class TodoApp {
    private static Map<String,List<String>> usertasks = new HashMap<>();

//    private static List<String> tasks = new ArrayList<>();
    private  static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        while (true)
        {
            System.out.println("login");
            System.out.println("exit");
            System.out.println("choose");
            int choice1 = sc.nextInt();
            if(choice1== 1){
                System.out.println("your name");
                int name = sc.nextInt();
                if(!(usertasks.containsKey(name))){
                    usertasks.put(name, new ArrayList<>());
                }

            }







            System.out.println("1. Add");
            System.out.println("2. list");
            System.out.println("3. remove");
            System.out.println("4. Exit");
            System.out.println("Choose" );
            int choice = sc.nextInt();

            switch (choice){
                case  1 :
                    addTask();
                    break;
                    case  2 :
                    listTask();
                    break;
                    case  3 :
                    removeTask();
                    break;
                    case  4 :
                    return;
                default:
                    System.out.println("invadlid inp");

            }
        }

    }

    private static void removeTask(){
        listTask();

        System.out.println("enter task number");
        int tasknum = sc.nextInt()-1;
        tasks.remove(tasknum);

    }

    private static void listTask() {
        if(tasks.isEmpty()){
            System.out.println("No tasks :(");
        }else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i+1)+" "+tasks.get(i));
            }
        }
    }

    private static void addTask() {

        System.out.println("enter task");
        String newtask = sc.nextLine();
        tasks.add(sc.nextLine());
//        System.out.println("enter task");
    }
}
