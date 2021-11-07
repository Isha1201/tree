package tree; 
import java.util.Scanner;
public class Treeuse {
	public static Treenode<Integer> takeinput(){
		System.out.println("Enter root of tree");
		Scanner s=new Scanner(System.in);
		int rootdata=s.nextInt();
		Treenode<Integer> root=new Treenode<Integer>(rootdata);
		Queuell<Treenode<Integer>> q=new Queuell<Treenode<Integer>>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Treenode<Integer> frontnode=q.poll();
			System.out.println("enter the number of children of "+frontnode.data+": ");
			
			int num=s.nextInt();
			for(int i=0;i<num;i++) {
				System.out.println("enter the "+(i+1) +"child of "+frontnode.data+": ");
				int childdata=s.nextInt();
				Treenode<Integer> childnode=new Treenode<Integer>(childdata);
				q.add(childnode);
				frontnode.children.add(childnode);
				
				
				
				
			}
			
		}
		
		return root;
		
		
		
		
		
	}
	public static void print(Treenode<Integer> root) {
		Queuell<Treenode<Integer>> q=new Queuell<Treenode<Integer>>();
		while(!q.isEmpty()) {
			q.poll();
			
		}
		Treenode<Integer> rootnode=root;
		q.add(rootnode);
		while(!q.isEmpty()) {
		Treenode<Integer> front=q.poll();
		System.out.print(front.data+": ");
		for(Treenode<Integer> node:front.children) {
			System.out.print(node.data+" ");
			q.add(node);
			
		}
		System.out.println();
		
		}
		
	}
	public static void main(String[] args) {
		
		Treenode<Integer> root=takeinput();
		print(root); 
	}

}
