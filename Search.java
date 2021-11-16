/*  Create an int array of size 5, initialize it with values(10,20,30,40,50). Create a public boolean search(int arr[], int search_element) this method will return true if the search element is present in the array else it will  
print a message "element not found" */


class Array
{
    public Boolean search(int[] arr, int num)
    {
        int mid,f=0,l,m;
        l=0; m= arr.length-1;
        mid = (l+m)/2;

        while(l<m) {
            if (num == arr[mid]) {
                f = 1;
                break;
            }
            if (num > arr[mid]) {
                l = mid+1;
                mid = (l + m) / 2;
            }
            if (num < arr[mid]) {
                m = mid-1;
                mid = (l + m) / 2;
            }
        }

        if (f==1)
            return true;
        else {
            System.out.println("element "+ num + " not found");
            return false;
        }
    }
}


public class Search {
    public static void main(String[] args) {
        Array a = new Array();
        int[] arr = {10,20,30,40,50};

        System.out.println("Result: " + a.search(arr,40));
        System.out.println("Result: " + a.search(arr,100));
    }
}
