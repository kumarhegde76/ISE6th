
import java.util.*;

public class MainClass{
    public static void main(String args[]){
        ArrayList<Contact> phonebook = new ArrayList<Contact>(); // this is the collection of contacts in the phonebook
        phonebook.add(new Contact("Kaneki",995642142));
        phonebook.add(new Contact("Tanjirou",99565754));
        phonebook.add(new Contact("Hinata",95654846));

        ArrayList<MissedCalls> record = new ArrayList<MissedCalls>(); // to keep the record of missed calls
        Calendar c = Calendar.getInstance();

        int count = 0;      // to count the number of missed calls in the record
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("1. To add another missed call\n2. To display the missed calls.");
            int ch = sc.nextInt();
    
            switch(ch){
                case 1:
                System.out.println("Enter the number");
                long number = sc.nextLong();
                String time = c.HOUR + ":" + c.MINUTE + ":" + c.SECOND;
                String name = "private caller";
    
                for(Contact itr:phonebook){
                    if(itr.number == number){
                        name = itr.name;
                        break;
                    }
                }
                //found the name in the phonenook else "private caller"
                if(count == 10){
                    record.remove(0);
                    count--;
                }
                record.add(new MissedCalls(name, number, time));
                count++;
                break;
    
                case 2:
    
                System.out.println("Record of missed calls are:");
                for(int i=0;i<record.size();i++){
                    System.out.println(record.get(i).number);
    
                    System.out.println("1. To delete the call.\n2. To go on to the next missed call.\n3. To display the call details.");
                    int ch2 = sc.nextInt();
    
                    switch(ch2){
                        case 1:
                        System.out.println("Deleted the call successfully.");
                        count--;
                        record.remove(record.get(i));
                        i--;
                        break;
    
                        case 2:
                        System.out.println("Next Missed Call:");
                        break;
    
                        case 3:
                        System.out.println("Call details:\n"+record.get(i));
                        break;
    
                        default:
                        System.out.println("Wrong Choice ");
                    }
                }
            }
        }
    
    }
}