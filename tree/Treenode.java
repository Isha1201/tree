package tree;
import java.util.*;
public class Treenode <T>{
	T data;
	ArrayList<Treenode<T>> children;
	public Treenode(T data){
		this.data=data;
		children=new ArrayList<>();
	}

}
