package DesignPatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
      private  Map<String, Student> students=new HashMap<>();
    public  void register(String key, Student student){
        students.put(key, student);
    }

    public Student get(String key){
        return students.get(key);
    }

}
