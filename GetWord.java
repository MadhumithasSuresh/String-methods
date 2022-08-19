package stringmethods;

public class GetWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String greeting = "Congratulation";
        String message = greeting.substring(0,7);
        System.out.println(message);
        String word ="HelloWorld";
        String part = word.substring(5,word.length());
        System.out.println(part);
        String part1 = word.substring(5,10);
        System.out.println(part1);
        String part2 = word.substring(3,6);
        System.out.println(part2);
	}

}
