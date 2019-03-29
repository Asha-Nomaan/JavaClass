package com.class12;

import java.util.Scanner;

public class UsernamePassword {
	public static void main(String[] args) {

		String userName, confirmPassword, password, message;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter username");
		userName = input.nextLine();

		System.out.println("Please enter password");
		password = input.nextLine();

		System.out.println("Please confirm password");
		confirmPassword = input.nextLine();

		if (!userName.isEmpty() && password.isEmpty()) {
			if (password.length() > 8) {
				if (!password.contains(userName)) {
					if (password.equals(confirmPassword)) {
						message = "Your username and password had been created";
					} else {
						message = "Password doesn't match";
					}

				} else {
					message = "Password can't contain username";
				}

			} else {
				message = "Password is too short";
			}

		} else {
			message = "Username and Password cannot be empty";
		}

		System.out.println(message);

	}
}
