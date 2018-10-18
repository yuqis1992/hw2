import java.io.*;

class Nuke2 {

public static void main(String[] arg) throws Exception {

	BufferedReader keybd;
	String inputLine;
	
	keybd = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("Please insert a word: ");
        System.out.flush();        
        inputLine = keybd.readLine();

	System.out.println(inputLine);

	String outputLine = inputLine.substring(0,1)+inputLine.substring(2);

	System.out.println(outputLine);

}
}