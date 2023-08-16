public class PlayingWithStrings {
    public void appendString() {


        StringBuilder str = new StringBuilder("Tripti is great");
        System.out.println("String before appending is " + str);
        str.append("XYZ");
        System.out.println("String after appending " + str);
    }

    public void insertString() {
        StringBuilder str1 = new StringBuilder("Bharti");
        System.out.println("String before inserting " + str1);
        str1.insert(2, 'a');
        System.out.println("String after inserting " + str1);
    }

    public void reverseString() {
        StringBuilder str2 = new StringBuilder("Great");
        System.out.println("String before reversing " + str2);
        StringBuilder reversestr2 = str2.reverse();
        System.out.println("After reversing " + reversestr2);
    }

    public void measureTimeComplexity() {
        int iterations = 100000;

        long startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("a");
        }
        long endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;


        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("a");
        }
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;

        System.out.println("Time taken by StringBuffer: " + stringBufferTime + " ns");
        System.out.println("Time taken by StringBuilder: " + stringBuilderTime + " ns");
    }

    public static void main(String[] args) {
        PlayingWithStrings demo=new PlayingWithStrings();
        demo.appendString();
        demo.insertString();
        demo.reverseString();
        demo.measureTimeComplexity();
    }
}
