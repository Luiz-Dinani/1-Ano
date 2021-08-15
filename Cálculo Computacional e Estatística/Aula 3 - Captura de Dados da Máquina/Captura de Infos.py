import psutil
import time
for i in range(1, 5):
    print(psutil.cpu_times(percpu=True))
    print("\n"*2)
    time.sleep(5)
