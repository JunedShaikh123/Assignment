package Assignment11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


	
public class SingletonTest {
    @Test
    public void TestSingletonObject(){

    	 Singleton st1 = Singleton.getSingleton();
         Singleton st2 = Singleton.getSingleton();
        //Passes
       assertTrue(SingletonCheck.checksingleton(st1, st2));
       
    }
}