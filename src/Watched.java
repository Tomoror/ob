
public interface  Watched {
	public void addWatcher(Watcher watcher);
	public void removeWatcher(Watcher watcher);
	public void notofyWatchers(String time);
	void notofyWatchers(Watched time);

}
