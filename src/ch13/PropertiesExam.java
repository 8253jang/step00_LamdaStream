package ch13;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesExam {
	Properties pro = new Properties();
	
    public PropertiesExam() {
    	//저장
    	pro.setProperty("id", "jang");
    	pro.setProperty("name", "희정");
    	pro.setProperty("age", "20");
    	
    	
    	System.out.println("---저장된 정보 확인 하기 -----");
    	//저장된 정보 검색
    	//for(Object key : pro.keySet() ) {
    	for(String key : pro.stringPropertyNames()) {
    	   String value = pro.getProperty(key);
    	   System.out.println(key+" : " + value);
    	}
    	
    }
    
    //////////////////////////////////////
    /**
     * 외부의 ~.properties파일을 로딩하는 방법
     *  1) IO를 이용하는 방법
     *  2) ResourceBundle 이용하는 방법
     * */
    
    //1) IO를 이용하는 방법
    public void test01() {
    	try {
    		
    	  pro.load(new FileInputStream("src/ch13/dbInfo.properties"));
    	  
    	  //출력해보자
    	  for(String key : pro.stringPropertyNames()) {
       	    String value = pro.getProperty(key);
       	    System.out.println(key+" : " + value);
       	  }
    	  
    	}catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    
    //2) ResourceBundle 이용하는 방법
    public void test02() {
    	
    }
    
    
    
	public static void main(String[] args) {
		PropertiesExam pe= new PropertiesExam();
		pe.test01();

	}

}








