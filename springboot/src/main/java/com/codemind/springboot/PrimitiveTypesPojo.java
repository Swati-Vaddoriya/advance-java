package com.codemind.springboot;

import java.util.*;

public class PrimitiveTypesPojo {
	ArrayList<Integer> list;
	HashSet<Integer> set;
	HashMap<String, String> map;

	public ArrayList<Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

	public HashSet<Integer> getSet() {
		return set;
	}

	public void setSet(HashSet<Integer> set) {
		this.set = set;
	}

	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "PrimitiveTypesPojo [list=" + list + ", set=" + set + ", map=" + map + "]";
	}

	public PrimitiveTypesPojo(ArrayList<Integer> list, HashSet<Integer> set, HashMap<String, String> map) {
		super();
		this.list = list;
		this.set = set;
		this.map = map;
	}

	public PrimitiveTypesPojo() {
		super();
	}

}
