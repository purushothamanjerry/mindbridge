package day7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import day7.Person;

public class Reflection {
	
	public static void main(String[] args) {
		try {
		Class cls=Class.forName("day7.Person");
		Constructor cons[] =cls.getDeclaredConstructors();
        for (int i=0;i< cons.length;i++)
        {
            System.out.println(cons[i]);
        }
        Field fields[] =cls.getDeclaredFields();
        for (int i=0;i< fields.length;i++)
        {
            System.out.println(fields[i]);
        }
        Person p = (Person)cons[1].newInstance("Purushothaman",21);
        Method methods[] =cls.getDeclaredMethods();
        for (int i=0;i< methods.length;i++)
        {
            System.out.println(methods[i]);
        }

        for (int i=0;i< methods.length;i++)
        {
            if(methods[i].getName().equals("getName"))
            {
                methods[i].invoke(p);
            }
            if(methods[i].getName().equals("getAge"))
            {
                methods[i].invoke(p);
            }
        
        }
        }catch(Exception e) {
			   e.printStackTrace();
	
}
		
		
		
	
	
	

}
	}
