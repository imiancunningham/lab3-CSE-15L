import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceMultiple() {
    int[] input1 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    System.out.println("reversed is: ");
    for(int i =0; i<input1.length; i++){
      System.out.println(input1[i]);
    }
    assertArrayEquals(new int[]{3,2,1}, input1);
  }

  @Test
  public void testReversedMultiple() {
    int[] input1 = {1,2,3};
    System.out.println("reversed is: ");
    for(int i =0; i<input1.length; i++){
      System.out.println(input1[i]);
    }
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }


}
