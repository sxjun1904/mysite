package frame.base.core.util.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 
 *  @author:    
 */

public interface IThreadPoolManager {

	/**
	 * 初始化条件
	 */
	public ThreadPoolExecutor createThreadPool();

	/**
	 * 获取池中所保存的线程数，包括空闲线程
	 * @return int
	 */
	public int getCorePoolSize();

	/**
	 * 设置池中所保存的线程数，包括空闲线程
	 * @param corePoolSize
	 */
	public void setCorePoolSize(int corePoolSize);

	/**
	 * 获取当线程数大于核心时，此为终止前多余的空闲线程等待新任务的最长时间
	 * @return long
	 */
	public long getKeepAliveTime();

	/**
	 * 设置当线程数大于核心时，此为终止前多余的空闲线程等待新任务的最长时间
	 * @param keepAliveTime
	 */
	public void setKeepAliveTime(long keepAliveTime);

	/**
	 * 获取池中允许的最大线程数
	 * @return int
	 */
	public int getMaximumPoolSize();

	/**
	 * 设置池中允许的最大线程数
	 * @param maximumPoolSize
	 */
	public void setMaximumPoolSize(int maximumPoolSize);

	/**
	 * 获取keepAliveTime 参数的时间单位
	 * @return TimeUnit
	 */
	public TimeUnit getTimeUnit();

	/**
	 * 设置keepAliveTime 参数的时间单位
	 * @param timeUnit
	 */
	public void setTimeUnit(TimeUnit timeUnit);

	/**
	 * 获取执行前用于保持任务的队列。此队列仅由保持 execute 方法提交的 Runnable 任务
	 * @return BlockingQueue<Runnable>
	 */
	public BlockingQueue<Runnable> getWorkQueue();

	/**
	 * 设置执行前用于保持任务的队列。此队列仅由保持 execute 方法提交的 Runnable 任务
	 * @param workQueue
	 */
	public void setWorkQueue(BlockingQueue<Runnable> workQueue);
}

