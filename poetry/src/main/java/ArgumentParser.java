class ArgumentParser {

    private String dayNumber;

    ArgumentParser(){ this.dayNumber = ""; }
    String help(){
        return "Invalid/Zero Arguments Provided \n" +
                "You can try the following options: \n" +
                "--reveal-for-day for_which_day : Reveals the tale up till that day \n" +
                "--recite : Recites the whole tale with a day wise breakage \n";
    }

    boolean isValidArgs(String... args) {
        if (args.length == 0) {
            return false;
        }
        for (String arg : args) {
            if (arg.equals("--reveal-for-day") || arg.equals("--recite")) {
                return true;
            }
        }
        return false;
    }

    boolean isArgRevealForDayPresent(String[] args){
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("--reveal-for-day")) {
                try {
                    this.dayNumber = args[i + 1];
                    return true;
                }
                catch (ArrayIndexOutOfBoundsException ae)
                {
                    System.out.println("input argument 'for_which_day' is not present, Please provide valid input");
                    System.out.println(this.help());
                    return false;
                }
            }
        }
        return false;
    }

    boolean isArgRecitePresent(String[] args){
        for (String arg : args) {
            if (arg.equals("--recite")) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidNumber(String number){
        try{
            Integer.parseInt(number);
        }
        catch (NumberFormatException ne){
            return false;
        }
        return true;
    }

    String getDayNumber(){
        String numFormatException = "Provided input for reveal-for-day option is not a Number. Please check and try again";
        String invalidNumber = "Please provide a valid day as input (Greater than zero/Less than number of days for the tale:)";

        if(this.isValidNumber(this.dayNumber))
        {
            int day = Integer.parseInt(this.dayNumber);
            if(day <= 0){
                return invalidNumber;
            }
            return String.valueOf(day);
        } else return numFormatException;
    }
}
