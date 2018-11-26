package test.java.auxiliar.junit;

interface BooleanExpresion {
	
	boolean eval();
}

class Not implements BooleanExpresion {
	
	private BooleanExpresion operand;
	
	private String operator;
	
	protected Not(BooleanExpresion operand){
		this.operator = "!";
		this.operand = operand;
	}
	
	public boolean eval(){
		return !operand.eval();
	}
	
	@Override
	public String toString() {
		return "(" + operator + " " + operand + ")";
	}
	
}

abstract class BinaryLogicalOperator implements BooleanExpresion {
	
	private BooleanExpresion left;
	
	private BooleanExpresion right;
	
	private String operator;
	
	protected BinaryLogicalOperator(String operator, BooleanExpresion left, BooleanExpresion right){
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	
	protected boolean evalLeft() {
		return left.eval();
	}
	
	protected boolean evalRight() {
		return right.eval();
	}
	
	public abstract boolean eval();
	
	@Override
	public String toString() {
		return "(" + left + " " + operator + " " + right + ")";
	}
	
}

class And extends BinaryLogicalOperator {
	
	public And(BooleanExpresion left, BooleanExpresion right){
		super("&&", left, right);
	}

	@Override
	public boolean eval() {
		return this.evalLeft() && this.evalRight();
	}
}

class Or extends BinaryLogicalOperator {
	
	public Or(BooleanExpresion left, BooleanExpresion right){
		super("||", left, right);
	}

	@Override
	public boolean eval() {
		return this.evalLeft() || this.evalRight();
	}
}

abstract class BinaryRelationalOperator implements BooleanExpresion {
	
	private int left;
	
	private int right;
	
	private String operator;
	
	protected BinaryRelationalOperator(String operator, int left, int right){
		this.operator = operator;
		this.left = left;
		this.right = right;
	}
	
	protected int evalLeft() {
		return left;
	}
	
	protected int evalRight() {
		return right;
	}
	
	public abstract boolean eval();
	
	@Override
	public String toString() {
		return "(" + left + " " + operator + " " + right + ")";
	}
	
}

class EqualsTo extends BinaryRelationalOperator {
	
	public EqualsTo(int left, int right){
		super("==", left, right);
	}

	@Override
	public boolean eval() {
		return this.evalLeft() == this.evalRight();
	}
}

class GreatThan extends BinaryRelationalOperator {
	
	public GreatThan(int left, int right){
		super(">", left, right);
	}

	@Override
	public boolean eval() {
		return this.evalLeft() > this.evalRight();
	}
}

class LessThan extends BinaryRelationalOperator {
	
	public LessThan(int left, int right){
		super("<", left, right);
	}

	@Override
	public boolean eval() {
		return this.evalLeft() < this.evalRight();
	}
}

public class Matchers {

	public static void main(String[] arg){
		BooleanExpresion booleanExpresion =
				new Not(
					new And(
						new Or(
							new GreatThan(4,5),
							new GreatThan(5,4)),
						new EqualsTo(3,4)));
		System.out.println(booleanExpresion + " = " + booleanExpresion.eval());
	}
}
