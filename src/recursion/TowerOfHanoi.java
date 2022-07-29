package recursion;

public class TowerOfHanoi {

    void printMoves(int n, char source, char aux, char dest) {
        if (n == 1) {
            System.out.println("move 1 from " + source + " to " + dest);
            return;
        }
        printMoves(n-1, source, dest, aux);
        System.out.println("move " + n + " from " + source + " to " + dest);
        printMoves(n-1, aux, source, dest);
    }

}
