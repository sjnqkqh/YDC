package com.ydc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empno;
	private String ename;
	private int sal;

}
