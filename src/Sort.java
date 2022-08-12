import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

	private List<Student> list;


	public Sort(List<Student> list) {
		this.list = list;
	}
	
//	public void sort() { //Comparator 재정의 해서 자식 만들거나
//		Collections.sort(this.list,new MyComparator());
//	}
//	
//	class MyComparator implements Comparator<Student>{
//
//		@Override
//		public int compare(Student front, Student back) {
//			return back.getTot()-front.getTot();
//		}
//		
//	}
	public void sort() {	//익명 클래스 이용한 방법
		Collections.sort(this.list,new Comparator<Student>() {

			@Override
			public int compare(Student front, Student back) {
				return front.getName().compareTo(back.getName());
			}
		});
	}
	
}
