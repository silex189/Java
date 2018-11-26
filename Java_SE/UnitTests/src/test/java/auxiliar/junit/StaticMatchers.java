package test.java.auxiliar.junit;

interface StaticBooleanExpresion {
	
	boolean eval();
}

class StaticNot implements StaticBooleanExpresion {
	
	private StaticBooleanExpresion operand;
	
	private String operator;
	
	protected StaticNot(StaticBooleanExpresion operand){
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

abstract class StaticBinaryLogicalOperator implements StaticBooleanExpresion {
	
	private StaticBooleanExpresion left;
	
	private StaticBooleanExpresion right;
	
	private String operator;
	
	protected StaticBinaryLogicalOperator(String operator, StaticBooleanExpresion left, StaticBooleanExpresion right){
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

class StaticAnd extends StaticBinaryLogicalOperator {
	
	public StaticAnd(StaticBooleanExpresion left, StaticBooleanExpresion right){
		super("&&", left, right);
	}

	@Override
	public boolean eval() {
		return this.evalLeft() && this.evalRight();
	}
	
}

class StaticOr extends StaticBinaryLogicalOperator {
	
	public StaticOr(StaticBooleanExpresion left, StaticBooleanExpresion right){
		super("||", left, right);
	}

	@Override
	public boolean eval() {
		return this.evalLeft() || this.evalRight();
	}

}

abstract class StaticBinaryRelationalOperator implements StaticBooleanExpresion {
	
	private int left;
	
	private int right;
	
	private String operator;
	
	protected StaticBinaryRelationalOperator(String operator, int left, int right){
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

class StaticEqualsTo extends StaticBinaryRelationalOperator {
	
	public StaticEqualsTo(int left, int right){
		super("==", left, right);
	}

	@Override
	public boolean eval() {
		return this.evalLeft() == this.evalRight();
	}
	
}

class StaticGreatThan extends StaticBinaryRelationalOperator {
	
	public StaticGreatThan(int left, int right){
		super(">", left, right);
	}

	@Override
	public boolean eval() {
		return this.evalLeft() > this.evalRight();
	}

}

class StaticLessThan extends StaticBinaryRelationalOperator {
	
	public StaticLessThan(int left, int right){
		super("<", left, right);
	}

	@Override
	public boolean eval() {
		return this.evalLeft() < this.evalRight();
	}
	
}

public class StaticMatchers {

	public static StaticBooleanExpresion not(StaticBooleanExpresion operand){
		return new StaticNot(operand);
	}
	
	public static StaticBooleanExpresion and(StaticBooleanExpresion left, StaticBooleanExpresion right) {
		return new StaticAnd(left, right);
	}
	
	public static StaticBooleanExpresion or(StaticBooleanExpresion left, StaticBooleanExpresion right) {
		return new StaticOr(left, right);
	}
	
	public static StaticBooleanExpresion equalsTo(int left, int right) {
		return new StaticEqualsTo(left, right);
	}
	
	public static StaticBooleanExpresion greatThan(int left, int right) {
		return new StaticGreatThan(left, right);
	}
	
	public static StaticBooleanExpresion lessThan(int left, int right) {
		return new StaticLessThan(left, right);
	}
	
	public static void main(String[] arg){
		StaticBooleanExpresion booleanExpresion =
				not(and(or(greatThan(4,5),greatThan(5,4)),equalsTo(3,4)));
		System.out.println(booleanExpresion + " = " + booleanExpresion.eval());
	}
}
