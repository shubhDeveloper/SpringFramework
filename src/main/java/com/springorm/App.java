package com.springorm;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;
import com.springorm.dao.StudentDao;
import com.springorm.entity.Student;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/ormConfig.xml");
		StudentDao bean = context.getBean("studentDao", StudentDao.class);

//		*************Insert Data**************
		/*
		 * 
		 * //Create Studnet Object Student std = new Student(); std.setId(123);
		 * std.setName("Shubham"); std.setCity("indore");
		 * 
		 * //insert student data int insert = bean.insert(std); System.out.println
		 * (insert);
		 * 
		 */

		boolean go = true;

		while (go) {

			System.out.println(
					"Insert new student : 1\nGet all student : 2\nGet single student : 3\nUpdate Student : 4\nDelete student : 5\nexit : 6");

			System.out.println("\n*********************************************************************\n");

			Scanner scanner = new Scanner(System.in);

			try {

				int i = scanner.nextInt();

				switch (i) {

				case 1:
					// insert student
					Student stdI = new Student();
					System.out.println("Enter Student id");
					int idI = scanner.nextInt();
					stdI.setId(idI);
					System.out.println("Enter Studnet name");
					String nameI = scanner.next();
					stdI.setName(nameI);
					System.out.println("Enter Studnet city");
					String cityI = scanner.next();
					stdI.setCity(cityI);

					int insert = bean.insert(stdI);
					System.out.println(insert + " Data inserted succesfully");

					System.out.println("\n**********************************************************\n");
					break;

				case 2:
					// get all students
					List<Student> allStudents = bean.getAllStudents();

					for (Student stdA : allStudents) {
						System.out.println();
						System.out.println("student id is = " + stdA.getId());
						System.out.println("student name is = " + stdA.getName());
						System.out.println("student city is = " + stdA.getCity());
						System.out.println("___________________________________________");
					}

					System.out.println("\n***************************************************\n");
					break;

				case 3:
					// get single student
					System.out.println("Enter the id of student which you want to get");
					int idS = scanner.nextInt();

					Student stdS = bean.getStudent(idS);
					System.out.println("Student id is : " + stdS.getId());
					System.out.println("Student name is : " + stdS.getName());
					System.out.println("Student city is : " + stdS.getCity());

					System.out.println("\n*******************************************************\n");
					break;

				case 4:
					// update student
					System.out.println("Enter Student id : ");
					int idU = scanner.nextInt();
					System.out.println("Enter Student name : ");
					String nameU = scanner.next();
					System.out.println("Enter City : ");
					String cityU = scanner.next();

					Student stdU = new Student();
					stdU.setId(idU);
					stdU.setName(nameU);
					stdU.setCity(cityU);
					bean.update(stdU);

					System.out.println("\n*****************************************************\n");
					break;

				case 5:
					// delete student
					System.out.println("Enter Student id : \n");
					int idD = scanner.nextInt();
					bean.deleteStudent(idD);
					System.out.println(idD + " Student deleted");

					System.out.println("\n******************************************************\n");
					break;

				case 6:
					go = false;
					break;
				}

			}

			catch (Exception e) {
				System.out.println("\n******************pleace enter valid syntax*****************\n");
			}
		}

		System.out.println("Thankyou for using my application\nSee you soon");
	}
}
