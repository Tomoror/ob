import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Text {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Watcher a=new ConcreteWatcher();
       for(int i=1;i<=100;i++){
    	   ConcreteWatcher watcher=new   ConcreteWatcher();
    	 a.addWatcher(watcher);
    	 a.notofyWatchers("时间变化"+time);
    	
       }
      
	
	 }
	private  static  String time;
	
	public String setTime(){
		 return "当前时间"+time;
	 }
	 public void getTime(String time){
		 Date date=new Date();
		 DateFormat format=new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		 time=format.format(date);
	}
}