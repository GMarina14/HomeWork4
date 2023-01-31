public class Main {
    public static void main(String[] args)
        {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        }
    public static void task1()
    {
       System.out.println("Task #1");
       int age=15;
       if(age>=18)
       {
           System.out.println("If someone is "+age+" years old, he is considered as an adult");
       }
       else
       {
           System.out.println("If someone is "+age+" years old, he hasn't reached the age of majority and needs to wait a little bit");
       }

    }
    public static void task2()
    {
        System.out.println("Task #2");
        int temperature =-5;
        if(temperature<=5)
        {
            System.out.println("It's "+temperature+" degrees outside, you need to wear a hat");
        }
        else
        {
            System.out.println("It's " + temperature+" degrees outside, you can go without hat");
        }
    }
    public static void task3()
    {
        System.out.println("Task #3");
        int speed=65;
        if(speed<=60)
        {
            System.out.println("No overspeed. You are moving at "+speed+" km/h. You can drive safely");
        }
        else
        {
            System.out.println("Overspeed! The speed is "+speed+" km/h. You will have to pay a fine ");
        }

    }
    public static void task4()
    {
        System.out.println("Task #4");
        int age = 25;
        if (age>=2 && age<=6)
        {
            System.out.println("If someone is "+age+" years old, he needs to go to kindergarten");
        }
        else if( age>=7 && age<18)
        {
            System.out.println("If someone is "+age+" years old, he needs to go to school");
        }
        else if (age>=18 &&age<=24)
        {
            System.out.println("If someone is "+age+" years old, he needs to go to university");
        }
        else if(age>24)
        {
            System.out.println("If someone is "+age+" years old, he needs to find a job");
        }
        else
        {
            System.out.println("If someone is "+age+" years old, he's just born");

        }
    }
    public static void task5()
    {
        System.out.println("Task #5");
        int age=15;
        if (age<5)
        {
            System.out.println("If the age of a kid is "+age+" years, he can't ride the attraction");
        }
        else if (age>=5 && age<14)
        {
            System.out.println("If the age of a kid is "+age+" years, he can ride the attraction " +
                    "only when accompanied by an adult. If not, he can't ride the attraction.");
        }
        else
        {
            System.out.println("If the age of a kid is "+age+" years, he can ride the attraction");
        }
    }
    public static void task6()
    {
        System.out.println("Task #6");
        int capacityOfTrain=102;
        int seatPlaces=60;
        int standingPlaces=capacityOfTrain-seatPlaces;

        int peopleInTrain=98;
        int peopleSeating=57;
        int peopleStanding=peopleInTrain-peopleSeating;

        if (peopleInTrain<capacityOfTrain)
        {
            System.out.println("There is some place in the train: "+(seatPlaces-peopleSeating)+" seat places"+
                    " and "+(standingPlaces-peopleStanding)+" standing places");
        }
        else
        {
            System.out.println("The train is full, wait for another");
        }

    }
    public static void task7()
    {
        System.out.println("Task #7");
        int one=10;
        int two=1;
        int three=8;
        if(one>two && one>three)
        {
            System.out.println("The larger number is "+ one);
        }
        else if(two>one && two>three)
        {
            System.out.println("The larger number is "+ two);
        }
        else if (one==two && one==three)
        {
            System.out.println("All number are equal");
        }
        else
        {
            System.out.println("The larger number is "+ three);

        }
    }
}

