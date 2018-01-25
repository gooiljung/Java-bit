package kr.ac.smu.day08.homework;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Ignore;
import org.junit.Test;

public class JUnitTest {
	@Test   // Test 를 꼭 해줘야 메인을 실행 안시키고 이거를 테스트해줌 
	// test 안하려면 위에 @Ignore 붙여주면 된다. 
	public void triangleTest() {
		Shape sh=new Triangle();
		assertNotNull(sh); // sh가 null이 아닐경우에 초록색 화면 뛰움
		//assertNull(sh); // sh가 null일경우 초록화면 
	}
}
