package telran.homework.numbers;

import java.util.function.DoubleBinaryOperator;

public class Calculator {
	private static char[] operations = { '+', '-', '*', '/' };
	private static DoubleBinaryOperator[] operators = { (a, b) -> a + b, (a, b) -> a - b, (a, b) -> a * b,
			(a, b) -> a / b };

	static public double calculate(CalcData cd) {
		char operation = cd.getOperation();
		for (int i = 0; i < operations.length; i++) {
			if (operation == operations[i]) {
				return operators[i].applyAsDouble(cd.getOp1(), cd.getOp2());
			}
		}
		return 0;
	}
}