// removing last element of the list and inserting the first removed in the starting, second removed in
// 2nd position, 3rd removed in 3rd position etc. defined bt value of k.
import java.util.*;
public class arraylist
{
    public static void printRotations(ArrayList<Integer> list,int k)
    {
        System.out.println(list);
        for(int i=0; i<k;i++)
        {
        int val=list.get(list.size()-1);
        list.add(i,val);
        list.remove(list.size()-1);
        System.out.println(list);

        }
    }
    public static void main(String[] args)
    {
        int k=3;
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        printRotations(list,k);
    }
}