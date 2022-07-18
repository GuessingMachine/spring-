package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		//���������� �����ϴ� ������� �ڵ带 ����
//		Exam exam = new NewlecExam();
//		ExamConsole console = new InlineExamConsole();
//		console.setExam(exam);
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		/*IOC �����̳ʿ� ��� ���� ����ϴ� ��
		1. id���� ��� : ��ġ �������� �� id�� �ش��ϴ� ���� � class�� �ش��ϴ� ���� �������� ���� ������Ʈ ������ 
		�������� ������ Casting(���� ��ȭ)�� �ؾ���
		���� IOC �����̳� �̸� : context
		ExamConsole console = (ExamConsole) context.getBean("console");*/
		
		
		/*IOC �����̳ʿ� ��� ���� ����ϴ� ��
		2. �ڷ��� ���� ��� :
		*/
		ExamConsole console = context.getBean(ExamConsole.class); //
		console.print();

	}

}
