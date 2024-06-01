package structural.adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole =new RoundHole(5);
        RoundPeg roundPeg =new RoundPeg(5);
        SquarePeg squarePeg =new SquarePeg(9);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        //Does round peg fit into round hole?
        System.out.println(roundHole.fits(roundPeg));

        //Does square peg fit into round hole?
        System.out.println(roundHole.fits(squarePegAdapter));

    }
}
