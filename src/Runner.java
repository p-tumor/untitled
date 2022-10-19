import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter your yes-no question and I will answer it: ");
        String question = scan.nextLine();


        int num = (int)(Math.random()*8)+1;
        if (num == 1){System.out.println("This will tell you more! https://youtu.be/dQw4w9WgXcQ");}
        if (num == 2){System.out.println("Go ask the great conch");}
        if (num == 3){System.out.println("nah bozo");}
        if (num == 4){System.out.printf("You know who else wants to know \"%s\", MY MOM",question);}
        if (num == 5){System.out.println("Not in this life or the next my friend");}
        if (num == 6){System.out.println("https://www.youtube.com/watch?v=wlHows-5hZE");}
        if (num == 7){System.out.println("NO NEVER. WHY WOULD YOU EVER");}


    }
}
