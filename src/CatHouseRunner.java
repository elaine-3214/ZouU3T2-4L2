public class CatHouseRunner {
    public static void main(String[] args) {

        // TASK 1: write your code here!
        Cat cat1 = new Cat("Monday", 10);
        Cat cat2 = new Cat("Tuesday", 1);

        CatHouse house1 = new CatHouse(cat1, cat2, "Elaine");







        // TASK 2-3: write the methods as specified, then write code below to
        // test your new methods using the objects you created above in Task 1
//        System.out.println("cat 1: " + cat1.getAge() + " cat 2: "+cat2.getAge());
//        System.out.println(cat1.speak() + "\n" + cat2.speak());
//        house1.rollCall();
//        house1.catNoise();
//        house1.houseInfo();


        // TASK 4: COMPLETE TEST CASES: uncomment the code below to fully test

    System.out.println("------- Test set 1 -------");
    Cat garfield = new Cat("Garfield", 5);
    Cat crookshanks = new Cat("Crookshanks", 6);
    CatHouse myCats = new CatHouse(garfield, crookshanks, "Mr. Miller");

    // print CatHouse info
    System.out.println(myCats.houseInfo());

    // older cat, Crookshanks, speaks first!
    myCats.rollCall();

    // cat1 then cat2 each says a random thing
    myCats.catNoise();

    System.out.println("------- Test set 2 -------");
    Cat toby = new Cat("Toby", 10);
    Cat ziggy = new Cat("Ziggy", 8);

    CatHouse yourCats = new CatHouse(toby, ziggy, "Alex");

    // print CatHouse info
    System.out.println(yourCats.houseInfo());

    // older cat, Toby, speaks first!
    yourCats.rollCall();

    yourCats.catNoise();

    System.out.println("------- Test set 3 -------");
    Cat katie = new Cat("Katie", 12);
    Cat billy = new Cat("Billy", 12);

    CatHouse neighborsCats = new CatHouse(katie, billy, "Ms. Thompson");

    // print CatHouse info
    System.out.println(neighborsCats.houseInfo());

    // same age, so Billy speaks first because B before K
    neighborsCats.rollCall();

    neighborsCats.catNoise();

    System.out.println("------- Test set 4 -------");
    Cat autumn1 = new Cat("Autumn", 15);
    Cat autumn2 = new Cat("Cathy", 15);

    CatHouse sameCats = new CatHouse(autumn1, autumn2, "ASPCA");

    // print CatHouse info
    System.out.println(sameCats.houseInfo());

    sameCats.rollCall();

    sameCats.catNoise();

    }
}