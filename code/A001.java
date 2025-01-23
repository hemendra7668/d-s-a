
public class A001 {

    public static void main(String[] args) {
        System.out.println("arr-1: program::::::::");
        Dvd[] arrDvds = new Dvd[20];
        Dvd avengersDVD = new Dvd("The Avengers", 2012, "Joss Whedon");
        arrDvds[1] = avengersDVD;
        arrDvds[2] = new Dvd("mirzapur", 2018, "pta nhi");

        System.out.println(arrDvds[1].name);
        //System.out.println(arrDvds[1]);
        for (Dvd i : arrDvds) {
            // Print the current value of square.
            System.out.println(i);
        }
    }
}

class Dvd {
    public String name;
    public int releaseYear;
    public String director;

    public Dvd(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
}

//a different approach to do the same.
    // @Override
    // public String toString() {
    //     // TODO Auto-generated method stub
    //     return this.name + "    "+this.releaseYear +"   "+this.director;
    // }

}