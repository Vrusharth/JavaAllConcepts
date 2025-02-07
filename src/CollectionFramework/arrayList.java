package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {

        List<String> List1=new ArrayList<>();
        List1.add("Sharvesh");
        List1.add("Abhinav");
        List1.add("Krutika");


        ArrayList<String> studentsName=new ArrayList<>();
        studentsName.add("Vrusharth");
        studentsName.add(1,"Soham");
        System.out.println(studentsName);

        studentsName.addAll(List1);
        System.out.println(studentsName);
        System.out.println(studentsName);
    }
}
