package com.importdata.pojo;

import java.util.ArrayList;

import com.importdata.common.Mt;


public class Mt564 implements Mt {
	private ArrayList<VGenInfo> a ;
	private ArrayList<VGenInfoA1> a1;
	private ArrayList<VUnderlyingSec> b;
	private ArrayList<VUnderlyingSecB1> b1;
	private ArrayList<VUnderlyingSecB2>b2;
	private ArrayList<VIntermSec> c;
	private ArrayList<VActionDetail> d;
	private ArrayList<VActionOption> e;
	private ArrayList<VActionOptionE1>e1;
	private ArrayList<VActionOptionE1a> e1a;
	private ArrayList<VActionOptionE2> e2;
	private ArrayList<VAddInfo> f;
	
	
	
	public Mt564() {
		this.a = new ArrayList<VGenInfo>(1) ;
		this.a1 = new ArrayList<VGenInfoA1>();
		this.b = new ArrayList<VUnderlyingSec>();
		this.b1 = new ArrayList<VUnderlyingSecB1>();
		this.b2 = new ArrayList<VUnderlyingSecB2>();
		this.c = new ArrayList<VIntermSec>();
		this.d = new ArrayList<VActionDetail>();
		this.e = new ArrayList<VActionOption>();
		this.e1 = new ArrayList<VActionOptionE1>();
		this.e1a = new ArrayList<VActionOptionE1a>();
		this.e2 = new ArrayList<VActionOptionE2>();
		this.f = new ArrayList<VAddInfo>();
	}
	public VGenInfo getA() {
		return a.get(0);
	}
	public void setA(VGenInfo a) {
		this.a.add(a);
	}
	public ArrayList<VGenInfoA1> getA1() {
		return a1;
	}
	public void setA1(ArrayList<VGenInfoA1> a1) {
		this.a1 = a1;
	}
	public ArrayList<VUnderlyingSec> getB() {
		return b;
	}
	public void setB(ArrayList<VUnderlyingSec> b) {
		this.b = b;
	}
	public ArrayList<VUnderlyingSecB1> getB1() {
		return b1;
	}
	public void setB1(ArrayList<VUnderlyingSecB1> b1) {
		this.b1 = b1;
	}
	public ArrayList<VUnderlyingSecB2> getB2() {
		return b2;
	}
	public void setB2(ArrayList<VUnderlyingSecB2> b2) {
		this.b2 = b2;
	}
	public ArrayList<VIntermSec> getC() {
		return c;
	}
	public void setC(ArrayList<VIntermSec> c) {
		this.c = c;
	}
	public ArrayList<VActionDetail> getD() {
		return d;
	}
	public void setD(ArrayList<VActionDetail> d) {
		this.d = d;
	}
	public ArrayList<VActionOption> getE() {
		return e;
	}
	public void setE(ArrayList<VActionOption> e) {
		this.e = e;
	}
	public ArrayList<VActionOptionE1> getE1() {
		return e1;
	}
	public void setE1(ArrayList<VActionOptionE1> e1) {
		this.e1 = e1;
	}
	public ArrayList<VActionOptionE1a> getE1a() {
		return e1a;
	}
	public void setE1a(ArrayList<VActionOptionE1a> e1a) {
		this.e1a = e1a;
	}
	public ArrayList<VActionOptionE2> getE2() {
		return e2;
	}
	public void setE2(ArrayList<VActionOptionE2> e2) {
		this.e2 = e2;
	}
	public ArrayList<VAddInfo> getF() {
		return f;
	}
	public void setF(ArrayList<VAddInfo> f) {
		this.f = f;
	}
	public Integer getNum() {
		int num = a.size()+a1.size()+b.size()+b1.size()+b2.size()+c.size()+d.size()+e.size()+e1.size()+e2.size()+e1a.size()+f.size();
		return num;
	}
}
