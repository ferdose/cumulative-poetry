import java.util.List;

public class Poetry {

    String revealForDay(String dayNumber){
        String invalidNumber = "Provided input for reveal-for-day option is not a valid day. Please check and try again";

        int day;
        try {
            day = Integer.parseInt(dayNumber);
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
            return invalidNumber;
        }
        if(day <= 0){
            return invalidNumber;
        }else {
            CustomFileReader fileReader = new CustomFileReader();
            String filePath = "/Users/ferdoseashraf/cumulative-poetry/poetry/src/main/resources/poetry.txt";
            List<String> poetryLines = fileReader.readFromFile(filePath);

            if(poetryLines == null) return null;

            if(day <= poetryLines.size()) {
                String startPhrase = "This is ";
                String tabSpace = "    ";
                String newLine = "\n";

                StringBuilder output = new StringBuilder();
                output.append(startPhrase).append(poetryLines.get(day - 1)).append(newLine);
                for (int d = day - 2; d >= 0; d--) {
                    output.append(tabSpace).append(poetryLines.get(d)).append(newLine);
                }
                return output.toString();
            }
            else {
                return invalidNumber;
            }
        }
    }

    String recite(){
        CustomFileReader fileReader = new CustomFileReader();
        String filePath = "/Users/ferdoseashraf/cumulative-poetry/poetry/src/main/resources/poetry.txt";
        List<String> poetryLines = fileReader.readFromFile(filePath);

        StringBuilder output = new StringBuilder();
        String startPhrase = "This is ";
        String tabSpace = "    ";
        String newLine = "\n";
        for(int day = 0; day < poetryLines.size(); day++) {
            output.append("Day ").append(day + 1).append(" -").append(newLine);
            output.append(startPhrase).append(poetryLines.get(day)).append(newLine);
            for (int d = day - 1; d >= 0; d--) {
                output.append(tabSpace).append(poetryLines.get(d)).append(newLine);
            }
            output.append(newLine);
        }
        return output.toString();
    }
}
