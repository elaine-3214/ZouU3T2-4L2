public class CatHouse {
    private Cat cat1;
    private Cat cat2;
    private String owner;

    public CatHouse(Cat cat1, Cat cat2, String owner) {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.owner = owner;
    }

    // MODIFY this so that the OLDEST Cat always introduces
    // themselves first!  If they have the same age, have them
    // introduce themselves alphabetically; if they have the same name AND
    // same age, then have cat1 go first
    public void rollCall() {
        Cat oldestCat;
        Cat youngerCat;
        int age1 = cat1.getAge();
        int age2 = cat2.getAge();
        String name1 = cat1.getName();
        String name2 = cat2.getName();


        if (age1 > age2) {
            oldestCat = cat1;
            youngerCat = cat2;
        } else if (age2 > age1) {
            oldestCat = cat2;
            youngerCat = cat1;
        } else {
            if (name1.compareTo(name2) < 1) {
                oldestCat = cat1;
                youngerCat = cat2;
            } else if (name1.compareTo(name2) > 1) {
                oldestCat = cat2;
                youngerCat = cat1;
            } else {
                oldestCat = cat1;
                youngerCat = cat2;
            }

        }
        oldestCat.introduce();
        youngerCat.introduce();
    }

    // IMPLEMENT this method!
    // this method causes each cat to speak by printing
    // each Cat's returned "speak()" string to the console
    public void catNoise() {
        System.out.println(cat1.speak());
        System.out.println(cat2.speak());
    }

    // MODIFY this so that it returns a string with each Cat's AGE next to its name
    // e.g. Cat 1's Name: Petunia, Age: 3
    public String houseInfo() {
        String str = "Welcome to " + owner + "'s Cat House!\n";
        str += "Cat 1's Name: " + cat1.getName() + ", Age: " + cat1.getAge() + "\n";
        str += "Cat 2's Name: " + cat2.getName() + ", Age: " + cat2.getAge();
        return str;
    }
}
