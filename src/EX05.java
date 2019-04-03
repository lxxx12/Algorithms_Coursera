public class EX05 {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble((args[1]));
        if((x<1&&x>0)&&(y<1&&y>0))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
