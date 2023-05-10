package assignment3.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import assignment3.entity.Students;
import assignment3.service.IServices;

import reactor.core.publisher.Mono;

@Component
public class Handler {
	
	@Autowired
	IServices studentServiceImpl;
	
	public Mono<ServerResponse> getAllStudents(ServerRequest serverRequest){
		return ServerResponse
				.ok()
				.body(studentServiceImpl.getAllStudents(),Students.class);
	}
	
	
	
	public Mono<ServerResponse> addStudent(ServerRequest serverRequest){
		
		 Mono<Students> studentMono = serverRequest.bodyToMono(Students.class);
	        return  studentMono.flatMap(student -> ServerResponse
	                 
	             .status(HttpStatus.CREATED)
	             .body(studentServiceImpl.addStudent(student),Students.class) );

	}
	
	public Mono<ServerResponse> updateStudent(ServerRequest serverRequest) {
		Mono<Students> student = serverRequest.bodyToMono(Students.class);
		Mono<Students> updatedStudent = student.flatMap(studentServiceImpl::updateStudent);
		return ServerResponse
				.status(HttpStatus.CREATED)
				
				.body(updatedStudent,Students.class);
	}
	
	public Mono<ServerResponse> deleteStudentById(ServerRequest serverRequest) {
		int studentId = Integer.parseInt(serverRequest.pathVariable("id"));
		return ServerResponse
				.ok()
				.body(studentServiceImpl.deleteStudentById(studentId), Students.class);
	}
}