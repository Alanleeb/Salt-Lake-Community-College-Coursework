package midterm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Excercise1 {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		list.add('a');
		list.add('@');
		list.add('b');
		list.add('c');
		list.add('#');
		list.add('$');

		System.out.println("Original list: " + list);

		char item = '&';
		if (list.contains(item)) {
			System.out.println("the character '&' is part of the list");
		} else {
			System.out.println("the character '&' is not part of the list");
		}

		int i = (list.size() - 1);

		Collections.swap(list, 1, i);

		System.out.println("list: " + list);

		for (Character c : list) {
			if (Character.isLetter(c)) {
				System.out.print("true ");
			} else {
				System.out.print("false ");
			}
		}

	}

}
