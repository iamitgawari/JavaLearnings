public class Junkcharacters {
    public static void main(String[] args) {
        String junkchars="$##$@@!!!AMIT ###@ Is Best #@##!";
        //String withoutjunk= junkchars.replaceAll("[^a-zA-Z0-9]","");   1st wayyy of regex
        String withoutjunk= junkchars.replaceAll("[#$/@!]",""); //2nd way enter the characters in regec directly
        System.out.println("\nString with Special character: \n"+junkchars+"\n\nString without special characters: \n"+withoutjunk);

    }
}
