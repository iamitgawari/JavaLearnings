public class DuplicateElementArray {
    public static void main(String[] args) {
        String str[]={"java","javascript","test","python","java","test"};
        for(int i=0;i<str.length;i++)
        {
            for(int j=i+1;j<str.length;j++) // Solved using 2 for loops
            {
                if(str[i]==str[j])
                {
                    System.out.println("duplicate element: " +str[j]);
                }

        }

    }
}
}
