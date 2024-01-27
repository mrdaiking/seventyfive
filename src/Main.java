public class Main {
    public static void main(String[] args) {
        Day1 day1 = new Day1();
        long startTime = System.nanoTime();

        System.out.println(day1.mergeAlternately2("abc", "pqr"));
//        System.out.println(day1.mergeAlternately1("ab", "pqrs"));
//        System.out.println(day1.mergeAlternately1("abcd", "pq"));
//        System.out.println(day1.mergeAlternately1("b", "f"));
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed Time: " + elapsedTime + " nanoseconds");
    }
}