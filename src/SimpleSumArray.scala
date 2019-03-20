import scala.io.StdIn.readInt;

object SimpleSumArray extends App {

  println("Enter the size of list:");
  val listSize = readInt();
  println("List size ====> " + listSize);


  println("Enter your array list:");
  val list = (1 to listSize).map(_ => readInt()).toArray;

  println("Sum Using reduce  ====> " + arraySumUsingReduce(listSize));
  println("Sum Using For  ====> " + arraySumUsingFor(listSize));
  println("Sum Using Sum  ====> " + arraySumUsingSum(listSize));


  def arraySumUsingReduce(listSize: Int): Int = {
    //We can use reduce
    list.reduce((currentElement, nextElement) => {
      currentElement + nextElement
    });
  }

  def arraySumUsingSum(listSize: Int): Int = {
    list.sum;
  }

  def arraySumUsingFor(listSize: Int): Int = {
    var sum = 0;
    for (elem <- list) {
      sum += elem;
    }
    sum;
  }


}
