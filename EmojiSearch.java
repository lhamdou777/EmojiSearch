import java.util.Scanner;
import java.io.*;

public class Emoji
{
    public static void main(String[]args)
    {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader("emoji-formatted.txt"));
        String answer;
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("What emoji would you like to see: ");
            answer = input.nextLine();

            while((line = reader.readLine()) != null)
            {
                if (line.contains(answer))
                {
                    System.out.println(line);
                }
            }
        }
        catch(IOException e){
            System.out.println("Error!");
        }
    }
}