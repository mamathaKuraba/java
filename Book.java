// // // // // // import java.util.*;
// // // // // // public class StringConcatenation {
// // // // // //     public static void main(String[] args) {
// // // // // //         Scanner sc = new Scanner(System.in);
// // // // // //         System.out.println("Enter an integer N:");
// // // // // //         int N = sc.nextInt();
// // // // // //         // Using StringBuilder
// // // // // //         long startTime = System.nanoTime();
// // // // // //         StringBuilder sb = new StringBuilder();
// // // // // //         for (int i = 1; i <= N; i++) {
// // // // // //             sb.append(i);
// // // // // //         }
// // // // // //         String resultWithBuilder = sb.toString();
// // // // // //         long endTime = System.nanoTime();
// // // // // //         long durationWithBuilder = endTime - startTime;
// // // // // //         System.out.println("Time taken with StringBuilder: " + durationWithBuilder + " nanoseconds");
// // // // // //         // Using + operator
// // // // // //         startTime = System.nanoTime();
// // // // // //         String resultWithPlus = "";
// // // // // //         for (int i = 1; i <= N; i++) {
// // // // // //             resultWithPlus += i;
// // // // // //         }
// // // // // //         endTime = System.nanoTime();
// // // // // //         long durationWithPlus = endTime - startTime;
// // // // // //         System.out.println("Time taken with + operator: " + durationWithPlus + " nanoseconds");
// // // // // //     }
// // // // // // 
// // // // // //replace substring: read a base string, atarget substring t replace, and  REPLACEMENT STRING.USE A STRINGBUILDER TO FING ALL OCCURANCES OF THE TARGET SUBSTRING AN REPLACE them with the replacement string.
// // // // // import java.util.*;
// // // // // public class replace{
// // // // //     public static void main(String[] args) {
// // // // //         Scanner sc = new Scanner(System.in);
// // // // //         System.out.println("Enter the base string:");
// // // // //         String baseString = sc.nextLine();
// // // // //         System.out.println("Enter the target substring to replace:");
// // // // //         String targetSubstring = sc.nextLine();
// // // // //         System.out.println("Enter the replacement string:");
// // // // //         String replacementString = sc.nextLine();
// // // // //         StringBuilder sb = new StringBuilder(baseString);
// // // // //         int index = sb.indexOf(targetSubstring);
// // // // //         while (index != -1) {
// // // // //             sb.replace(index, index + targetSubstring.length(), replacementString);
// // // // //             index = sb.indexOf(targetSubstring, index + replacementString.length());
// // // // //         }
// // // // //         System.out.println("Modified string: " + sb.toString());
// // // // //     }
// // // // // }
// // // // import java.util.*;
// // // // import java.util.stream.Node;
// // // // public class replace{
// // // //     public static void main(String[] args) {
// // // //         Scanner sc = new Scanner(System.in);
// // // //         String s = "mamatha";
// // // //         String sub = "atha";
// // // //         String re = "uuuu";
// // // //         StringBuilder sb = new StringBuilder(s);
// // // //         int index = sb.indexOf(sub);
// // // //         System.out.println(index);
// // // //         while (index != -1) {
// // // //             sb.replace(index, index + sub.length(), re);Node.OfLong
// // // //             System.out.println(sb);
// // // //             index = sb.indexOf(sub, index + re.length());
// // // //             System.out.println(index);
// // // //         }
// // // //         System.out.println("Modified string: " + sb.toString());
// // // //     }
// // // // }
// // // import java.util.*;
// // // public class met {
// // //     void display(){
// // //         System.out.println("disp");
// // //         return;
// // //     }
// // //     int play() {
// // //         return 10;
// // //     }
// // //     double walk(int km) {
// // //         return km+10;
// // //     }
// // //     void speak(int time) {
// // //         System.out.println(time);
// // //     }
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //         met m = new met();
// // //         m.display();
// // //     }
// // // }
// // public class car {
// //     int year;
// //     String make;
// //     String model;
//     public car(int year,String make,String model){
// //         this.year=year;
// //         this.make=make;
// //         this.model=model;
// //     }
// //     void displayinfo(){
// //         System.out.print("year:"+year+",");
// //         System.out.print("make:"+make+",");
// //         System.out.print("model:"+model); 
// //     }
// //     public static void main(String[] args) {
// //         car c1=new car(2020,"Toyota","Corolla");
// //         c1.displayinfo();
// //     }
    
// // }
// class Book {
//     String title;
//     String author;
//     // Constructor with title and author
//     Book(String t, String a) {
//         title = t;
//         author = a;
//     }
//     // Constructor with only title
//     Book(String t) {
//         title = t;
//         author = "unknown";
//     }
//     void display() {
//         System.out.println(title + " - " + author);
//     }
//     public static void main(String[] args) {
//         Book b1 = new Book("Harry Potter", "J.K. Rowling");
//         Book b2 = new Book("Mystery Book");
//         b1.display();
//         b2.display();
//     }
// }
