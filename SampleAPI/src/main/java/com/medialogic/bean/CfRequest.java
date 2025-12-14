package com.medialogic.bean;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CfRequest {
	
	@Size(min = 16, max = 16, message = "cf must be 16 characters")
	@NotBlank(message = "cf is mandatory")
	@Pattern(
		regexp = "^[A-Z]{6}\\d{2}[A-EHLMPR-T](0[1-9]|[12]\\d|3[01]|4[1-9]|5\\d|6\\d|7[01])[A-Z]\\d{3}[A-Z]$",
		message = "cf format is invalid"
	)
	private String cf;

}
