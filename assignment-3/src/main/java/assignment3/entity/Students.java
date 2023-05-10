package assignment3.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection="Product")
	public class Students {
	@Id
		private String id;
		private String name;
		private int age;
		private int semester;
		private String course;
		private int phoneNumber;
		private String fathersNameString;
		
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getSemester() {
			return semester;
		}
		public void setSemester(int semester) {
			this.semester = semester;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public int getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getFathersNameString() {
			return fathersNameString;
		}
		public void setFathersNameString(String fathersNameString) {
			this.fathersNameString = fathersNameString;
		}
		
		
		

}
