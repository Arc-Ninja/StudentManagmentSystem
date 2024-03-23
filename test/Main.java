package test;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)throws Exception {
        try {
        Process apache = new ProcessBuilder("sudo","xampp","startapache").start();
        DataOutputStream out = new DataOutputStream(apache.getOutputStream());
        out.writeChars("9456");
        // Thread.sleep(3000);
        Process ngrokHTTPS = new ProcessBuilder("ngrok", "start", "--all").start();
        // Process ngrokTCP = new ProcessBuilder("ngrok", "start", "tcp").start();
        Thread.sleep(1000);
        Process info = new ProcessBuilder ("/bin/sh", "-c","curl localhost:4040/api/tunnels/tcps | jq .'public_url'").start();
        java.util.Scanner in = new java.util.Scanner(info.getInputStream());
        // while (in.hasNextLine()) {
            // System.out.println(in.hasNextLine());
            String line = in.nextLine();
            System.out.println(line);
            System.out.println(line.substring(line.lastIndexOf(':')+1, line.length()-1));
            File file= new File("/Applications/XAMPP/xamppfiles/htdocs/port.php");
            DataOutputStream outport = new DataOutputStream(new FileOutputStream(file));
            outport.flush();
            outport.writeChars(line.substring(line.lastIndexOf(':')+1, line.length()-1));
            System.out.println("print in file");
            // .substring(25,line.length()-1)
            
        // }
        Thread.sleep(3000);
        in.close();
        Process port = new ProcessBuilder("curl", "https://seemingly-pleasant-sculpin.ngrok-free.app/port.php").start();
        java.util.Scanner scan= new java.util.Scanner(port.getInputStream());
        while(scan.hasNextLine()) {
            line = scan.nextLine();
            System.out.println(line);
        }
        scan.close();
        info.destroy();
        System.out.println("tunnel closed");
        Thread.sleep(3000);
        outport.close();
        
        // apache.destroy();
        ngrokHTTPS.destroy();

        apache = new ProcessBuilder("sudo","xampp","stop").start();
        out = new DataOutputStream(apache.getOutputStream());
        out.writeChars("9456");
        apache.destroy();
        
        
        

        
        
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
