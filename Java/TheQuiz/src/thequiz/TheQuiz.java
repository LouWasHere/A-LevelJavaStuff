
package thequiz;
import java.io.*;
import java.util.Scanner;
public class TheQuiz
{
    public static int correctAnswer(int score)
    {
        System.out.println("That's correct, you genius!");
        score = score +1;
        return score;
    }
    public static void incorrectAnswer()
    {
        System.out.println("Sorry, that's not correct.");
    }
    public static void finishedQuiz(int score)
    {
        System.out.println("That's it! You got " + score + "! Well done!");
    }
    public static void main(String[] args) throws IOException 
    {
        String myGuess = null;
        int score = 0;
        
        //Scanner scanner = new Scanner(System.in);
        //int myInt = scanner.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Who was the hit game Armchair Communist created by?");
        System.out.println("A - Hideo Kojima\nB - Dilan Moore\nC - Toby Fox\nD - Shigiru Miyamoto");
        myGuess = br.readLine();
        if(myGuess.equals("B") || myGuess.equals("b"))
        {
            score = correctAnswer(score);
        }
        else
        {
            incorrectAnswer();
        }
        finishedQuiz(score);
    }
}
