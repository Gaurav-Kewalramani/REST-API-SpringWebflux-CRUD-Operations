package assignment3.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.*;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

import assignment3.handler.Handler;


@Configuration
public class Router {
	@Bean
	RouterFunction<ServerResponse> routerFunction(Handler studentHandler){
		return route(GET("/students"),studentHandler::getAllStudents)
				.andRoute(POST("/students/add"),studentHandler::addStudent)
				.andRoute(RequestPredicates.PUT("/students/{id}"),studentHandler::updateStudent)
				.andRoute(RequestPredicates.DELETE("/students/{id}"),studentHandler::deleteStudentById);
	}
}