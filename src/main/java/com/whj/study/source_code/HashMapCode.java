package com.whj.study.source_code;

import java.util.*;
import java.util.HashMap;

/**
 * @description: 学习HashMap源码
 * @author: whj
 * @time: 2020/4/24 9:32
 */
public class HashMapCode<K,V> implements Map<K,V> {
    /** transient:非序列化 map长度*/
    transient int size;
    /**
     * 表，第一次使用时初始化，并调整大小为必要的。当分配时，长度总是2的幂。
     *(我们也容忍长度为零的一些操作允许目前不需要的引导机制。)
     * */
    transient Node<K,V>[] table;
    int threshold;
    /**最大容量*/
    static final int MAXIMUM_CAPACITY = 1 << 30;
    /**
     * 默认初始容量 16
     */
    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
    /**
     * 默认加载因子
     */
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    /**
     * 链长度大等于8时转为treenode
     */
    static final int TREEIFY_THRESHOLD = 8;
    /**
     * 此HashMap在结构上修改的次数
     */
    transient int modCount;


    public HashMapCode() {
        this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted
    }
    public HashMapCode(int initialCapacity) {
        this(initialCapacity, DEFAULT_LOAD_FACTOR);
    }
    /**
     * table的加载因子
     */
    final float loadFactor;
    public HashMapCode(int initialCapacity, float loadFactor) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal initial capacity: " +
                    initialCapacity);
        }
        if (initialCapacity > MAXIMUM_CAPACITY) {
            initialCapacity = MAXIMUM_CAPACITY;
        }
        if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
            throw new IllegalArgumentException("Illegal load factor: " +
                    loadFactor);
        }
        this.loadFactor = loadFactor;
        this.threshold = tableSizeFor(initialCapacity);
    }

    public static void main(String[] args) {
//        int i = tableSizeFor(17);
//        System.out.println(i);
        System.out.println(Float.isNaN(0.1f));
        System.out.println(Float.isNaN((float)2.2250738585072012e-32));
        System.out.println(Float.isNaN((float)Math.PI));
        System.out.println(0.0/0.0);
        System.out.println(Float.isNaN((float)(0.0/0.0)));
        System.out.println( Integer.MAX_VALUE - MAXIMUM_CAPACITY );
    }
    /**
     * Returns a power of two size for the given target capacity.
     * 为给定的目标容量返回>=目标的、最小的2的幂。
     * 例：输入13， 返回16
     *    输入17， 返回32
     */
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return getNode(hash(key), key) != null;
    }

    private Node<K,V> getNode(int hash, Object key) {
        // TODO


        return null;
    }

    static class Node<K,V> implements Map.Entry<K,V> {

        final int hash;
        final K key;
        V value;
        Node<K,V> next;
        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public final String toString() {
            return key + "=" + value;
        }
        @Override
        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }
        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry<?,?> e = (Map.Entry<?,?>)o;
            if (Objects.equals(key, e.getKey()) &&
                    Objects.equals(value, e.getValue())) {
                return true;
            }
            return false;
        }
    }
    static int hash(Object key) {
        int h;
        /*
            >>> 无符号右移
            ^ 异或 相同取0，相反取1
         */
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {

        return putVal(hash(key), key, value, false, true);
    }

    final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
        Node<K,V>[] tab; Node<K,V> p; int cap, i;
        // 如果是空数组，扩容
        if ((tab = table) == null || (cap = tab.length) == 0) {
            cap = (tab = resize()).length;
        }
        // 如果对应位置=null，直接赋值
        if ((p = tab[(i= hash & (cap-1))]) == null) {
            tab[i] = newNode(hash, key, value, null);
        } else {
            Node<K, V> e;
            K k ;
            if (p.hash == hash &&
                    ((k = p.key) == key || (key != null && key.equals(k)))) {
                e = p;
            // TODO
//            } else if (p instanceof HashMap.TreeNode){
//                e = ((HashMap.TreeNode<K, V>) p).putTreeVal(this, tab, hash, key, value);
            } else {
                for (int binCount = 0; ; binCount++) {
                    // 下一个为空
                    if ((e=p.next) == null) {
                        p.next = new Node(hash, key, value, null);
                        // TODO 长度>=8时，链表转换为数
//                        if (binCount >= TREEIFY_THRESHOLD - 1){
//                            treeifyBin(tab, hash);
//                        }
                        break;
                    }
                    // 和下一个相同
                    if (e.hash == hash &&
                            ((k=e.key) == key || (key!=null && key.equals(k)))) {
                        break;
                    }
                    // 继续找下一个
                    p = e;
                }
            }
            // 如果是已存在的元素
            if (e != null) {
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null) {
                    e.value = value;
                }
                afterNodeAccess(e);
                return oldValue;
            }

        }

        ++modCount;
        // 如果元素数目大于阈值
        if (++size > threshold) {
            resize();
        }
        afterNodeInsertion(evict);
        return null;
    }

    // Callbacks to allow LinkedHashMap post-actions
    void afterNodeAccess(Node<K,V> p) { }
    void afterNodeInsertion(boolean evict) { }
    void afterNodeRemoval(Node<K,V> p) { }

    private Node<K,V> newNode(int hash, K key, V value, Node<K,V> next) {
        return new Node(hash, key, value, next);
    }

    private Node<K,V>[] resize() {
        Node<K,V>[] oldTab = table;
        // 原容量
        int oldCap = oldTab == null ? 0 : oldTab.length;
        // 原阈值
        int oldThr = threshold;
        // 新容量和阈值
        int newCap, newThr = 0;
        if (oldCap>0) {
            if (oldCap > MAXIMUM_CAPACITY) {
                threshold = Integer.MAX_VALUE;
                return oldTab;
            } else if ((newCap=oldCap<<1) < MAXIMUM_CAPACITY && oldCap >= DEFAULT_INITIAL_CAPACITY) {
                newThr = oldThr << 1;
            }
        } else if (oldThr > 0) {
            newCap = oldThr;
        } else {
            newCap = DEFAULT_INITIAL_CAPACITY;
            newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
        }

        if (newThr == 0) {
            float ft = newCap * loadFactor;
            newThr = (newCap < MAXIMUM_CAPACITY && ft < MAXIMUM_CAPACITY ? (int)ft : Integer.MAX_VALUE);
        }

        threshold = newThr;
        Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];
        table = newTab;
        if (oldTab != null) {
            for (int j =0; j<oldCap; ++j) {
                Node<K,V> e;
                if ((e = oldTab[j]) == null) {
                  continue;
                }
                // 旧表格置空，方便GC回收
                oldTab[j] = null;
                if (e.next == null) {
                    newTab[e.hash & (newCap - 1)] = e;
                //TODO 红黑二叉树
//                } else if (e instanceof HashMap.TreeNode) {
//                    ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
                } else {
                    // 0 loHead:对应的头结点 loTail:遍历中指代的结点
                    Node<K,V> loHead = null, loTail = null;
                    // hash&length 不为0  hiHead:头结点 hiTail:遍历结点
                    Node<K,V> hiHead = null, hiTaill = null;
                    //当前遍历结点的下一个结点
                    Node<K,V> next;
                    // 遍历e
                    do {
                        // 记录下一个，方便下一步循环
                        next = e.next;
                        // 重新计算地址 因为扩容扩2倍，所以地址变化仅两种，
                        // 1.hash在oldCap的最高位上是0， 仍然在当前位置 (e.hash & oldCap) == 0
                        // 2.hash在oldCap的最高位上是1， 在j+oldCap位
                        // 因为计算位置是 e.hash & (cap-1)

                        if ((e.hash & oldCap) == 0) {
                            if (loTail == null) {
                                loHead = e;
                            } else {
                                loTail.next = e;
                            }
                            loTail = e;
                        } else {
                            if (hiTaill == null) {
                                hiHead = e;
                            } else {
                                hiTaill.next = e;
                            }
                            hiTaill = e;
                        }

                    } while ((e=next) != null);

                    if (loTail != null) {
                        loTail.next = null;
                        newTab[j] = loHead;
                    }
                }
            }
        }
        return newTab;
    }




    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }


}
