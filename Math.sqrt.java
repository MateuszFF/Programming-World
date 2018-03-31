public class Math {

    public static void main(String args[]) {
        Math m = new Math();
        m.className();
        System.out.println(m.sqrt(9));
        System.out.println(m.sqrt(10));
        System.out.println(m.sqrt(4));
    }

    public void className() {
        System.out.println("Math");
    }

    public int sqrt(int a) {
        return a * a;
    }

}
