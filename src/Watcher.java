public interface Watcher
{
		public void update(String time);

		public void addWatcher(ConcreteWatcher watcher);

		public void notofyWatchers(String string);
	
}