public class Word_compression {
    /**
     * A student decides to perform some operations on big words to compress them, so they become easy to remember.
     * An operation consists of choosing a group of K consecutive equal characters and removing them. The student
     * keeps performing this operation as long as it is possible. Determine the final word after the operation is performed.
     * Example
     * word = "abbecc"
     * k = 3
     * • Remove k = 3 characters 'c', now word = "abbb".
     * • Remove 3 characters 'b' so the final word is "a".
     * 2 It can be easily proven that the final word will be unique. Also, it is guaranteed that the final word consists
     * of at least one character.
     */

    //use 2 pointers
    String word = "abbcccb";
    char[] array = word.toCharArray();
    int slow = -1; //the first un-repeated element
    int fast = 0;
    int count = 1;

//    while(fast < array.length){
//
//    }
}
