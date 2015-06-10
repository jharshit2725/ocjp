package com.hash.ocjp.statics;

public class RedefineNotOverrideSub extends RedefineNotOverride {

	static void doStuff(){
		System.out.println('b');
	}
	public static void main(String[] args) {
		RedefineNotOverride [] overrides={new RedefineNotOverride(),
				new RedefineNotOverrideSub(),new RedefineNotOverride()};
		
		for (int x=0;x<overrides.length;x++){
			overrides[x].doStuff();
		}
		
		RedefineNotOverrideSub overrideSub=new RedefineNotOverrideSub();
		overrideSub.doStuff();
//		RedefineNotOverrideSub [] overridesSub={(RedefineNotOverrideSub) new RedefineNotOverride(),
//				new RedefineNotOverrideSub(),(RedefineNotOverrideSub) new RedefineNotOverride()};
//		
//		for (int x=0;x<overrides.length;x++){
//			overridesSub[x].doStuff();
//		}
	}
}
