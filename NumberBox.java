
	package lab.generics;

	public class NumberBox<T extends Number> {

	    private T item;

	    public void setItem(T item) {
	        this.item = item;
	    }

	    public T getItem() {
	        return item;
	    }

	    public double addNumbers(T a, T b) {
	        return a.doubleValue() + b.doubleValue();
	    }
	}
