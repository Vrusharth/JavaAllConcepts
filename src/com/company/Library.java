package com.company;
import java.util.*;
import java.util.List;
import java.util.Objects;

class LibraryManager{
    private String [] Abooks;
    private String [] Ibooks;
    private int ATotal=0;
    private int ITotal=0;

    public void AddBook(String a){
        Abooks[ATotal]=a;
        ATotal++;
    }
    public void IssueBook(String n){
        Ibooks[ITotal]=n;
        ITotal++;
    }
    public void ReturnBook(String a){
        for(int i=0; i<=Ibooks.length; i++){
            if (Objects.equals(Ibooks[i], a)) {
                ITotal--;

                // Convert array to ArrayList
                List<String> list = new ArrayList<>(Arrays.asList(Ibooks));

                // Remove the specific string
                list.removeAll(Collections.singleton(a));
                // Convert back to array
                String[] newIbooks = list.toArray(new String[0]);

            }
            else{
                System.out.println("Book not found ! ");
            }
        }
    }

}
public class Library {
}
