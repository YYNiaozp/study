package yyniao.creational.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/7/7 11:25 下午
 */

/*
    flyweight 享元

    定义： 运用共享技术有效地支持大量细粒度地对象

    优点： 节省资源

    源码：
        jdk：String， Integer， Long ...
        com.sun.org.apache.bcel.internal.generic.InstructionConstants

 */
public class Client {
    public static void main(String[] args) {
        new Node(3, 4, TreeFactory.getTree("aaa", "aaaaaaaaaaaaaaaa"));
        new Node(5, 4, TreeFactory.getTree("bbb", "bbbbbbbbbbbbbbbbb"));
        new Node(5, 4, TreeFactory.getTree("bbb", "bbbbbbbbbbbbbbbbb"));
    }
}

class Node {
    private int x;
    private int y;
    private Tree tree;

    public Node(int x, int y, Tree tree) {
        this.x = x;
        this.y = y;
        this.tree = tree;
    }
}

class TreeFactory {
    private static Map<String, Tree> map = new ConcurrentHashMap<>();

    public static Tree getTree(String name, String data) {
        if (map.containsKey(name)) {
            return map.get(name);
        } else {
            Tree tree = new Tree(name, data);
            map.put(name, tree);
            return tree;
        }
    }
}

class Tree {
    private final String name;
    private final String data;

    public Tree(String name, String data) {
        System.out.println("\'" + name + "\'" + " created");
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }
}
