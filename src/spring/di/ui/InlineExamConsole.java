package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	// 1�� ��ġ @Autowired
	private Exam exam;
	
	public InlineExamConsole() {
	}
	
	// 2�� ��ġ @Autowired
	// @Qualifier("exam2")�Ű������� ����
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}


	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}

	// 3�� ��ġ @Autowired //xml �������Ͽ� <property name="exam" ref = "exam"></property> �κ��� ����ϰ� �� 
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
