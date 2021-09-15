package com.ydc.boot;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.ydc.model.Emp;
import com.ydc.repository.EmpRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
public class EmpServiceTests {

	@Autowired
	private EmpRepository empRepository;

	@Test
	public void saveEmpTest() {

		// given
		Emp emp = new Emp();
		emp.setEname("JPA 입력 테스트");
		emp.setSal(1000);
		empRepository.save(emp);

		// when
		Emp retrivedEmp = empRepository.findById(emp.getEmpno()).get();

		// then
		Assert.assertEquals(retrivedEmp.getEname(), "JPA 입력 테스트");
		Assert.assertEquals(retrivedEmp.getSal(), 1000);

	}

}
