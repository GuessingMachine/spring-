package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		//스프링에게 지시하는 방법으로 코드를 변경
//		Exam exam = new NewlecExam();
//		ExamConsole console = new InlineExamConsole();
//		console.setExam(exam);
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		/*IOC 컨테이너에 담긴 것을 사용하는 법
		1. id값을 사용 : 골치 아픈점이 그 id에 해당하는 것이 어떤 class에 해당하는 것이 무엇이지 몰라 오브젝트 형으로 
		꺼내지기 때문에 Casting(형식 변화)을 해야함
		현재 IOC 컨테이너 이름 : context
		ExamConsole console = (ExamConsole) context.getBean("console");*/
		
		
		/*IOC 컨테이너에 담긴 것을 사용하는 법
		2. 자료형 명을 사용 :
		*/
		ExamConsole console = context.getBean(ExamConsole.class); //
		console.print();

	}

}
