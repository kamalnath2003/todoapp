import java.util.*;

public class Task {
    String desc;
    Date time;
    String status;


    public Task(String desc, Date time, String status) {
        this.desc = desc;
        this.time = new Date();
        this.status = "pending";
    }
    private static Map<String, List<String>> usertasks = new HashMap<>();

    //    private static List<String> tasks = new ArrayList<>();
    private  static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true){
            System.out.println("login");
            System.out.println("exit");
            System.out.println("choose");
            int choice1 = sc.nextInt();
            sc.nextLine();
            if(choice1== 1){
                System.out.println("your name");
                int name = sc.nextInt();
                if(!(usertasks.containsKey(name))){
                    usertasks.put(name, new ArrayList<>());
                }
                userMenu(username);

            }else {
                break;
            }

        }





    }
    staic void userMenuN(String)





}
