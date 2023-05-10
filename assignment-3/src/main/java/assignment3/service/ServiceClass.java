package assignment3.service;

import assignment3.entity.Students;
//import assignment3.entity.Product;
import assignment3.repo.RepositoryClass;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


   
    
//    private RepositoryClass ProductRepository;
//
//
//    public Flux<Dto> getProducts(){
//        return ProductRepository.findAll().map(Utils::entityToDto);
//    }
//   
//    public Mono<Dto> saveProduct(Mono<Dto> productDtoMono){
//        
//      return  productDtoMono.map(Utils::dtoToEntity)
//                .flatMap(ProductRepository::insert)
//                .map(Utils::entityToDto);
//    }
//
//    public Mono<Dto> updateProduct(Mono<Dto> productDtoMono,String id){
//       return ProductRepository.findById(id)
//                .flatMap(a->productDtoMono.map(Utils::dtoToEntity)
//                .doOnNext(q->q.setId(id)))
//                .flatMap(ProductRepository::save)
//                .map(Utils::entityToDto);
//    }
//
//    public Mono<Void> deleteProduct(String id){
//        return ProductRepository.deleteById(id);
//    }
//}
    

@Service
    public class ServiceClass implements IServices {
    	
	@Autowired
	private RepositoryClass studentRepository;

	@Override
	public Flux<Students> getAllStudents() {
		return studentRepository.findAll();
	}



	@Override
	public Mono<Students> addStudent(Students student) {
		return studentRepository.save(student);
	}

	@Override
	public Mono<Students> updateStudent(Students student) {
		return studentRepository.save(student);
	}

	@Override
	public Mono<Void> deleteStudentById(int studentId) {
		return studentRepository.deleteById(studentId);
	}

	
}