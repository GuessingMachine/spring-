package spring.di;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* ���������� �����ϴ� ������� �ڵ带 ����
		Exam exam = new NewlecExam();
		ExamConsole console = new InlineExamConsole();
		console.setExam(exam);
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		/*IOC �����̳ʿ� ��� ���� ����ϴ� ��
		2. �ڷ��� ���� ��� :
		*/ 
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		List <Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
		
		for(Exam e : exams ) // ���
			System.out.println(e);
	}

}
