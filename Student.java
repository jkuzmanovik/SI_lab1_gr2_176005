
class Student {
	String index;
	String firstName;
	String lastName;

	public Student(String i,String first,String last){
		index = i;
		firstName = first;
		lastName = last; 
	}
	String getIndex(){
		return this.index;
	}
	String getFirstName(){
		return this.firstName;
	}
	
	String getLastName(){
		return this.lastName;
	}

	void setFirstName(String name){
		firstName = name;
	}
	void setLastName(String last){
		lastName = last;
	}
	void setIndex(String i){
		index = i;
	}



	public double getAverage() {
		double sum = 0;
		for (int i=0;i<grades.length;i++){
			sum+=grades[i];
		}
		return (sum/grades.length);

	}

	public int ECTSCredits() {
		int krediti = 0;
		for (int i=0;i<grades.length;i++){
			if(grades[i] > 5){
				krediti++;
			}
		}
		return (krediti * 6);

	}
	int grades[] = {7,7,10,10};
}
