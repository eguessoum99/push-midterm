package string.problems;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        // Implement here

        String string = "Big black bug bit a big black dog on his big black nose";
        // String string = "Air Pollution is the big Pollution all in the Air of the Earth's Air System";

        int count, occurs;

        //Converts the string into lowercase
        string = string.toLowerCase();

        //Split the string into words using built-in function
        String words[] = string.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            occurs = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                    occurs++;
                }

            }

            //Displays the duplicate word if count is greater than 1
            if (count > 1 && words[i] != "0") {
                System.out.println(words[i] + " =  " + occurs + " times Occurs.\n");
            }
        }
    }




}
