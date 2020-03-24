package com.trennble.concurrent.aqs;

/**
 * 原因：    因为 ReadWrite读写锁的写锁在被唤醒的时候，并没有向后传递，因此这里猜想：
 *           1.同一个线程的读写请求同时在队里时，唤醒写锁并不会唤醒读锁
 *           2.但是因为在释放读锁的时候会对后续节点进行传播，但是会判断后续节点是不是共享模式，所以也不会对后续写锁进行唤醒
 *           3.因为线程的阻塞性，每个线程在CLH队列中只有一个节点（哈哈，不用验证了，直接证明了1.2条，clear）
 */
public class ReadWriteLockTest {
}
