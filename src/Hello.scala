object Hello extends App {
  var i = 0

  //  while(i <= 10){
  //    println(i)
  //    i += 1
  //  }


  //  do {
  //    println(i)
  //        i += 1
  //  } while (i<=20)

  //Desugal for comprehension
  //  (1 to 10).foreach(i => println(i))

  //  for(i <-  1 to 10){
  //    println(i)
  //  }
  /**
    * FOREACH LOOP FOR LOOPING RANDOM LETTERS UNTIL
    *
    * WHICH WILL LOOP THOUGH FROM ZERO UNTIL
    *
    *
    * for( var x <- Range ){
    * statement(s);
    * }
    */
  //  var initLetter = 0;
  //  val randomLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  //
  //  for(initLetter <- 0 until randomLetters.length){
  //    println(randomLetters(i));
  //  }
  //
  //  var initList = 0;
  //  val aList = List(1, 2, 3, 4, 5);
  //
  //  for (initList <- aList) {
  //    println("List items " + initList);
  //  }

  /**
    * Store even numbers
    *
    * Yield is used for storing the result of the if condition to the eventList
    *
    * The second for is for printing purpose
    *
    * var retVal = for{ var x <- List
    *   if condition1; if condition2...
    *   }
    *   yield x
    *
    *
    */
//  var initEvenNumberList = 0;
//  // for loop with Filters
//  var evenList = for {initEvenNumberList: Int <- 1 to 20
//                      if initEvenNumberList % 2 == 0
//  } yield initEvenNumberList

  /**
    * Here, the List variable is a collection type having a list of elements and for loop iterate through all the
    * elements returning one element in x variable at a time.
    */
//  for (initEvenNumberList <- evenList)
//    println(initEvenNumberList)

  /**
    * You can use multiple ranges separated by semicolon (;) within for loop and in that case loop will iterate
    * through all the possible computations of the given ranges. Following is an example of using just two ranges,
    * you can use more than two ranges as well.
    */
  var x = 0;
  for(x <- 1 to 3; y <- 4 to 6){
    println("x => " +x);
    println("y => " +y);
  }

  /**
    * Prime number is a number divisble by only itself
    */
  def printPrimeNumbers(): Unit ={

  }

}