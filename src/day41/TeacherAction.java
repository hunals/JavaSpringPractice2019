package day41;

public class TeacherAction {

	public static void main(String[] args) {
		
		
		Teacher akbar = new Teacher();
//		System.out.println(akbar.name);
//		System.out.println(akbar.pecialty);
		
		akbar.setName("Akbar");
		akbar.setSpecialty("magic");
		
		System.out.println(akbar.getName());
		System.out.println(akbar.getSpecialty());
		
		akbar.setName("MagicMan Spartan");
		akbar.setSpecialty("Release magic horse");
		
		System.out.println(akbar.getName());
		System.out.println(akbar.getSpecialty());
	}

}
