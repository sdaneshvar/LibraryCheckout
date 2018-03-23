package hw1;

public class NotAllowedException extends Exception {
	private static final long serialVersionUID = 1L;
	public NotAllowedException() {}
	public String printException(String s1, String s2) {
		return ": Can't use " + s1 + " in " + s2 + " state";
	}
}
