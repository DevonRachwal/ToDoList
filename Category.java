
public enum Category {
	PERSONAL("Personal"), WORK("Work"), NONE("None");
	
	private String nameAsString;
	
	private Category(String nameAsString) {
		this.nameAsString =nameAsString;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nameAsString;
	}
}
