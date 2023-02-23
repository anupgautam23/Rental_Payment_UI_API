package com.masai.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@javax.persistence.Entity
public class Customer {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer Id;
	 private String Name; 
	 private String mobile;
	 private String email; 
	 private String address;

}
