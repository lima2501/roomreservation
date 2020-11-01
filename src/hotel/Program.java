package hotel;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Número de estudantes: ");
		int studentsNumber = scan.nextInt();
		scan.nextLine();

		Student[] vectStudent = new Student[10];

		System.out.println("Dados dos estudantes");
		for (int i = 0; i < studentsNumber; i++) {
			System.out.print("Nome: ");
			String name = scan.nextLine();
			System.out.print("Email: ");
			String email = scan.nextLine();
			System.out.print("Quarto: ");
			Integer room = scan.nextInt();
			scan.nextLine();

			vectStudent[room] = new Student(name, email, room);
		}

		System.out.println("Quartos ocupados");
		for (int i = 0; i < vectStudent.length; i++) {
			if (vectStudent[i] != null) {
				System.out.println(vectStudent[i]);
			}
		}

		scan.close();
	}

}
