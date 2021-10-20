package ru.spbstu.pp.lecture5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SomethingIterable implements Iterable<Integer> {

	private int x1;
	private int x2;

	public SomethingIterable(int i, int j) {
		this.x1 = i;
		this.x2 = j;
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {

			int cnt;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return cnt < 2;
			}

			@Override
			public Integer next() {

				if (cnt > 1) {
					throw new NoSuchElementException();
				}
				
				int r = 0;
				if (cnt == 0) {
					r = x1;
				} else if (cnt == 1) {
					r = x2;
				}
				cnt++;
				return r;
			}

		};
	}
}
