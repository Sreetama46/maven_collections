package com.project.collections_;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataList<Integer> list = new DataList<Integer>();
		 
        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
         
        //Remove elements from index
        list.remove(2);
        System.out.println(list);
         
        //Get element with index
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
 
        //List Size
        System.out.println(list.size());
	}

}
