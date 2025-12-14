package com.medialogic.bean;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CfResponse {

	private LocalDate dataDiNascita;
	private int eta;
	
}
