public class VariablesMethodsBlocks {
        static int s = 9;
        static int r;
        static void func(int u){
            System.out.println("s= " + s);
            System.out.println("r= " + r);
            System.out.println("u= " + u);
        }
        static {
            System.out.println(" static for block");
            r=s+29;
        }
    public static void main(String[] args){
            func(8);
    }
}
