package assignment3.service;

import assignment3.entity.Students;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServices {
	
	public Flux<Students> getAllStudents();
	
	public Mono<Students> addStudent(Students student);
	public Mono<Students> updateStudent(Students student);
	public Mono<Void> deleteStudentById(int studentId);
}