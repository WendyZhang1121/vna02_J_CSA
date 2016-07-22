package vna02_J_CSA;

import java.util.concurrent.atomic.AtomicBoolean;
	final class Flag {
		private AtomicBoolean flag = new AtomicBoolean(true);
		
		public void toggle() { 
			boolean temp;
			do {
				temp = flag.get();
			} while (!flag.compareAndSet(temp, !temp));
		}
		
		public AtomicBoolean getFlag() { 
			return flag;
		} 
		}
