package com.myapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {

	private @NonNull Integer id;
	private @NonNull String firstName;
	private @NonNull String lastName;
	private @NonNull String email;

}
