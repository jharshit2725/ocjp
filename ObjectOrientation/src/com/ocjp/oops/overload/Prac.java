package com.ocjp.oops.overload;

class A { }
 class B extends A { }
 public class Prac {
 static String s = "-";
 public static void main(String[] args) {
 A[] aa = new A[2];
 B[] ba = new B[2];
sifter(aa);
 sifter(ba);
 sifter();
 System.out.println(s);
 }
 static void sifter(A[]... a2) { s += "1"; }  //var arg overloaded method is chosen at last
static void sifter(B[]... b) { s += "2"; }
 static void sifter(B[] b) { s += "3"; }
 static void sifter(Object o) { s += "4"; }
 }
