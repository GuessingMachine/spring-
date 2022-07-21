package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	// 1번 위치 @Autowired
	private Exam exam;
	
	public InlineExamConsole() {
	}
	
	// 2번 위치 @Autowired
	// @Qualifier("exam2")매개변수에 적음
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}


	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}

	// 3번 위치 @Autowired //xml 설정파일에 <property name="exam" ref = "exam"></property> 부분을 대신하게 됨 
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
