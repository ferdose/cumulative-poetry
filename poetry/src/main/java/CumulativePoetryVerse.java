public class CumulativePoetryVerse {

    public static void main(String[] args) {
        ArgumentParser argParser = new ArgumentParser();

        if (!argParser.isValidArgs(args)) {
            System.out.println(argParser.help());
        } else {
            Poetry poetry = new Poetry();
            if (argParser.isArgRevealForDayPresent(args)) {
                System.out.println(poetry.revealForDay(argParser.getDayNumber()));
            }
            if (argParser.isArgRecitePresent(args)) {
                System.out.println(poetry.recite());
            }
        }
    }
}
