import java.util.Arrays;

public class Test{
    public static void main(String[] args){
        long str = 5000;
        String str2 = "Hello this is a bitch!";
        byte[][] bytar = new byte[2][];
        bytar[0] = (String.valueOf(str)).getBytes();
        bytar[1] = str2.getBytes();
        System.out.println(Arrays.toString(bytar[1]));
        System.out.println(bytar[0][3]);
        
        //encrypt
    //     for(int i=0;i<str.length();i++){

    //         if(bytar[i]>=65 && bytar[i]<=90){
    //         bytar[i] = (byte) (((((int) bytar[i])+5)%91));
    //         }
    //         else if(bytar[i]>=97 && bytar[i]<=122){
    //             bytar[i] = (byte) (((((int) bytar[i])+5)%123));
    //         }
    //         else{
    //             continue;
    //         }
            
    //     }
    //     System.out.println(Arrays.toString(bytar));

    //     String newstr = new String(bytar);
    //     System.out.println(newstr);

    //     bytar = newstr.getBytes();
    //     System.out.println(Arrays.toString(bytar));

    //     //decrypt
    //     for(int i=0;i<str.length();i++){

    //         bytar[i] = (byte) ((int) bytar[i] - 17);
            
    //     }
    //     System.out.println(Arrays.toString(bytar));

    }
}