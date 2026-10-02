package pack1;

public class test24 {
    public int pubVar = 10;
    protected int proVar = 20;
    int defVar = 30;           // default (package-private)
    private int priVar = 40;

    public void display() {
        System.out.println("Within Same Class: All accessible (" + pubVar + ", " + proVar + ", " + defVar + ", " + priVar + ")");
    }
}