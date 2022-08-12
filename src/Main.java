import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("성적관리프로그램 시작");
		List<Student> list = new ArrayList<Student>(2);
		Input input = new Input(list);
		input.fileinput();
		
		Calc calc = new Calc(list);
		calc.calc();
		
		Sort sort = new Sort(list);
		sort.sort();
		
		Output output = new Output();
		output.printLabel();
		output.print(list);
		
		System.out.println("성적관리프로그램 끝");
	}
}
