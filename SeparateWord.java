package stringmethods;

public class SeparateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String courseName = "Java,PYTHON,C++,SQL";
		String[] courseList = courseName.split(",");
        System.out.println(courseList[0].length());
        System.out.println(courseList[0].toLowerCase());
        System.out.println(courseList[1].length());
        System.out.println(courseList[1].toLowerCase());
        System.out.println(courseList[2].length());
        System.out.println(courseList[2].toLowerCase());
        System.out.println(courseList[3].length());
        System.out.println(courseList[3].toLowerCase());
        
        System.out.println("Welcome india");
            
        
	}

}
