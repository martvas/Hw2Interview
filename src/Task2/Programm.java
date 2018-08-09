package Task2;

class Programm{
	public static void main(String[] args){
		Report report = new Report();
		report.calculate();
		report.output(OutputType.Printer);
		//или
		report.output(OutputType.Display);
	}
}