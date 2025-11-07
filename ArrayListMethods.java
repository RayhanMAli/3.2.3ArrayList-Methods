import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// CODE TO ADD
public class ArrayListMethods
{
    public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    Scanner scanner = new Scanner(System.in);
    while (true) { 
        System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace or (q)uit?");
        String choice = scanner.nextLine();
        if (choice.equals("a")) {
            System.out.println("Enter the element to add:");
            String element = scanner.nextLine();
            list.add(element);
        }
        if (choice.equals("i")) {
            System.out.println("Enter the index to insert at:");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the element to insert:");
            String element = scanner.nextLine();
            list.add(index,element);

      }
      if (choice.equals("r")) {
            System.out.println("Enter what u want to remove");
            String remove = scanner.nextLine();
            list.remove(remove);
        }
        if (choice.equals("p")) {
            System.out.println("Enter the index to replace:");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the new element:");
            String element = scanner.nextLine();
            list.set(index,element);
        }
        if (choice.equals("q")) {
            break;
        }
        System.out.println("Current List: " + list);
      

  }
}}          