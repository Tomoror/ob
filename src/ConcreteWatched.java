import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract  class ConcreteWatched implements Watched{
    private List<Watcher> list=new ArrayList<Watcher>();

	
	public void addWatcher(Watcher watcher) {
		// TODO Auto-generated method stub
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		// TODO Auto-generated method stub
		list.remove(watcher);
	}

	@Override
	public void notofyWatchers(String time) {
		// TODO Auto-generated method stub
		for(Watcher watcher:list){
			watcher.update(time);
		}
		
	}

}
