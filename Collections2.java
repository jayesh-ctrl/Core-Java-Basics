import java.net.SocketPermission;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Collections2{
    public static void main(String[] args) {
        
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Darwin");
    

        printList(placesToVisit);

        placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

        
    }
    private static void printList(LinkedList<String> linkedList)
    {
        Iterator<String> i=linkedList.iterator();
        while(i.hasNext())
        {
            System.out.println("Now Visiting "+i.next());
        }
        System.out.println("===============================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList,String newCity)
    {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext())
        {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0)
            {
                System.out.println(newCity + " is already included as a destination");
                return false;
            }
            else if(comparison>0)
            {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparison<0)
            {

            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.getFirst() == "")
        {
            System.out.println("No cities in the itenerary");
            return;
        }
        else{
            System.out.println("Now visiting "+listIterator.next());
            printMenu();
        }
        while(!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action)
            {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                
                case 1:
                    if(listIterator.hasNext())
                    {
                        System.out.println("Now visiting "+listIterator.next());
                    }
                    else{
                        System.out.println("Reached the end of the list");
                    }

                case 2:
                    if(listIterator.hasPrevious())
                    {
                        System.out.println("Now Visiting "+listIterator.previous()); 
                    }
                    else
                    {
                        System.out.println("We are at the start of the list");
                    }
                    break;
                
                case 3:
                    printMenu();
                    break;
            }   

        }
    }

    private static void printMenu()
    {
        System.out.println("Available actions:\n Press");
        System.out.println("0");
    }
}