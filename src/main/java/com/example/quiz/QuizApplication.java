package com.example.quiz;

import com.example.quiz.entity.Quiz;
import com.example.quiz.repository.QuizRepository;
import com.example.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
//				.getBean(QuizApplication.class).execute();
	}

//	@Autowired
//	QuizRepository repository;

//	@Autowired
//	QuizService service;
//	private void execute(){
////		setup();
////		showList();
////		showOne();
////		updateQuiz();
////		deleteQuiz();
//		doQuiz();
//	}
//
//	private void setup(){
//		System.out.println("--- 등록 처리 개시 ---");
//		Quiz quiz1 = new Quiz(null, "자바는 객체지향 언어입니다.", true, "등록 담당");
//		Quiz quiz2 = new Quiz(null, "스프링 데이터는 데이터 액세스에 관련된 기능을 제공합니다.", true, "등록 담당");
//		Quiz quiz3 = new Quiz(null,"프로그램이 많이 등록되어 있는 서버를 라이브러리라고 합니다." ,false, "등록 담당");
//		Quiz quiz4 = new Quiz(null,"@Component는 인스턴스 생성 어노테이션 입니다.", true , "등록 담당");
//		Quiz quiz5 = new Quiz(null,"스프링 MVC에서 구현하고 있는 디자인 패턴에서 모든 요청을 하나의 컨트롤러에서 받는 것을 싱글 컨트롤러 패턴이라고 합니다.", false , "등록 담당");
//		List<Quiz> quizList = new ArrayList<>();
//		Collections.addAll(quizList, quiz1, quiz2, quiz3, quiz4, quiz5);
//		for(Quiz quiz : quizList){
//			service.insertQuiz(quiz);
//		}
//		System.out.println("--- 등록 처리 완료 ---");
////		Quiz quiz1 = new Quiz(null, "Spring은 프레임워크입니까?", true, "홍길동");
////		quiz1 = repository.save(quiz1);
////		System.out.println("등록한 퀴즈는 " + quiz1 + "입니다.");
////
////		Quiz quiz2 = new Quiz(null, "스프링 MVC는 배치 처리를 제공합니까?", false, "홍길동");
////		quiz2 = repository.save(quiz2);
////		System.out.println("등록한 퀴즈는 " + quiz2 + "입니다.");
//
//	}
//
//	private void showList(){
//		System.out.println("--- 모든 데이터 취득 개시 ---");
//		Iterable<Quiz> quizzes = service.selectAll();
//		for (Quiz quiz: quizzes){
//			System.out.println(quiz);
//		}
//		System.out.println("--- 모든 데이터 취득 완료 ---");
//	}
//
//	private void showOne(){
//		System.out.println("--- 1건 취득 개시 ---");
//		Optional<Quiz> quizOpt = service.selectOneById(1);
//
//		if (quizOpt.isPresent()){
//			System.out.print(quizOpt.get());
//		} else {
//			System.out.println("해당 데이터는 존재하지 않습니다.");
//		}
//		System.out.println("--- 1건 취득 완료 ---");
//	}
//
//	private void updateQuiz(){
//		System.out.println("--- 변경 처리 개시 ---");
//		Quiz quiz1 = new Quiz(1, "스프링은 프레임워크입니까? ", true, "변경 담당");
//		service.updateQuiz(quiz1);
//		System.out.println("변경된 데이터는 " + quiz1 + "입니다.");
//		System.out.println("--- 변경 처리 완료 ---");
//	}
//
//	private void deleteQuiz() {
//		System.out.println("--- 삭제 처리 개시 ---");
//		service.deleteQuizById(2);
//		System.out.println("--- 삭제 처리 완료 ---");
//	}
//
//	private void doQuiz(){
//		System.out.println("--- 퀴즈 1건 취득 개시 ---");
//		Optional<Quiz> quizOpt = service.selectOneRandomQuiz();
//		if(quizOpt.isPresent()){
//			System.out.println(quizOpt.get());
//		} else {
//			System.out.println("해당 데이터는 존재하지 않습니다.");
//		}
//		System.out.println("--- 퀴즈 1건 취득 완료 ---");
//
//		Boolean myAnswer = false;
//		Integer id = quizOpt.get().getId();
//		if (service.checkQuiz(id, myAnswer)) {
//			System.out.println("정답입니다!!!");
//		} else {
//			System.out.println("오답이니다.");
//		}
//	}
}
