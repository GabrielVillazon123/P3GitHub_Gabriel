public class NuevaFuncionalidad {
    public static void main(String[] args) {
        System.out.println("Tu numero aleatorio es: " + randInt());
    }

    public static int randInt() {
        return (int) (Math.random() * (10 - 1 + 1) + 1);
    }
}