package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	public InlineExamConsole() {
	}
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}


	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}

	@Autowired //xml 설정파일에 <property name="exam" ref = "exam"></property> 부분을 대신하게 됨 
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
