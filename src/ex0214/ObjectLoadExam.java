package ex0214;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectLoadExam {
    public ObjectLoadExam() {
    	//
    	try(ObjectInputStream ois = 
    			new ObjectInputStream(new FileInputStream("src/ex0214/objSave.txt"))){
    		
    		/*Student stu1 = (Student)ois.readObject();
    		Student stu2 = (Student)ois.readObject();
    		
    		System.out.println("stu1 = " + stu1);
    		System.out.println("stu2 = " + stu2);*/
    		
    		//저장된 list를 파일에서 조회한다.

			List<Student> object2 = (List<Student>)ois.readObject();

    		for(Student st : object2) {
    			System.out.println(st);
    		}
    		
    		
    	}catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
	public static void main(String[] args) {
		new ObjectLoadExam();

	}

}
