
public  class ConcreteWatcher implements Watcher {

	@Override
	public void update(String time) {
		// TODO Auto-generated method stub
		System.out.println("当前时间"+time);
	}

	@Override
	public void addWatcher(ConcreteWatcher watcher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notofyWatchers(String string) {
		// TODO Auto-generated method stub
		
	}

}
