import java.util.Random;

public class PasswordGen {

	private final static int DEFAULT_LENGTH = 8;
	private final static StringBuffer DEFAULT_POOL = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
	
	private StringBuffer pool;
	private int length;

	public PasswordGen(StringBuffer pool, int length) {
		this.pool = pool;
		this.length = length;
	}

	public PasswordGen(StringBuffer pool) {
		this(pool, DEFAULT_LENGTH);
	}
	
	public PasswordGen(int length) {
		this(DEFAULT_POOL, length);
	}
	
	public PasswordGen() {
		this(DEFAULT_POOL, DEFAULT_LENGTH);
	}

	public StringBuffer getPool() {
		return pool;
	}

	public void setPool(StringBuffer pool) {
		this.pool = pool;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String gen() {
		StringBuilder password = new StringBuilder();
		int range = pool.length();

		for (int i = 0; i < length; i++) {

			Random r = new Random();
			password.append(pool.charAt(r.nextInt(range)));
		}

		return password.toString();
	}

}
