package practice;

public class gasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int gas[] = {2,3,4};
		int cost[] = {3,4,3};
		for(int i=0;i<gas.length;i++) {
			if(gas[i]>=cost[i]) {
//				System.out.print(gas[i]+"  "+ cost[i]);
				
				int x=i;
				int count=gas.length;
				boolean res=false;
				int gasAval=0;
				for(int j=0;j<gas.length;j++) {
					 gasAval+=gas[x];
					gasAval-=cost[x];
					
					if(gasAval<0) {
						return;
					}
				
					
					x+=1;
					
					count--;
					x%=gas.length;
					if(gasAval>=0&& count==0) {
						res=true;
					}
				}
				if(res==true) {
					System.out.println(i);
				}else {
					System.out.println("-1");
				}
		}
	}

}}
