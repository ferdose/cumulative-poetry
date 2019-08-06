import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class CumulativePoetry {

    public static void main(String[] args){
        CumulativePoetry cumPoetry = new CumulativePoetry();

        if(args.length == 0){
            cumPoetry.printHelp();
        }
        else {

            List<String> poetryLines = cumPoetry.readFromPoetryFile();
            for(int i=0; i<args.length; i++){
                if(args[i].equals("--reveal-for-day")){
                    System.out.println("Argument reveal for day detected");
                    int day = 0;
                    try {
                        day = Integer.parseInt(args[i + 1]);
                    }
                    catch (NumberFormatException e){
                        System.out.println("Provided input for reveal-for-day option is not a Number. Please check and try again");
                    }
                    catch (ArrayIndexOutOfBoundsException ae){
                        System.out.println("input 'for_which_day' not provided for the reveal-for-day option. Please see help below");
                        cumPoetry.printHelp();
                    }
                    if(day <= 0){
                        System.out.println("Please provide a valid day as input (Greater than zero)");
                    } else if(day > poetryLines.size()){
                        System.out.println("Please provide a valid day as input (Less than number of days for the tale: " + poetryLines.size() +" in this case)");
                    }else {
                        String startPhrase = "This is ";
                        System.out.println(startPhrase + poetryLines.get(day-1));
                        for(int d = day-2; d >= 0; d--) {
                            System.out.println("    "+poetryLines.get(d));
                        }
                    }
                }
                else if(args[i].equals("--recite")){
                    System.out.println("Argument recite detected");
                    String startPhrase = "This is ";
                    for(int day = 0; day < poetryLines.size(); day++) {
                        System.out.println("Day " + (day+1) + " -");
                        System.out.println(startPhrase + poetryLines.get(day));
                        for (int d = day - 1; d >= 0; d--) {
                            System.out.println("    " + poetryLines.get(d));
                        }
                        System.out.println();
                    }

                }
            }
        }


    }

    private List<String> readFromPoetryFile() {
        String fileName = "poetry.txt";
        List<String> lines = null;

        try {
            //URI uri = CumulativePoetry.class.getClassLoader().getResource(fileName).toURI();
            lines = Files.readAllLines(Paths.get("../resources/poetry.txt")/*Paths.get(uri)*/,
                    Charset.defaultCharset());
            /*
            for (String line : lines) {
                System.out.println(line);
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }

    private void printHelp(){
        System.out.println("Invalid/Zero Arguments Provided");
        System.out.println("You can try the following options:");
        System.out.println("--reveal-for-day for_which_day : Reveals the tale up till that day");
        System.out.println("--recite : Recites the whole tale with a day wise breakage");

    }
}
