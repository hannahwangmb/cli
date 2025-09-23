import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Help.Ansi;

@Command(name = "company-cli", mixinStandardHelpOptions = true, version = "1.0",
        description = "Prints out the name of the company.")
public class CompanyCli implements Runnable {

    @Override
    public void run() {
        String str = Ansi.AUTO.string("@|bold,magenta impact.com|@");
        System.out.println(str);
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new CompanyCli()).execute(args);
        System.exit(exitCode);
    }
}
