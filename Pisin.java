import java.util.Arrays;

class Pisin {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Ei parametreja");
        }
        else {
            int pituus = 0;
            int pisin = 0;
            for (String arg : args) {
                if (arg.length() > pituus) {
                    pituus = arg.length();
                    pisin = Arrays.asList(args).indexOf(arg);
                }
            }
            System.out.println("Pisin parametri: " + args[pisin]);
        }
    }
}