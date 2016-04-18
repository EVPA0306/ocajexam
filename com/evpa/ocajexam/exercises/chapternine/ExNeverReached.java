package com.evpa.ocajexam.exercises.chapternine;

import java.util.*;

public class ExNeverReached {

	public ExNeverReached() throws Exception, Throwable {
		//demonstrateTryFinally();
		//demonstrateTryWithResource();
		//forceStackOverFlowError(0);
		throw new Throwable();
	}

	public static void main(String[] args) throws Exception, Throwable  {
		/*try {
			System.out.println("What's up!");
			//throw new ArithmeticException();
			int result = 3 / 0;
			System.out.println("This code never reached");
		} catch (ArithmeticException ae) {
			System.out.println("But ArithmeticException one is reached!");
			ae.printStackTrace();
			System.out.println(ae.getMessage());
			System.out.println(ae.toString());
			throw new RuntimeException(ae.getMessage());
		} catch (RuntimeException re) {
			System.out.println("But RuntimeException one is reached!");
			re.printStackTrace();
			//throw new Exception(re.getMessage());
		} catch (Exception e) {
			System.out.println("But Exception one is reached!");
			e.printStackTrace();
		}*/

		new ExNeverReached();
	}

	private Integer forceStackOverFlowError(Integer intgr) {
		intgr++;
		System.out.println(intgr);
		return forceStackOverFlowError(intgr);
	}

	private void forceOutOfMemoryError() {
		Integer counter = 0;
		List<Integer> unstopable = new ArrayList<>();
		while (true) {
			unstopable.add(counter);
			counter++;
			if (counter % 10000 == 0) {
				System.out.println(counter);
			}
		}
	}

	private void demonstrateTryFinally() {
		try {
			System.out.print("Try ");
			//System.exit(0);
			throw new ArithmeticException();
		} finally {
			System.out.println("and Finally");
		}
	}

	private void demonstrateTryWithResource() {
		//Scanner scan = new Scanner(System.in);
		try(Scanner scan = new Scanner(System.in)) {
			System.out.println(scan.nextInt());
		} catch (InputMismatchException ime) {
			ime.printStackTrace();
		}
		/*} finally {
			System.out.println("We gotta close Scanner");
			scan.close();
		}*/
	}
}