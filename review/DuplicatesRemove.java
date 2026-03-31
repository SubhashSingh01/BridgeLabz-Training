import java.util.*;
public class DuplicatesRemove{
public static void main(String args[]){
int[] arr={1,2,2,3,4,5,5,6};
HashSet<Integer> hs=new HashSet<>();
for(int i=0;i<arr.length;i++)
{
if(hs.contains(arr[i]))
System.out.println(arr[i]);
else
hs.add(arr[i]);
}
}
}
