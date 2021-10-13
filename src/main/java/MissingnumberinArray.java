import javax.sound.midi.SysexMessage;

public class MissingnumberinArray {
    public static void main(String[] args) {

        int a[]={-1,0,1,2,3,4,5,7,8};
        int sum1=0;

        for(int i=0;i<a.length;i++)
        {
            sum1+=a[i];
        }
        System.out.println(sum1);
        int sum2=0;
        for (int j=-1;j<=8;j++)
        {
            sum2+=j;
        }
        System.out.println(sum2);

        System.out.println("Missing Number is: " + (sum2-sum1));
    }
}
