package ru.spbstu.pp.lecture3;

import java.util.Objects;

public class EqualsExamples {

	static class Container {

		public Container(int id) {
			super();
			this.id = id;
		}

		int id;

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Container other = (Container) obj;
			return id == other.id;
		}

	}

	static class AnotherContainer {
		int x, y;
		String value;

		@Override
		public int hashCode() {
			return Objects.hash(value, x, y);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AnotherContainer other = (AnotherContainer) obj;
			return Objects.equals(value, other.value) && x == other.x && y == other.y;
		}

	}

	public static void main(String[] args) {
		Container c1 = new Container(10);
		Container c2 = new Container(10);

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

//		String s1 = "abc";
//		String s2 = "abc";
//		System.out.println(s1 == s2); // wrong!!!
//		System.out.println(s1.equals(s2));
	}

}
