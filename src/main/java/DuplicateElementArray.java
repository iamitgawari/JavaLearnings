import java.util.HashSet;
import java.util.Set;

public class DuplicateElementArray
{
    public static void main(String[] args)
    {
        String str[]={"java","javascript","test","python","java","test"};
        for(int i=0;i<str.length;i++)
        {
            for(int j=i+1;j<str.length;j++) // Solved using 2 for loops time complexity o(n*n)
            {
                if(str[i].equals(str[j]))
                {
                    System.out.println("Duplicate Element found using using FOR Loop: " +str[i]);
                }
            }
        }
        System.out.println("########################-------#####################");

        Set<String> hashSet= new HashSet<String>(); // Hashset doesn't accepts duplicate  // On complexity
        for(String name : str)
        {
           if(hashSet.add(name) == false)
           {
               System.out.println("Duplicate Element is found using HashSet: " +name);
           }
        }

        System.out.println("########################-------#####################");

    }
}
