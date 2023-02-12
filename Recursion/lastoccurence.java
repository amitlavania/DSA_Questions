import java.util.*;
class lastoccurence{
public static int lastoccurence(int arr[],int  key,int i)
{
    if(i==arr.length)
    {
        return -1;
    }
    int isFound=lastoccurence(arr,key,i+1);
    if(isFound==-1 && arr[i]==key)
    {
        return i;
    }
    return isFound;
}
public static void main (String[] args)
{
    int[] arr={5,4,3,27,5};
    System.out.println(lastoccurence(arr,5,0));
}
}

