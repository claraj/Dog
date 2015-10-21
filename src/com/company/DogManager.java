package com.company;

public class DogManager {

    public static void main(String[] args) {


        //TODO store all of the dogs in a list, for example an ArrayList
        //TODO Format output as specified in the lab

        //Work with test Dog objects.
        Dog testDog = new Dog("Molly", "123 Main St.");
        int exampleWalks[] = { 1, 1, 2, 1, 1, 0, 0};
        testDog.setWalksPerDay(exampleWalks);

        Dog testDog2 = new Dog("Bob", "456 Hennepin Ave.");
        int exampleWalks2[] = {0, 1, 1, 1, 0, 1, 1};
        testDog2.setWalksPerDay(exampleWalks2);
        
        
        //TODO put all Dogs in ArrayList

        for (int day = 0 ; day < 7 ; day++) {

            //TODO instead of working with each Dog individually, get dog information from your list of Dog objects.
            //So you'll need another loop here, to loop over te Dogs list
            System.out.println(testDog.getName());
            System.out.println("On day " + day + " walk dog this many times "+ testDog.getNumberOfWalksForDay(day));


        }






    }
}
