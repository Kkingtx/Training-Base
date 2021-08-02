package com.techelevator;

public class Exercises {

    public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
        int birdsOnABranch = 4;
        int birdsThatFlyAway = 1;
        int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        System.out.println(birdsRemaining);
        //

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
        int numberOfBirds = 6;
        int numberOfNests = 3;
        int numberOfExtraBirds = numberOfBirds - numberOfNests;

        System.out.println(numberOfExtraBirds);

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
        int racoonsPlaying = 3;
        int racoonsGoingHome = 2;
        int racoonsLeftInWoods = racoonsPlaying - racoonsGoingHome;

        System.out.println(racoonsLeftInWoods);


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
        int flowers = 5;
        int bees = 3;
        int lessBees = flowers - bees;

        System.out.println(lessBees);


        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating bread crumbs now?

        */
        int lonelyPigeon = 1;
        int otherPigeon = 1;
        int totalPigeons = lonelyPigeon + otherPigeon;

        System.out.println(totalPigeons);


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
        int numberOfOwlsOnFence = 3;
        int numberOfOwlsJoined = 2;
        int numberOfTotalOwls = numberOfOwlsOnFence + numberOfOwlsJoined;

        System.out.println(numberOfTotalOwls);


        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
        int numberOfBeaversWorking = 2;
        int numberOfBeaversSwimming = 1;
        int numberOfBeaversStillWorking = numberOfBeaversWorking - numberOfBeaversSwimming;

        System.out.println(numberOfBeaversStillWorking);


        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
        int toucansSittingOnALimb = 2;
        int toucanThatJoins = 1;
        int toucansInTotal = toucansSittingOnALimb + toucanThatJoins;

        System.out.println(toucansInTotal);



        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
        int numberOfSquirrels = 4;
        int numberOfNuts = 2;
        int numberOfMoreSquirrels = numberOfSquirrels - numberOfNuts;

        System.out.println(numberOfMoreSquirrels);

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
        double quarter = .25;
        double dime = .10;
        double nickels = .10;
        double total = quarter + dime + nickels;

        System.out.println(total);


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
        int numberOfBriersMuffins = 18;
        int numberOfMacAdamsMuffins = 20;
        int numberOfFlannerysMuffins = 17;
        int totalNumberOfMuffins = numberOfBriersMuffins + numberOfMacAdamsMuffins + numberOfFlannerysMuffins;

        System.out.println(totalNumberOfMuffins);


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        double costOfYoyo = .24;
        double costOfWhistle = .14;
        double costOfToys = costOfYoyo + costOfWhistle;

        System.out.println(costOfToys);




        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        int numberOfLargeMarshmallows = 8;
        int numberOfMiniMarshmallows = 10;
        int totalMarshmallows = numberOfLargeMarshmallows + numberOfMiniMarshmallows;

        System.out.println(totalMarshmallows);


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int inchesOfSnowAtHilts = 29;
        int inchesOfSnowAtBrecknock = 17;
        int differenceOfSnowAtHilts = inchesOfSnowAtHilts - inchesOfSnowAtBrecknock;

        System.out.println(differenceOfSnowAtHilts);




        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        double totalAmountOfMoney = 10.00;
        double costOfToyTruck = 3.00;
        double costOfPencil = 2.00;
        double remainingAmountOfMoney = totalAmountOfMoney - costOfToyTruck - costOfPencil;

        System.out.println(remainingAmountOfMoney);


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int numberOfMarblesInCollection = 16;
        int numberOfMarblesLost = 7;
        int numberOfMarblesLeft = numberOfMarblesInCollection - numberOfMarblesLost;

        System.out.println(numberOfMarblesLeft);


        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int numberOfCurrentSeashells = 19;
        int goalNumberOfSeashells = 25;
        int numberOfSeashellsToFind = goalNumberOfSeashells - numberOfCurrentSeashells;

        System.out.println(numberOfSeashellsToFind);


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int numberOfTotalBalloons = 17;
        int numberOfRedBalloons = 8;
        int numberOfGreenBalloons = numberOfTotalBalloons - numberOfRedBalloons;

        System.out.println(numberOfGreenBalloons);


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int numberOfCurrentBooksOnShelf = 38;
        int numberOfBooksAddedToShelf = 10;
        int numberOfTotalBooksOnShelf = numberOfCurrentBooksOnShelf + numberOfBooksAddedToShelf;

        System.out.println(numberOfTotalBooksOnShelf);

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int numberOfBeeLegs = 6;
        int totalBees = 8;
        int totalBeeLegs = numberOfBeeLegs * totalBees;

        System.out.println(totalBeeLegs);



        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        double costOfIceCream = .99;
        double totalOfIceCreamWanted = 2;
        double totalCost = costOfIceCream * totalOfIceCreamWanted;

        System.out.println(totalCost);



        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int totalNumberOfRocks = 125;
        int currentNumberOfRocks = 64;
        int numberOfRocksNeeded = totalNumberOfRocks - currentNumberOfRocks;

        System.out.println(numberOfRocksNeeded);


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int numberOfMarbles = 38;
        int marblesLost = 15;
        int marblesLeft = numberOfMarbles - marblesLost;

        System.out.println(marblesLeft);


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int totalMiles = 78;
        int milesDriven = 32;
        int milesLeftToDrive = totalMiles - milesDriven;

        System.out.println(milesLeftToDrive);


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
        int timeShovelingSnowSaturdayMorning = 90;
        int timeShovelingSnowSaturdayAfternoon = 45;
        int totalTimeShovelingSnow = timeShovelingSnowSaturdayMorning + timeShovelingSnowSaturdayAfternoon;

        System.out.println(totalTimeShovelingSnow);


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        double costOfOneHotDog = .50;
        double totalHotDogsBought = 6;
        double totalCostOfHotdogs = costOfOneHotDog * totalHotDogsBought;

        System.out.println(totalCostOfHotdogs);


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        int currentBalance = 50;
        int priceOfPencil = 7;
        int numberOfPencils = currentBalance / priceOfPencil;


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int totalButterfliesSeen = 33;
        int orangeButterflies = 20;
        int redButterflies = totalButterfliesSeen - orangeButterflies;

        System.out.println(redButterflies);


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        double amountPaidToClerk = 1.00;
        double amountClerkGaveBack = .54;
        double amountReceivedInChange = amountPaidToClerk - amountClerkGaveBack;

        System.out.println(amountReceivedInChange);


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int currentTrees = 13;
        int additionalTreesPlanted = 12;
        int totalTrees = currentTrees + additionalTreesPlanted;

        System.out.println(totalTrees);


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        int hoursInOneDay = 24;
        int daysUntilJoySeesGrandma = 2;
        int totalHoursUntilJoySeesGrandma = hoursInOneDay * daysUntilJoySeesGrandma;

        System.out.println(totalHoursUntilJoySeesGrandma);

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        int totalCousins = 4;
        int piecesOfGumSheWantsToGiveToEach = 5;
        int piecesEachCousinWillReceive = totalCousins * piecesOfGumSheWantsToGiveToEach;

        System.out.println(piecesEachCousinWillReceive);


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        double amountOfMoneyDanHas = 3.00;
        double amountOfCandyBar = 1.00;
        double amountofMoneyDanHasLeft = amountOfMoneyDanHas - amountOfCandyBar;

        System.out.println(amountofMoneyDanHasLeft);


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int numberOfBoatsInLake = 5;
        int numberOfPeopleOnEachBoat = 3;
        int numberOfPeopleOnLake = numberOfBoatsInLake * numberOfPeopleOnEachBoat;

        System.out.println(numberOfPeopleOnLake);


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int totalLegos = 380;
        int legosLost = 57;
        int numberOfLegosLeft = totalLegos - legosLost;

        System.out.println(numberOfLegosLeft);

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int numberOfMuffinsArthurWants = 83;
        int numberOfMuffinsArthurBaked = 35;
        int numberOfMuffinsLeftToBake = numberOfMuffinsArthurWants - numberOfMuffinsArthurBaked;

        System.out.println(numberOfMuffinsLeftToBake);


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int numberOfWillysCrayons = 1400;
        int numberOfLucysCrayons = 290;
        int numberOfCrayonsWillyHasOverLucys = numberOfWillysCrayons - numberOfLucysCrayons;

        System.out.println(numberOfCrayonsWillyHasOverLucys);


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int numberOfStickersOnAPage = 10;
        int totalNumberOfPages = 22;
        int totalNumberOfStickers = numberOfStickersOnAPage * totalNumberOfPages;

        System.out.println(totalNumberOfStickers);


        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

        double totalCupcakes = 100;
        double numberOfChildren = 8;
        double numberOfCupcakesEachChildGets = totalCupcakes / numberOfChildren;



        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
        int totalCookies = 47;
        int numberOfCookiesPerJar = 6;
        int numberOfCookiesNotInAJar = totalCookies % numberOfCookiesPerJar;

        System.out.println(numberOfCookiesNotInAJar);


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
        int totalCroissants = 59;
        int numberOfCroissantsPerNeighbor = 8;
        int numberOfCroissantsLeftOver = totalCroissants % numberOfCroissantsPerNeighbor;

        System.out.println(numberOfCroissantsLeftOver);


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int numberOfOatmealCookiesToPrepare = 276;
        int numberOfOatmealCookiesPerTray = 12;
        int numberOfTraysNeeded = numberOfOatmealCookiesToPrepare / numberOfOatmealCookiesPerTray;

        System.out.println(numberOfTraysNeeded);



        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int numberOfPretzelsMade = 480;
        int oneServingOfPretzels = 12;
        int numberOfServingsMade = numberOfPretzelsMade / oneServingOfPretzels;

        System.out.println(numberOfServingsMade);



        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int totalCupcakesBaked = 53;
        int numberOfCupcakesLeftAtHome = 2;
        int numberOfCupcakesPerBox = 3;
        int numberOfCupcakesGivenAway = (totalCupcakesBaked - numberOfCupcakesLeftAtHome) / numberOfCupcakesPerBox;

        System.out.println(numberOfCupcakesGivenAway);
        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int numberOfCarrotSticksPrepared = 74;
        int numberOfCarrotsPerPerson = 12;
        int numberOfCarrotsNotEaten = numberOfCarrotSticksPrepared % numberOfCarrotsPerPerson;

        System.out.println(numberOfCarrotsNotEaten);


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int numberOfTeddyBears = 98;
        int numberOfTeddyBearsEachShelfCanHold = 7;
        int numberOfShelvesFilledWithBears = numberOfTeddyBears / numberOfTeddyBearsEachShelfCanHold;

        System.out.println(numberOfShelvesFilledWithBears);



        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int numberOfPicsPerAlbum = 20;
        int numberOfPics = 480;
        int numberOfAlbumsNeeded = numberOfPics / numberOfPicsPerAlbum;

        System.out.println(numberOfAlbumsNeeded);


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int numberOfTradingCards = 94;
        int numberOfCardsPerBox = 8;
        int numberOfBoxesFilled = numberOfTradingCards / numberOfCardsPerBox;
        int numberOfCardsInUnfilledBox = numberOfTradingCards % numberOfCardsPerBox;

        System.out.println(numberOfBoxesFilled);
        System.out.println(numberOfCardsInUnfilledBox);



        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        int numberOfBooks = 210;
        int numberOfRepairedShelves = 10;
        int numberOfBooksOnEachShelf = numberOfBooks / numberOfRepairedShelves;

        System.out.println(numberOfBooksOnEachShelf);


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        double totalNumberOfCroissants = 17;
        double numberOfGuests = 7;
        double numberOfCroissantsPerGuest = totalNumberOfCroissants / numberOfGuests;

        System.out.println(numberOfCroissantsPerGuest);


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
        double billsRate = 1 / 2.15;
        double jillsRate = 1 / 1.90;
        int numberOfRooms = 5;
        double combinedTime = numberOfRooms / (billsRate + jillsRate);

        System.out.println(combinedTime);


	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
        String stringOne = " Grace";
        String stringTwo = "Hopper,";
        String stringThree = " B.";
        String stringFour = stringTwo + stringOne + stringThree;

        System.out.println(stringFour);



	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
        int numberOfMilesTotal = 800;
        int numberOfMilesTraveledThusFar = 537;
        int percentageCompleted = 100 * numberOfMilesTraveledThusFar / numberOfMilesTotal;
    }
}

