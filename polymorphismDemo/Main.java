package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
   //BaseLogger[] loggers= new BaseLogger[] { new FileLogger(), new DataBaseLogger(), new ConsoleLogger(), new EmailLogger()};
   // 
   //for(BaseLogger logger : loggers) {
   //  logger.Log("Log Mesajı");
   //  }
		
		
		CustomerManager customerManager = new CustomerManager( new FileLogger());
		customerManager.add();
	}

}
