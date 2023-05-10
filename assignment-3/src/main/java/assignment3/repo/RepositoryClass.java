package assignment3.repo;



import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;



import assignment3.entity.Students;
import reactor.core.publisher.Mono;
//import reactor.core.publisher.Flux;


@Repository
public interface RepositoryClass extends ReactiveMongoRepository<Students,String> {
	Mono<Students> findById(int studentid);

	Mono<Void> deleteById(int studentId);
}