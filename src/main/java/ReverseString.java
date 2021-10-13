public class ReverseString {

    public StringBuffer reverseString (String str)
    {
        StringBuffer strbuffer = new StringBuffer(str);
        strbuffer.reverse();
        System.out.println("2) String passed from Object and function: \n" + strbuffer);
        return strbuffer;

    }

    public static void main (String args[]) {
        String str = " Hey this is reverse String Program";
        String rev = "";
        int strlen = str.length();
        for (int i = strlen - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("1) String Using FOR loop: \n" + rev);


        ReverseString revster = new ReverseString();
        revster.reverseString("Hey this is reverse String Program");
        System.out.println("3) String Using Object and Returned from function: \n"+ revster.reverseString("Hey this is reverse String Program"));


    }
}


/*public class ReverseString {

    public static void main(String args[]){

        //1st approach using for loop and length of string
        String str ="Amit is working in Talentica";
        String rev= "";
        int strlength=str.length();
        for(int i=strlength-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println("\n1) Reverse String using FOR Loop:  \n"+ rev + "\n");

        //2nd approach using reverse function and String Buffer class
        StringBuffer stgbuffer= new StringBuffer(str);
        stgbuffer.reverse();
        System.out.println("2) Reverse String using StringBuffer: \n" + stgbuffer);



    }
}

 */
